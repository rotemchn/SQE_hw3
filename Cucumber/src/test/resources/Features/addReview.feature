Feature: feature to test adding a review functionality

  Scenario:  Validate adding a review is working

    Given browser is open
    And user is logged in to simplCommerce
    And user is on a product's page
    And user purchases a product
    And user clicks on Add Review
    When user enters a text in review box
    And hits add
    Then user's review is added to the product's reviews
