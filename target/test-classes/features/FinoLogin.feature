Feature: login to the DashBoard

  Scenario: login to WebPage
    Given I have Url
    When login to the Homepage
    Then Verify HomePage

  Scenario: verify login
    Given i have url  and go to login page
    When i enter Id and pass
    Then i clicked on login btn and looged in

 