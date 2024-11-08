Feature: Login Data Driven with Excel 
@sanity @regression
  Scenario Outline: Login Data Driven
    Given the user is on the login page
    Then user enters the login page by using username and password with excel row as "<row_index>"
    
     Examples:
    |row_index    |
    |1            | 
    |2            | 
    |3            | 
    |4            | 
    |5            | 
   