require 'erb'
require 'yaml'

class UmlCreator
  def initialize(args)
    @groups = YAML.load_file(args[:template_filename])
    @output_filename = args[:output_filename]
  end

  def create
    template = read_file('src/template.erb')
    rendered = render_template(template)
    write_file(@output_filename, rendered)
  end

  private

  def read_file(filename)
    File.open(filename, 'r').read
  end

  def render_template(template)
    ERB.new(template).result(binding)
  end

  def write_file(filename, contents)
    File.open(filename, 'w+') { |file| file.write(contents) }
  end
end
