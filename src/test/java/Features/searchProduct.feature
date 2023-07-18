Feature: Search and Place the order for Products

Scenario: Search Experience for product search in both gome Offers page

Given User is on GreenCart Landing Page
When user searched with shortname "Tom" and extracted actual name of project
Then user searched for "Tom" shortname in offers page to check if product exist with same name
And validate product name in offers page matches with Landing Page