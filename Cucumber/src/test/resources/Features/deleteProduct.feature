Feature: feature to test deleting a product functionality

  Scenario:  Validate deleting a product is working

    Given the browser is open
    And admin is logged in to simplCommerce
    And admin is on a dashboard page
    And admin clicks on Catalog -> Products
    When admin clicks on delete
    Then product is deleted
