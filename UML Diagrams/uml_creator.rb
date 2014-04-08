require 'erb'

class Keywords

  def initialize
    @options = {
      :color => {
        :base => 'lightgray',
        :domain => 'lightyellow',
        :drivers => 'lightcoral',
        :interpreters => 'wheat',
        :rules => 'lightblue',
        :scopes => 'violet',
        :sync => 'khaki',
        :transition => 'chartreuse',
        :validators => 'palegreen'
      },

      :hidden => {
        :concrete_drivers => false,
        :concrete_validators => false
      }
    }
  end

  def bind
    binding
  end

  def node_fill_color(color_key)
    "@opt nodefillcolor #{@options[:color][color_key]}"
  end

  def show(visibility_key)
    "@hidden" if @options[:hidden][visibility_key]
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
