$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("practice.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order for Vegetables",
  "description": "",
  "id": "search-and-place-order-for-vegetables",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search for vegetables and validate result",
  "description": "",
  "id": "search-and-place-order-for-vegetables;search-for-vegetables-and-validate-result",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@RegTests"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on greenkart landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user search for \"Cucumber\" vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Cucumber\" result is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefintions.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "duration": 10378596500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 17
    }
  ],
  "location": "stepDefintions.user_search_for_something_vegetable(String)"
});
formatter.result({
  "duration": 2257095100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "stepDefintions.something_result_is_displayed(String)"
});
formatter.result({
  "duration": 74802000,
  "status": "passed"
});
formatter.after({
  "duration": 113310400,
  "status": "passed"
});
});