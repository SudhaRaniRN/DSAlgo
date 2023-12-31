@register
Feature: User registers to the DS algo portal
  I want to use this template for my feature file

  Background: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    Then The user should be redirected to homepage
    

  @register01
  Scenario: The user is presented with error message for empty fields below Username textbox
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then It should display an error "Please fill out this field." below Username textbox

  @register02
  Scenario: The user is presented with error message for empty fields below Password textbox
    Given The user opens Register Page
    When The user clicks "Register" button after entering username with other fields empty
      | username     |
      | Numpy@sdet84_1 |
    Then It should display an error "Please fill out this field" below Password textbox
    
  @register03
  Scenario: The user is presented with error message for empty fields below Password Confirmation textbox  
    Given The user opens Register Page
    When The user clicks "Register" button after entering "username" and "password" with Password Confirmation field empty
      | username     | password     |
      | Numpy@sdet84_1 | testpassword |
     Then It should display an error "Please fill out this field." below Password Confirmation textbox 

     @register04
     Scenario: The user is presented with error message for invalid username
     Given The user opens Register Page
     When The user enters a "username" with characters other than Letters, digits and "@/./+/-/_"
      | username | password     | password confirmation |
      | &**&**&  | testpassword | testpassword |
     Then It should display an error message "Please enter a valid username"
     
     
     @register05
     Scenario: The user is presented with error message for username already exists
     Given The user opens Register Page
      When The user enters a valid existing "username" with "password" and "password confirmation"
      | username     | password  | password confirmation |
      | Numpy@sdet84_1 | RT56YUabc | RT56YUabc  |
      Then It should display an error message1 "Username already exists"
      
      @register06
      Scenario: The user is presented with error message for password mismatch
      Given The user opens Register Page
      When The user clicks "Register" button after entering valid "username" and different passwords in "password" and "password confirmation" fields
      | username     | password     | password confirmation |
      | Numpy@sdet84_1 | testpassword | testpassword1   | 
      Then It should display an error message2 "password_mismatch:The two password fields didn’t match."
      
      @register07
      Scenario: The user is presented with error message for password with characters less than 8
      Given The user opens Register Page
      When The user enters a valid "username" and "password" with characters less than 8
      | username     | password | password confirmation |
      | Numpy@sdet84_1 | a1b2c3d  | a1b2c3d            |
      Then It should display an error message3 "Password should contain at least 8 characters"
      
      @register08
      Scenario: The user is presented with error message for password with only numbers
      Given The user opens Register Page
      When   The user enters a valid "username" and "password" with only numbers
      | username     | password | password confirmation |
      | Numpy@sdet84_1 | 12345678 |              12345678 |
      Then It should display an error message4 "Password can’t be entirely numeric."
      
      @register09
      Scenario: The user is presented with error message for password too similar to your other personal information
      Given The user opens Register Page
      When The user enters a valid "username" and "password" similar to username
      | username     | password   | password confirmation |
      | Numpy@sdet84_1 | testsdet84 | testsdet84          |
      Then It should display an error message5 "password can’t be too similar to your other personal information."
      
      @register10
     Scenario: The user is presented with error message for commonly used password
     Given The user opens Register Page
     When The user enters a valid "username" and commonly used password "password"
      | username     | password | password confirmation |
      | Numpy@sdet84_1 | Welcome1 | Welcome1          |
     Then It should display an error message6 "Password can’t be commonly used password"
      
     @register11
     Scenario: The user is succesfully able to register 
     Given The user opens Register Page
     When The user enters a valid "username" and "password" and "password confirmation"
      | username     | password  | password confirmation |
      | Ninja_Hawks3 | SDET@110 | SDET@110 |
      Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>" 
      
      @Signin
      Scenario Outline: The user is able to signin with registered credential
      Given The user is on the Sign in page
      When The user enters a valid "<username>" and "<password>"
      Then click login button to verify
      Examples: 
      | username   | password  |
      | Ninja_Hawks3 | SDET@110 |
 
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      