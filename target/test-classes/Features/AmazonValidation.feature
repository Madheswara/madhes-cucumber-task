#Author: your.madhes@your.domain.com

@amaz
Feature: validation of purchase product in electronics module
@amaz
  Scenario: 
     Given login the webpage 
    When search the headphones by list
    | sony headphones | boss headphones |
    And sortby high to low
    But windows handling
    But validation of details of features 
    Then take screenshot of the page
