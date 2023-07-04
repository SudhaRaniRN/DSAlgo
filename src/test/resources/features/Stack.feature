@stack
Feature: Stack
  I want to use this template for my feature file
 
@tagStack2
 Scenario: The user is directed to "Stack" Page
 Given The user is on the Ninja home page after logged in
 When The user select "Stack" item from the drop down menu
 Then  The user should be directed to "Stack" Page
  
@tagStack3
 Scenario: The user is able to navigate to "Operations in Stack" page
 Given The user is on the Stack page after logged in
 When  The user clicks on the Operations in Stack link
 Then  The user should then be directed to "Operations in Stack" Page
 
@tagStack4
 Scenario: The user is able to navigate to a page having an tryEditor
 Given The user is on the Operations in Stack page after logged in
 When  The user clicks "Try Here" button on "Stack" page
 Then The user should be redirected to Try Here page
 
@tagStack5
 Scenario Outline: The user is able to run code in tryEditor
 Given The user is in a page having an tryEditor with a Run button to test
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
 
@tagStack6
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
 
@tagStack7
 Scenario: The user is able to navigate to "Implementation" Page
 Given The user is on the Stack page after logged in
 When  The user clicks on the Implementation button
 Then  The user should then be directed to Implementation Page
 
@tagStack8
 Scenario: The user is able to navigate to Implementation page having an tryeditor
 Given The user is on the Stack Implementation page after logged in
 When  The user clicks "Try Here" button on "stack Implementation" page
 Then The user should be redirected to Try Here page
 
@tagStack9
 Scenario Outline: The user is able to run code in tryEditor
 Given The user is in a page having an tryEditor with a Run button to test
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
 
@tagStack10
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
 
@tagStack11
 Scenario: The user is able to navigate to "Applications" in stack Page
 Given The user is on the Stack page after logged in
 When  The user clicks on the Applications button
 Then  The user should be directed to Applications Page
 
@tagStack12
 Scenario: The user is able to navigate to Applications page having an tryEditor
 Given The user is on the Applications stack page after logged in
 When  The user clicks "Try Here" button on "stack Applications" page
 Then  The user should be redirected to Try Here page
 
@tagStack13
 Scenario Outline: The user is able to run code in tryEditor
 Given The user is in a page having an tryEditor with a Run button to test
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
 
@tagStack14
Scenario Outline: The user is able to get the error message for invalid syntax
  Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
      
@tagStack15
 Scenario: The user is able to navigate to "Practice Questions" in stack Page
 Given The user is on the Applications stack page after logged in
 When  The user clicks on the Practice Questions button
 Then  The user should be redirected to Practice Questions page
