Feature: Purchase Functionality of Demoblaze Application
  As a buyer, I should be able navigate through products
  so that I can purchase from application online

  @wip
  Scenario: Adding product to cart
    Given buyer is on the homepage of demoblaze
    When buyer adds from "Laptops" category "Sony vaio i5" product to cart
    And buyer clicks on "Cart" link
    Then buyer should se "Sony vaio i5" is added to cart












    # using "" marks make the word a variable that you can put any word in it later
  # this called 'parameterize'