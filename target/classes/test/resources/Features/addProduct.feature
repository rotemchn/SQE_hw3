Feature: feature to test adding a product functionality

  Scenario:  Validate adding a product is working

    Given a browser is open
    And an admin is logged in to simplCommerce
    And an admin is on a dashboard page
    And an admin clicks on Catalog -> Products
    And admin clicks on create Product
    And admim fills product's name
    When admin clicks save
    Then product is added