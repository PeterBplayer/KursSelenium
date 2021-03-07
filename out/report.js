$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Features/my-store-registration.feature");
formatter.feature({
  "line": 1,
  "name": "my store registration",
  "description": "",
  "id": "my-store-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user can register with proper data",
  "description": "",
  "id": "my-store-registration;user-can-register-with-proper-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user inputs title \u003cfirstName\u003e, \u003clastName\u003e, \u003cemail\u003e, \u003cpassword\u003e, \u003cbirthDate\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks Save button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is registered",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "my-store-registration;user-can-register-with-proper-data;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "password",
        "birthDate"
      ],
      "line": 10,
      "id": "my-store-registration;user-can-register-with-proper-data;;1"
    },
    {
      "cells": [
        "Karol",
        "Kowolczyk",
        "karol.kowolczyk@mail.com",
        "12354",
        "11/09/1990"
      ],
      "line": 11,
      "id": "my-store-registration;user-can-register-with-proper-data;;2"
    },
    {
      "cells": [
        "Bartosz",
        "Piętas",
        "bart.pietas@mail.com",
        "12345",
        "11/12/1990"
      ],
      "line": 12,
      "id": "my-store-registration;user-can-register-with-proper-data;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "user can register with proper data",
  "description": "",
  "id": "my-store-registration;user-can-register-with-proper-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user inputs title Karol, Kowolczyk, karol.kowolczyk@mail.com, 12354, 11/09/1990",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks Save button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is registered",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStoreRegistration.goToRegistrationPage()"
});
formatter.result({
  "duration": 6505923400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Karol",
      "offset": 18
    },
    {
      "val": "Kowolczyk",
      "offset": 25
    },
    {
      "val": "karol.kowolczyk@mail.com",
      "offset": 36
    },
    {
      "val": "12354",
      "offset": 62
    },
    {
      "val": "11/09/1990",
      "offset": 69
    }
  ],
  "location": "MyStoreRegistration.userInputs(String,String,String,String,String)"
});
formatter.result({
  "duration": 456510800,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreRegistration.Submit()"
});
formatter.result({
  "duration": 1067649400,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreRegistration.userIsRegistered()"
});
formatter.result({
  "duration": 54700,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "user can register with proper data",
  "description": "",
  "id": "my-store-registration;user-can-register-with-proper-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user inputs title Bartosz, Piętas, bart.pietas@mail.com, 12345, 11/12/1990",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks Save button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is registered",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStoreRegistration.goToRegistrationPage()"
});
formatter.result({
  "duration": 4217421700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bartosz",
      "offset": 18
    },
    {
      "val": "Piętas",
      "offset": 27
    },
    {
      "val": "bart.pietas@mail.com",
      "offset": 35
    },
    {
      "val": "12345",
      "offset": 57
    },
    {
      "val": "11/12/1990",
      "offset": 64
    }
  ],
  "location": "MyStoreRegistration.userInputs(String,String,String,String,String)"
});
formatter.result({
  "duration": 405233100,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreRegistration.Submit()"
});
formatter.result({
  "duration": 1332087200,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreRegistration.userIsRegistered()"
});
formatter.result({
  "duration": 30800,
  "status": "passed"
});
});