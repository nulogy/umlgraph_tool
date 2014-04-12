require 'erb'
require 'yaml'

class Keywords

  def initialize
    @options = YAML.load_file('config.yml')
  end

  def bind
    binding
  end

  def diagram_options
    @options['diagram'].map { |k| "@opt #{k}" }.join("\n * ")
  end

  def node_fill_color(color_key)
    "@opt nodefillcolor #{color_option(color_key)}"
  end

  def show(visibility_key)
    "@hidden" unless visibility_option(visibility_key)
  end

  private

  def color_option(color_key)
    @options['color'].fetch(color_key.to_s, 'white')
  end

  def visibility_option(visibility_key)
    @options['visible'].fetch(visibility_key.to_s, true)
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
