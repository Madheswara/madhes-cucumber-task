
#Author: your.madhes@your.domain.com
@flip
Feature: validation of purchase product in electronics module
@flip
  Scenario Outline: headphone add to cart validation
    Given login to the page
    When search the headphones by outline "<headphones>"
    And select sortby high to low
    But select product and switch window
    But validation of details 
    Then take screenshot

    Examples: 
      |headphones|
      |boss headphones|
