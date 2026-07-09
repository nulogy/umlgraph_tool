## UML Graph Tool

Create UML diagrams rapidly.

### Quick Start

    brew install graphviz
    git clone git@github.com:nulogy/umlgraph_tool.git
    cd umlgraph_tool
    mise install
    rake

`mise install` provisions the Ruby and JDK pinned in `mise.toml` — no system Java or
manual symlink needed.

UMLGraph's doclet uses the `com.sun.javadoc` API that Oracle removed in JDK 13, so it needs
JDK 11 (the newest release that still supports it). That is why `mise.toml` pins JDK 11
rather than a current release.


### Usage

To generate a single diagram: `./exe/generate ProductDomain`


### To Generate All Diagrams

1. Define your UML diagram in a YAML file in the `templates/` folder
2. Run `rake`
3. View the generated UML diagrams in the `out` folder


### References

[UMLGraph](https://www.spinellis.gr/umlgraph/) is the original project that this project is based on

[Colours](http://www.graphviz.org/doc/info/colors.html) that you can use in your templates

[Tags](http://www.spinellis.gr/umlgraph/doc/cd-model.html) are used to specify your UML diagram
