Feature: Login Functionality

  Scenario Outline: Login using different credentials
    Given The user is on login page
    When Enter vaid "<username>" and "<password>"
    Then User should be navigated to dashboard
    Examples:
      | username | password |



  Scenario Outline: Login with invalid credentials
    Given User is on login Page
    When Enter invalid "<username>" and "<password>"
    Then User will hit login Button
    Then User should get invalid Credentials message

    Examples:
      | username        |        password |
      | invlaidusername | invalidPassword |
      | inValidusername | invalidPassword |



