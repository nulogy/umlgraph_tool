## UML Graph Tool

Create UML diagrams rapidly.

### Quick Start

    brew cask install java
    brew install graphviz
    git clone git@github.com:nulogy/umlgraph_tool.git
    cd umlgraph_tool
    rake


### Usage

To generate a single diagram:`./exe/generate ProductDomain`


### To Generate All Diagrams

1. Define your UML diagram in a YAML file in the 'templates' folder
2. Run `rake`
3. View the generated graph in the `out` folder


### References

[UMLGraph](https://www.spinellis.gr/umlgraph/) is the original project that this project is based on

[Colors](http://www.graphviz.org/doc/info/colors.html) that you can use in your templates

[Tags](http://www.spinellis.gr/umlgraph/doc/cd-model.html) are used to specify your UML diagram
