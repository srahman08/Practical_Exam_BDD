$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Color_Blue_White.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Techfios Automation Practical Exam Page Color Change to Blue \u0026 White",
  "description": "",
  "id": "validate-techfios-automation-practical-exam-page-color-change-to-blue-\u0026-white",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ColorTest"
    }
  ]
});
formatter.before({
  "duration": 3626051100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios Automation Practical Exam Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_Techfios_Automation_Practical_Exam_Page()"
});
formatter.result({
  "duration": 163263000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should be able to change the background color to Blue",
  "description": "",
  "id": "validate-techfios-automation-practical-exam-page-color-change-to-blue-\u0026-white;user-should-be-able-to-change-the-background-color-to-blue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User clicks on the button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks \"Set White Background\" button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "StepDefinition.button_exists(String)"
});
formatter.result({
  "duration": 2588100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_button()"
});
formatter.result({
  "duration": 98933500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 448254500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set White Background",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_clicks_button(String)"
});
formatter.result({
  "duration": 82856800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 398835800,
  "status": "passed"
});
});