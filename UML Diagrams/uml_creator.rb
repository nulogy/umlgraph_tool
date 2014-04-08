require 'erb'

class Keywords

  def initialize
    @options = {
      :color => {
        :base => 'lightgray',
        :domain => 'lightyellow',
        :drivers => 'lightcoral',
        :interpreters => 'gold',
        :rules => 'lightblue',
        :scopes => 'violet',
        :sync => 'khaki',
        :transitions => 'cyan',
        :validators => 'palegreen'
      },

      :hidden => {
        :concrete_drivers => true,
        :concrete_scopes => true,
        :concrete_validators => true,
        :sync => true,
        :wizard => true
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
