Feature: Amazon Account Creation


    Background:
        Given I am on the amazon web page
        Then I will click on signIn button
        And I will click on Create amazon account button

    Scenario Outline: Amazon Account Form
        Then  User is the amazon register page
        When  User will click on Your name field and enter "<first and last Name>"
        And User will click on Mobile or email field and enter "< Mobile or email>"
        And User will click on Password field and enter "<password >"
        And User will click re enter password and enter same password "<password>"
        Then User will click on Continue Button

        Examples:
            | first and last Name | Mobile or email | password | password |
            | Shahzad khan        | 245857985       | khan123  | khan123  |
            | Naeem Khan          | naeem@gmail.com | khan124  | khan124  |