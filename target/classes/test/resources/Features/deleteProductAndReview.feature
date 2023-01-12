Feature: feature to test 2 stories functionality

  Scenario:  Validate adding a review is working

    Given browser is open
    And user is logged in to simplCommerce
    And user is on a product's page
    And user purchases a product
    And user clicks on Add Review
    When user enters a text in review box
    And hits add
    Then user's review is added to the product's reviews

  Scenario:  Validate deleting a product is working

    Given the browser is open
    And admin is logged in to simplCommerce
    And admin is on a dashboard page
    And admin clicks on Catalog -> Products
    When admin clicks on delete
    Then product is deleted