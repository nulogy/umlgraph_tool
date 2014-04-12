require 'erb'
require 'yaml'

class Keywords

  def initialize
    @diagram = YAML.load_file('diagram.yml')
    @colors = YAML.load_file('colors.yml')
    @show = YAML.load_file('show_all.yml')
  end

  def bind
    binding
  end

  def diagram_options
    @diagram.map { |k| "@opt #{k}" }.join("\n * ")
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

  def initialize(filename)
    @filename = filename
  end

  def create
    erb = ERB.new(template_file)
    File.open(output_filename, 'w+') { |file| file.write(erb.result(Keywords.new.bind)) }
  end

  private

  def output_filename
    @filename.gsub(/.erb/, '')
  end

  def template_file
    File.open(@filename, 'r').read
  end

end

UmlCreator.new('IcgRoot.java.erb').create

system('./umlgraph IcgRoot png')
