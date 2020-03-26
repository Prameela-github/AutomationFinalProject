Feature: Practice_Automation3
@TC_01
Scenario: Demosite registration-Invalid details
Given the user launch the browser
When the user opens the Practice automation website
Then the user enter the email and password
Then click_the_login_button
Then click_the Demo site button
Then fill all the invalid details in the register form
Then click on submit button

@TC_02
Scenario: Demosite -Mandatory fields
Given open_the_url_in a browser
When the url is opened click on demosite
Then fill only mandatory fields in the register form
Then click_on submit button

@TC_03
Scenario: Demosite-Refresh
Given the user has launched the browser
When the url is open and click on demosite
Then fill all the details
Then click on refresh

@TC_04
Scenario: Demosite-FileDownload
Given Open url in the browser
When automation site is opened
Then Click on more and filedownload
Then download the file


