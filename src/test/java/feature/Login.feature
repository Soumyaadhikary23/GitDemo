Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking landing pages
When user login into application with "jin" and password "1234"
Then Home page is populated
And Card  displayed are "true"


Scenario: Home page default login
Given User is on NetBanking landing pages
When user login into application with "jhon" and password "4321"
Then Home page is populated
And Card  displayed are "false"