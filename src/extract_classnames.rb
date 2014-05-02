# Simple utility to extract out all of the classnames from the IcgRoot diagram specification.

File.open("templates/IcgRoot.java.erb", "r").each_line do |line|
  puts "\n# #{$1}" if line.match('// ([a-zA-Z].*)')
  puts "#{$1}: true" if !line.match('(IcgRoot)|(UMLOptions)') && line.match('class (\w+)')
end
