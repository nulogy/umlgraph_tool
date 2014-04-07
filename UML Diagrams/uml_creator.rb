require 'erb'

class Keywords

  def node_fill_color(color)
    "@opt nodefillcolor #{color}"
  end

  def get_binding
    binding
  end

end

class UmlCreator

  def initialize(filename)
    @filename = filename
  end

  def create
    keywords = Keywords.new
    template_file = File.open(@filename, 'r').read
    erb = ERB.new(template_file)
    File.open(output_filename, 'w+') { |file| file.write(erb.result(keywords.get_binding)) }
  end

  private

  def output_filename
    @filename.gsub(/.erb/, '')
  end

end

creator = UmlCreator.new('IcgRoot.erb.java')
creator.create

system('./umlgraph IcgRoot png')
