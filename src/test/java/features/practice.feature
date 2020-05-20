Feature: Search and place order for Vegetables

@RegTests
Scenario: Search for vegetables and validate result
Given User is on greenkart landing page
When user search for "Cucumber" vegetable
Then "Cucumber" result is displayed


@SmokeTests
Scenario: Search for vegetables and add to cart
Given User is on greenkart landing page
When user search for "Cucumber" vegetable
And "Cucumber" result is displayed
And Add "3" quantities to the cart
Then validate the cart with "3" items