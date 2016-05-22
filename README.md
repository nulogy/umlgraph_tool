# umlgraph_tool

Create UML diagrams rapidly.

## Quickstart

    # Ensure Java is up to date (at least Java 7).

    brew install graphviz
    git clone https://github.com/jchunky/umlgraph_tool
    cd umlgraph_tool
    rake

## Usage

1. Define your UML diagram in a YAML file in the 'templates' folder.
2. Run `rake`.
3. View the generated graph in the `out` folder.

## Tips

To generate a single diagram use `generate ProductDomain`

Note: the generate command is defined as: `rake "generate[ProductionDomain]" && open ./out/ProductionDomain.png`


## Reference

[Colors](http://www.graphviz.org/doc/info/colors.html)

[Tags](http://www.umlgraph.org/doc/cd-model.html)
