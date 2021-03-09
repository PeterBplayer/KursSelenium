$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Features/change-user-information.feature");
formatter.feature({
  "line": 1,
  "name": "Change user information after login",
  "description": "",
  "id": "change-user-information-after-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Change user birthday date, gender and sign up for a newsletter",
  "description": "",
  "id": "change-user-information-after-login;change-user-birthday-date,-gender-and-sign-up-for-a-newsletter",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to UserInformationPage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User changes his birthday to \"05/06/1939\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User changes gender",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User signs up for our newsletter",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User saves information",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User sees \"Information successfully updated.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ChangeUserInfoSteps.userIsLoggedInToCodersLabShop()"
});
formatter.result({
  "duration": 6543842900,
  "status": "passed"
});
formatter.match({
  "location": "ChangeUserInfoSteps.userGoesToUserInformationPage()"
});
formatter.result({
  "duration": 738852700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05/06/1939",
      "offset": 30
    }
  ],
  "location": "ChangeUserInfoSteps.userChangesHisBirthdayTo(String)"
});
formatter.result({
  "duration": 3877600,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"pageObjectPattern.pages.UserInfoPage.setBirthdate(String)\" because \"this.userInfoPage\" is null\r\n\tat pageObjectPattern.ChangeUserInfoSteps.userChangesHisBirthdayTo(ChangeUserInfoSteps.java:46)\r\n\tat ✽.And User changes his birthday to \"05/06/1939\"(src/Cucumber/Features/change-user-information.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChangeUserInfoSteps.userChangesGender()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChangeUserInfoSteps.userSignsUpForOurNewsletter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChangeUserInfoSteps.userSavesInformation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Information successfully updated.",
      "offset": 11
    }
  ],
  "location": "ChangeUserInfoSteps.userSees(String)"
});
formatter.result({
  "status": "skipped"
});
});