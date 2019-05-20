# umlgraph_tool

Create UML diagrams rapidly.

## Quick Start

    brew cask install java
    brew install graphviz
    git clone https://github.com/amckinnell/umlgraph_tool
    cd umlgraph_tool
    rake


## Usage

To generate a single diagram:`./exe/generate ProductDomain`


## To Generate All Diagrams

1. Define your UML diagram in a YAML file in the 'templates' folder
2. Run `rake`
3. View the generated graph in the `out` folder


## Reference

[Colors](http://www.graphviz.org/doc/info/colors.html)

[Tags](http://www.spinellis.gr/umlgraph/doc/cd-model.html)
