Feature: Navigate to TekSchool


  Scenario: Open google.com and search for TekSchool.com
    Given The user is in google web page
    When   User enter keyword TekSchool.com in search area and hit click
    Then   user will see website links
    Then   user should click on TekSchool link
    Then   user will be navigate to TekSchool.com
