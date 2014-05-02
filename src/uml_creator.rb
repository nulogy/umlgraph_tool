require 'erb'
require 'yaml'

class Keywords
  def initialize(args)
    @diagram = YAML.load_file(args[:diagram])
    @colors = YAML.load_file(args[:colors])
    @show = YAML.load_file(args[:show])
  end

  def bind
    binding
  end

  def diagram_options
    @diagram['diagram'].map { |k| "@opt #{k}" }.join("\n * ")
  end

  def node_fill_color(color_key)
    "@opt nodefillcolor #{color_option(color_key)}"
  end

  def show?(classname)
    "@hidden" unless @show[classname]
  end

  private

  def color_option(color_key)
    @colors.fetch(color_key.to_s, 'white')
  end
end

class UmlCreator
  def initialize(args)
    @args = args
  end

  def create
    template = read_file(@args[:template_filename])
    rendered = render_template(template)
    write_file(@args[:output_filename], rendered)
  end

  private

  def read_file(filename)
    File.open(filename, 'r').read
  end

  def render_template(template)
    ERB.new(template).result(Keywords.new(@args).bind)
  end

  def write_file(filename, contents)
    File.open(filename, 'w+') { |file| file.write(contents) }
  end
end
