@tag
Feature: User Sign's in the DS algo portal link
  I want to use this template for my feature file

  Background:
  Given  The user is on the Sign in page
  
  
  @tag1
  Scenario: Verifying Register link
    When The user clicks on register link on signin page
    Then The user redirected to Registration page from signin page
    

  @tag2
  Scenario Outline: User on login page and login with invalid inputs
    Given  The user is on the Sign in page
    When  The user enter invalid "<username>" and "<password>"
    Then click login button to verify
     Examples: 
      | username | password |
      | user     |          |
      |          | passowrd |
      |          |          |

  @tag3
  Scenario Outline: User on login page and login with invalid and valid inputs from Excel
  Given The user is on the Sign in page
  When The user enter sheet "<Sheetname>" and <RowNumber>
  Then click login button to verify
   Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |
  
  @tag4
  Scenario:  Verifying signout link
  Given The user is in the Home page with valid  log in
  When The user clicks2 "Sign out" 
  Then The user redirected to homepage
  
