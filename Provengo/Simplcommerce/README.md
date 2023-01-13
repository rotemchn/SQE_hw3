# SQE_hw3

# Simplcommerce


Provnego project for spec-ing and testing my system.


## Important Files

* README.md This file.
* [config](config) Configuration files and administrative data.
    * [provengo.yml](config/Provengo.yml) Main Configuration file
* [spec](spec) The code creating the specification space lives here. Organized by language.
    * [js](spec/js) JavaScript files
* [meta-spec](meta-spec) Code for working with the specification space
    * [ensemble-code.js](meta-spec/ensemble-code.js) Sample code for generating test optimized test suites (ensembles)
    * [book-writer.js](meta-spec/book-writer.js) Sample code for generating test books
    * [script-writer.js](meta-spec/script-writer.js) Code for generating test scripts.
* [lib](lib) Place to store JavaScript libraries. Loaded first.
* [data](data) Place to store data files. Loaded second (so you can use library code to in your data).
    * [data.js](data/data.js) Sample data file.


## Useful Commands

⚠️ NOTE: In the below listings, we assume that `provengo` is in the system's PATH variable, and that `Simplcommerce` is the (relative/absolute) path to this directory.

For full documentation go to [https://docs.provengo.tech](https://docs.provengo.tech).

### Randomized Run 

Perform a single run through the specification. Good for "Sanity checks", i.e. to see examples of what can happen.

    provengo run Simplcommerce


### Visualize the Spec

Draw the specification in a PDF file.

    provengo analyze -f pdf Simplcommerce


⚠️ NOTE: This requires [Graphviz](http://graphviz.org) to be installed.


### Sample Runs from the Spec

Sample 10 scenarios into a file. The scenarios are stored in a file called `samples.json` (this can be changed using the `-o`/`--output-file` switch).

    provengo sample --delete-previous --sample-size 10 Simplcommerce


### Create an Optimized Test Suite

Generate a test suite of 5 tests that provides a good coverage of items in the [GOALS](z-ranking.js#L18) array.

**Requires running `sample` first** (the previous command)**.**

    provengo ensemble --suite-size 5 Simplcommerce

#### Visualize the Spec and the Suite

Draw the specification, and highlight the traces in the optimized test suite create by the previous command.

    provengo analyze -f pdf --highlight-file ensemble.json Simplcommerce

### Create Test Scripts for Third Party Systems

Converts the runs in `ensemble.json` to automation test scripts.

    provengo gen-scripts -s ensemble.json Simplcommerce
