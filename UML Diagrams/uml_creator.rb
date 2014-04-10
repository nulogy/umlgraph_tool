require 'erb'
require 'yaml'

class Keywords

  def initialize
    @options = YAML.load_file('config.yml')
  end

  def bind
    binding
  end

  def node_fill_color(color_key)
    "@opt nodefillcolor #{color_option(color_key)}"
  end

  def show(visibility_key)
    "@hidden" unless visibility_option(visibility_key)
  end

  private

  def color_option(color_key)
    @options[:color.to_s][color_key.to_s]
  end

  def visibility_option(visibility_key)
    @options[:visible.to_s][visibility_key.to_s]
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
