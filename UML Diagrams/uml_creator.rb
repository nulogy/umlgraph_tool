require 'erb'

class UmlCreator

  def initialize(filename)
    @f = File.open(filename)
  end

  def create
    template_file = File.open(@f, 'r').read
    erb = ERB.new(template_file)
    File.open('IcgRoot.java', 'w+') { |file| file.write(erb.result) }
  end

end

creator = UmlCreator.new('IcgRoot.erb.java')
creator.create
