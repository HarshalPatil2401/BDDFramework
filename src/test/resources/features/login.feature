Feature: home Page test case

  Scenario Outline: check login functionality
    Given I have url and homepage
    And I have "<username>" and "<password>"
    When I login to homwpage
    Then I validate the login

    Examples: 
      | username           | password     |
      | hp706655@gmail.com | Harshal@2401 |
      | hp705564@gmail.com | Harshal@2401 |
