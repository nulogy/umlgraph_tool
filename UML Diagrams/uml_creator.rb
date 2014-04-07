require 'erb'

class Keywords

  def node_fill_color(color)
    "@opt nodefillcolor #{color}"
  end

  def bind
    binding
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

creator = UmlCreator.new('IcgRoot.erb.java')
creator.create

system('./umlgraph IcgRoot png')
