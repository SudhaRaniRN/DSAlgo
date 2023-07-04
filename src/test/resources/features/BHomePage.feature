@homepage
Feature: user opens the homepage of ds algo website
  I want to use this template for my feature file

Background: User is on the homepage
    Given user is on the homepage
 
  @homepage_01
  Scenario Outline: User is on Home page and click on getstarted link without sign in
    When The user clicks on Get Started link on homepage "<option>" without login
    Then The user get warning message "You are not logged in"
    Examples: 
      | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
  

  Scenario Outline: User is on Home page and click on dropdown without sign in
  #Given The user is on Home page
  When  The user clicks on dropdown "<option>" without login
  Then The user get warning message "You are not logged in"
   Examples: 
      | option         |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
      
  Scenario: User is on Home page and click on sign in
    #Given The user opens Home Page
    When The user clicks "Sign in"
    Then The user should be redirected to Sign in page
    

  Scenario:  User is on Home page and click on Register
    #Given The user opens Home Page
    When The user clicks "Register"
    Then The user should be redirected to Register form