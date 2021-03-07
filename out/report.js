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
  "name": "user inputs \u003ctitle\u003e, \u003cfirstName\u003e, \u003clastName\u003e, \u003cemail\u003e, \u003cpassword\u003e, \u003cbirthDate\u003e",
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
        "title",
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
        "Mr.",
        "Andrzej",
        "Kowolczyk",
        "andrzej.kowolczyk@mail.com",
        "12354",
        "11/09/1990"
      ],
      "line": 11,
      "id": "my-store-registration;user-can-register-with-proper-data;;2"
    },
    {
      "cells": [
        "Mrs.",
        "Barbara",
        "Piętas",
        "barbara.pietas@mail.com",
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
  "name": "user inputs Mr., Andrzej, Kowolczyk, andrzej.kowolczyk@mail.com, 12354, 11/09/1990",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
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
  "duration": 4590407500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr.",
      "offset": 12
    },
    {
      "val": "Andrzej",
      "offset": 17
    },
    {
      "val": "Kowolczyk",
      "offset": 26
    },
    {
      "val": "andrzej.kowolczyk@mail.com",
      "offset": 37
    },
    {
      "val": "12354",
      "offset": 65
    },
    {
      "val": "11/09/1990",
      "offset": 72
    }
  ],
  "location": "MyStoreRegistration.userInputs(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 421531400,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreRegistration.Submit()"
});
formatter.result({
  "duration": 1236562600,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreRegistration.userIsRegistered()"
});
formatter.result({
  "duration": 793604300,
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
  "name": "user inputs Mrs., Barbara, Piętas, barbara.pietas@mail.com, 12345, 11/12/1990",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
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
  "duration": 3551432500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mrs.",
      "offset": 12
    },
    {
      "val": "Barbara",
      "offset": 18
    },
    {
      "val": "Piętas",
      "offset": 27
    },
    {
      "val": "barbara.pietas@mail.com",
      "offset": 35
    },
    {
      "val": "12345",
      "offset": 60
    },
    {
      "val": "11/12/1990",
      "offset": 67
    }
  ],
  "location": "MyStoreRegistration.userInputs(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 423048600,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreRegistration.Submit()"
});
formatter.result({
  "duration": 1219435900,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreRegistration.userIsRegistered()"
});
formatter.result({
  "duration": 850818800,
  "status": "passed"
});
});