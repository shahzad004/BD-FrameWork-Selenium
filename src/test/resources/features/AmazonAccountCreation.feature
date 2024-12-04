Feature: Create amazon account

#  Background:
#    Given I am on the amazon web page
#    Then I will click on signIn button
#    And I will click on Create amazon account button

    Scenario: Successfully create account with valid phone number
    Given I am on the amazon web page
    When I will click on signIn button
    Then I will click on Create amazon account button
    And I will enter username as value for your name field
    And I will enter phoneNumber as value for phone number field
    And I will enter password as a valid password value for password field
    And I will re-enter password as a valid password value for re-enter password field
    Then I click on verify mobile number button


