$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Features/add-new-address.feature");
formatter.feature({
  "line": 1,
  "name": "Add new shipping address",
  "description": "",
  "id": "add-new-shipping-address",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User can additional shipping address",
  "description": "",
  "id": "add-new-shipping-address;user-can-additional-shipping-address",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to my-store",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to Your Account page clicks Addresses and then click Create new address",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User inputs \u003calias\u003e, \u003caddress\u003e, \u003czip\u003e, \u003ccity\u003e, \u003ccountry\u003e, \u003cphone\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User submits new address",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User will see \"Address successfully added!\" and \u003calias\u003e, \u003caddress\u003e, \u003czip\u003e, \u003ccity\u003e, \u003ccountry\u003e, \u003cphone\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "add-new-shipping-address;user-can-additional-shipping-address;",
  "rows": [
    {
      "cells": [
        "alias",
        "address",
        "zip",
        "city",
        "country",
        "phone"
      ],
      "line": 11,
      "id": "add-new-shipping-address;user-can-additional-shipping-address;;1"
    },
    {
      "cells": [
        "Firma",
        "Onions 12",
        "11-111",
        "Londek",
        "United Kingdom",
        "111111111"
      ],
      "line": 12,
      "id": "add-new-shipping-address;user-can-additional-shipping-address;;2"
    },
    {
      "cells": [
        "Dacza",
        "Burbon 12",
        "01-001",
        "Leeds",
        "United Kingdom",
        "111111111"
      ],
      "line": 13,
      "id": "add-new-shipping-address;user-can-additional-shipping-address;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "User can additional shipping address",
  "description": "",
  "id": "add-new-shipping-address;user-can-additional-shipping-address;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to my-store",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to Your Account page clicks Addresses and then click Create new address",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User inputs Firma, Onions 12, 11-111, Londek, United Kingdom, 111111111",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User submits new address",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User will see \"Address successfully added!\" and Firma, Onions 12, 11-111, Londek, United Kingdom, 111111111",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "NewAddressSteps.userIsLoggedInToMyStore()"
});
formatter.result({
  "duration": 6433200400,
  "status": "passed"
});
formatter.match({
  "location": "NewAddressSteps.userGoesToCreateNewAddressForm()"
});
formatter.result({
  "duration": 1053942400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Firma",
      "offset": 12
    },
    {
      "val": "Onions 12",
      "offset": 19
    },
    {
      "val": "11-111",
      "offset": 30
    },
    {
      "val": "Londek",
      "offset": 38
    },
    {
      "val": "United Kingdom",
      "offset": 46
    },
    {
      "val": "111111111",
      "offset": 62
    }
  ],
  "location": "NewAddressSteps.userInputsAliasAddressZipCityCountryPhone(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 536138600,
  "status": "passed"
});
formatter.match({
  "location": "NewAddressSteps.userSubmitsNewAddress()"
});
formatter.result({
  "duration": 711422400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address successfully added!",
      "offset": 15
    },
    {
      "val": "Firma",
      "offset": 48
    },
    {
      "val": "Onions 12",
      "offset": 55
    },
    {
      "val": "11-111",
      "offset": 66
    },
    {
      "val": "Londek",
      "offset": 74
    },
    {
      "val": "United Kingdom",
      "offset": 82
    },
    {
      "val": "111111111",
      "offset": 98
    }
  ],
  "location": "NewAddressSteps.userWillSeeConfirmationAndNewAddress(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 757757400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User can additional shipping address",
  "description": "",
  "id": "add-new-shipping-address;user-can-additional-shipping-address;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to my-store",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to Your Account page clicks Addresses and then click Create new address",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User inputs Dacza, Burbon 12, 01-001, Leeds, United Kingdom, 111111111",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User submits new address",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User will see \"Address successfully added!\" and Dacza, Burbon 12, 01-001, Leeds, United Kingdom, 111111111",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "NewAddressSteps.userIsLoggedInToMyStore()"
});
formatter.result({
  "duration": 5542265600,
  "status": "passed"
});
formatter.match({
  "location": "NewAddressSteps.userGoesToCreateNewAddressForm()"
});
formatter.result({
  "duration": 1030460400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dacza",
      "offset": 12
    },
    {
      "val": "Burbon 12",
      "offset": 19
    },
    {
      "val": "01-001",
      "offset": 30
    },
    {
      "val": "Leeds",
      "offset": 38
    },
    {
      "val": "United Kingdom",
      "offset": 45
    },
    {
      "val": "111111111",
      "offset": 61
    }
  ],
  "location": "NewAddressSteps.userInputsAliasAddressZipCityCountryPhone(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 526041100,
  "status": "passed"
});
formatter.match({
  "location": "NewAddressSteps.userSubmitsNewAddress()"
});
formatter.result({
  "duration": 442903000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address successfully added!",
      "offset": 15
    },
    {
      "val": "Dacza",
      "offset": 48
    },
    {
      "val": "Burbon 12",
      "offset": 55
    },
    {
      "val": "01-001",
      "offset": 66
    },
    {
      "val": "Leeds",
      "offset": 74
    },
    {
      "val": "United Kingdom",
      "offset": 81
    },
    {
      "val": "111111111",
      "offset": 97
    }
  ],
  "location": "NewAddressSteps.userWillSeeConfirmationAndNewAddress(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 733248200,
  "status": "passed"
});
});