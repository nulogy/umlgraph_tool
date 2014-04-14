# Simple utility to extract out all of the driver supports relationships.

dir = "/Users/alistair/src/packmanager/dev/domain/icg/icg/drivers"

Dir.foreach(dir) do |filename|
  if filename.match('rb$')
    @driver_classname = nil
    @rule_fragment = nil

    File.open("#{dir}/#{filename}", "r").each_line do |line|
      @driver_classname = $1 if line.match('class (\w+) < Driver')
      @rule_fragment = $1 if line.match('fragment.driver == (.*)')
    end

    unless @driver_classname.nil? || @rule_fragment.nil?
      puts "#{@driver_classname}\t#{@rule_fragment}"
    end
  end
end
