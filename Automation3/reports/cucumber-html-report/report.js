$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/testcase.feature");
formatter.feature({
  "line": 1,
  "name": "Practice_Automation3",
  "description": "",
  "id": "practice-automation3",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Demosite registration-Invalid details",
  "description": "",
  "id": "practice-automation3;demosite-registration-invalid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@TC_01"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user opens the Practice automation website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user enter the email and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click_the_login_button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click_the Demo site button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "fill all the invalid details in the register form",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Invaliddetails_step.the_user_launch_the_browser()"
});
formatter.result({
  "duration": 10818821560,
  "status": "passed"
});
formatter.match({
  "location": "Invaliddetails_step.the_user_opens_the_Practice_automation_website()"
});
formatter.result({
  "duration": 60418586988,
  "status": "passed"
});
formatter.match({
  "location": "Invaliddetails_step.the_user_enter_the_email_and_password()"
});
formatter.result({
  "duration": 7850015722,
  "status": "passed"
});
formatter.match({
  "location": "Invaliddetails_step.click_the_login_button()"
});
formatter.result({
  "duration": 14358105845,
  "status": "passed"
});
formatter.match({
  "location": "Invaliddetails_step.click_the_Demo_site_button()"
});
formatter.result({
  "duration": 18564740110,
  "status": "passed"
});
formatter.match({
  "location": "Invaliddetails_step.fill_all_the_invalid_details_in_the_register_form()"
});
formatter.result({
  "duration": 5699858827,
  "status": "passed"
});
formatter.match({
  "location": "Invaliddetails_step.click_on_submit_button()"
});
formatter.result({
  "duration": 6188805763,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Demosite -Mandatory fields",
  "description": "",
  "id": "practice-automation3;demosite--mandatory-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TC_02"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "open_the_url_in a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the url is opened click on demosite",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "fill only mandatory fields in the register form",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click_on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Mandatoryfields_step.open_the_url_in_a_browser()"
});
formatter.result({
  "duration": 8540807977,
  "status": "passed"
});
formatter.match({
  "location": "Mandatoryfields_step.the_url_is_opened_click_on_demosite()"
});
formatter.result({
  "duration": 31228289257,
  "status": "passed"
});
formatter.match({
  "location": "Mandatoryfields_step.fill_only_mandatory_fields_in_the_register_form()"
});
formatter.result({
  "duration": 26859888928,
  "status": "passed"
});
formatter.match({
  "location": "Mandatoryfields_step.click_on_submit_button()"
});
formatter.result({
  "duration": 6755764230,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Demosite-Refresh",
  "description": "",
  "id": "practice-automation3;demosite-refresh",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC_03"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "the user has launched the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "the url is open and click on demosite",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "fill all the details",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "click on refresh",
  "keyword": "Then "
});
formatter.match({
  "location": "Refresh_step.the_user_has_launched_the_browser()"
});
formatter.result({
  "duration": 8113174010,
  "status": "passed"
});
formatter.match({
  "location": "Refresh_step.the_url_is_open_and_click_on_demosite()"
});
formatter.result({
  "duration": 83314871905,
  "status": "passed"
});
formatter.match({
  "location": "Refresh_step.fill_all_the_details()"
});
formatter.result({
  "duration": 24133231132,
  "status": "passed"
});
formatter.match({
  "location": "Refresh_step.click_on_refresh()"
});
formatter.result({
  "duration": 12998562616,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Demosite-FileDownload",
  "description": "",
  "id": "practice-automation3;demosite-filedownload",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@TC_04"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "Open url in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "automation site is opened",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Click on more and filedownload",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "download the file",
  "keyword": "Then "
});
formatter.match({
  "location": "FileDownload_step.open_url_in_the_browser()"
});
formatter.result({
  "duration": 7403365931,
  "status": "passed"
});
formatter.match({
  "location": "FileDownload_step.automation_site_is_opened()"
});
formatter.result({
  "duration": 39874115806,
  "status": "passed"
});
formatter.match({
  "location": "FileDownload_step.click_on_more_and_filedownload()"
});
formatter.result({
  "duration": 25900931570,
  "status": "passed"
});
formatter.match({
  "location": "FileDownload_step.download_the_file()"
});
formatter.result({
  "duration": 2249474453,
  "status": "passed"
});
});