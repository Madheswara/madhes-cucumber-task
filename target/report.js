$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/et/eclipse-workspace/CuProject2/src/test/resources/Features/FlipkartValidation.feature");
formatter.feature({
  "name": "validation of purchase product in electronics module",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@flip"
    }
  ]
});
formatter.scenarioOutline({
  "name": "headphone add to cart validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@flip"
    }
  ]
});
formatter.step({
  "name": "login to the page",
  "keyword": "Given "
});
formatter.step({
  "name": "search the headphones by outline \"\u003cheadphones\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "select sortby high to low",
  "keyword": "And "
});
formatter.step({
  "name": "select product and switch window",
  "keyword": "But "
});
formatter.step({
  "name": "validation of details",
  "keyword": "But "
});
formatter.step({
  "name": "take screenshot",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "headphones"
      ]
    },
    {
      "cells": [
        "boss headphones"
      ]
    }
  ]
});
formatter.scenario({
  "name": "headphone add to cart validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@flip"
    },
    {
      "name": "@flip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login to the page",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartValidationSetup.login_to_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search the headphones by outline \"boss headphones\"",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartValidationSetup.search_the_headphones_by_outline(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select sortby high to low",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartValidationSetup.select_sortby_high_to_low()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select product and switch window",
  "keyword": "But "
});
formatter.match({
  "location": "FlipkartValidationSetup.select_product_and_switch_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validation of details",
  "keyword": "But "
});
formatter.match({
  "location": "FlipkartValidationSetup.validation_of_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "take screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartValidationSetup.take_screenshot()"
});
formatter.result({
  "status": "passed"
});
});