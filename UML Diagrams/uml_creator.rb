require 'erb'

class UmlCreator

  def initialize(filename)
    @filename = filename
  end

  def create
    template_file = File.open(@filename, 'r').read
    erb = ERB.new(template_file)
    File.open(output_filename, 'w+') { |file| file.write(erb.result) }
  end

  private

  def output_filename
    @filename.gsub(/.erb/, '')
  end

end

creator = UmlCreator.new('IcgRoot.erb.java')
creator.create

system('./umlgraph IcgRoot png')
