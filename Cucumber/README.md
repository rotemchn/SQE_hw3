# SQE_hw3

# Testing Simplcommerce using Cucumber
This directory contains the cucumber files for testing the cart module of the Simplcommerce application.

## Running the tests
Run ```mvn test``` to run all the tests.

## Feature files
The behaviors that we tested are in the feature files that inside the [resources/Features](src/test/resources/Features) directory. See the files for a detailed description of the tests.
We have one feature file that adds a product, and the other feature file has two scenarios according to the stories we described in [here](https://github.com/rotemchn/SQE_hw3#what-we-tested). The add product feature is because in order to delete a product and review a product, we have to have a product :)
We recommend from the IDE run the [add product](src/test/resources/Features/addProduct.feature), and then run the [delete a product and review product](src/test/resources/Features/deleteProductAndReview.feature)

## Step files
The step files in the [stepDefinitions](src/test/java/stepDefinitions) directory contain the code that defines how each sentence in the feature files is translated to Selenium actions. See the files for a detailed description of the implementation.
