Feature: AMAZON WEBSITE SEARCH FEATURE

  Scenario Outline: JAVA OCA SEARCH IN AMAZON WEBSITE SEARCH BAR
    Given  User will search for Amazon.com in browser window
    Then   User is in Amazon Website and click on main Search bar
    Then   Search for key Word "<search>" and click search


    Examples:
      | search  |
      | Java Oca |



Feature: Amazon search functionality
  Scenario Outline: Java oca keyboard on search bar
    Given  The user searchs navigating to "https://wwww.amazon.com"
    Then   The user User clicks on the Search bar
    Then   The user enteres word "<search>"
    Then The user enter the search button
    Examples:
      | search |  | Java oca |


