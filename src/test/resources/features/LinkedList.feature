@linkedlist
Feature: Linked List
#Background: The user is logged in to DS Algo portal
 # I want to use this template for my feature file / Linked List

@tagLL2 
 Scenario: User navigated to "linked list" page
 Given The user is on the Ninja home page after logged in 
 When  The user selecting "Linked List" item from the drop down menu
 Then The user should be directed to Linked List Page
  
@tagLL3
 Scenario: User navigated to "Introduction" page
 Given The user is in the Linked List  page after logged in
 When The user clicks Introduction "Introduction" link
 Then The user should be directed to "Introduction" of Linked List Page
   
@tagLL4
 Scenario: User navigated to tryEditor page with Run button from Introduction page
 Given The user is on the Introduction after logged in
 When The user clicks "Try Here" button on "Introduction" page
 Then The user should be redirected to Try Here page
      
  @tagLL5
   Scenario Outline:  The user run the code in tryEditor with valid input for Introduction page
   Given The user is in a page having an tryEditor with a Run button to test
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
      
   @tagLL6
  Scenario Outline: The user getting error message with invalid python code for Introduction page	 																				
	 Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
      
@tagLL7
Scenario: User navigated to creating linked list page
	Given The user is in the Linked List  page after logged in
	When The user clicks the creating Linked list "Creating a Linked List" button
	Then The user should be directed to "Creating Linked List" Page
    
@tagLL8
Scenario: User navigated to tryEditor page with Run button from Creating a Linked List page
	Given The user is on the Creating a Linked List after logged in
  When The user clicks "Try Here" button on "Introduction" page
  Then The user should be redirected to Try Here page
    
  @tagLL9
  Scenario Outline: The user run the code in tryEditor with valid input for Creating a Linked List page
   Given The user is in a page having an tryEditor with a Run button to test
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
  @tagLL10
   Scenario Outline: The user getting error message with invalid python code for Creating a Linked List page
	 Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
 
@tagLL11
Scenario: User navigated to "Types of linked list" page
	Given The user is in the Linked List  page after logged in
	When The user clicks the Types of Linked List "Types of Linked List" button
	Then The user should be directed to "Types of Linked List" Page
    
@tagLL12 
Scenario: User navigated to tryEditor page with Run button from Types of Linked List
	Given The user is on the Types of Linked list after logged in
	When The user clicks "Try Here" button on "Types of Linked List" page
	Then The user should be redirected to Try Here page
    
@tagLL13 
Scenario Outline: The user run the code in tryEditor with valid input for Types of Linked List
Given The user is in a page having an tryEditor with a Run button to test
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
      
  @tagLL14
  Scenario Outline: The user getting error message with invalid python code for Types of Linked List
   Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
      
@tagLL15
Scenario: user navigated to "Implementation linked list in python" page
	Given The user is in the Linked List  page after logged in
	When The user clicks the Implement "Implement Linked List in Python" button
	Then The user should be directed to "Implement Linked List in Python" Page
    
@tag16
Scenario: User navigated to tryEditor page with Run button from Types of Linked List
	Given The user is on the Implement Linked List in Python after logged in
	When The user clicks "Try Here" button on "implement-linked-list-in-python" page
	Then The user should be redirected to Try Here page
    
@tagLL17
Scenario Outline: The user run the code in tryEditor with valid input for Implement Linked List in Python page
	Given The user is in a page having an tryEditor with a Run button to test
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
      
@tagLL18
Scenario Outline: The user getting error message with invalid python code for Implement Linked List in Python page
	Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
@tagLL19
Scenario: user navigated to "Traversal" page
	Given The user is in the Linked List  page after logged in
	When The user clicks the Traversal "Traversal" button
	Then The user should be directed to "Traversal" Page

@tagLL20 
Scenario: User navigated to tryEditor page with Run button from Traversal page
	Given The user is on the Traversal after logged in
	When The user clicks "Try Here" button on "traversal" page
	Then The user should be redirected to Try Here page
    
@tagLL21
Scenario Outline: The user run the code in tryEditor with valid input for Traversal page
	Given The user is in a page having an tryEditor with a Run button to test
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
      
@tagLL22 
Scenario Outline: The user getting error message with invalid python code for Traversal page
Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
      
@tagLL23 
Scenario: user navigated to "Insertion" page
  Given The user is in the Linked List  page after logged in
  When The user clicks the Insertion "Insertion" button
  Then The user should be directed to "Insertion" Page
    
@tagLL24
Scenario: User navigated to tryEditor page with Run button from Insertion page
  Given The user is on the Insertion after logged in
  When The user clicks "Try Here" button on "Insertion" page
  Then The user should be redirected to Try Here page
 
  @tagLL25 
  Scenario Outline: The user run the code in tryEditor with valid input for Insertion page
  Given The user is in a page having an tryEditor with a Run button to test
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
      
@tagLL26 
Scenario Outline: The user getting error message with invalid python code for Insertion page
	Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
  
@tagLL27 
Scenario: user navigated to "Deletion" page
  Given The user is in the Linked List  page after logged in
  When The user clicks the deletion "Deletion" button
  Then The user should be directed to "Deletion" Page
    
@tagLL28  
Scenario: User navigated to tryEditor page with Run button from Deletion page
  Given The user is on the Deletion after logged in
  When The user clicks "Try Here" button on "Deletion" page
  Then The user should be redirected to Try Here page
    
@tagLL29 
Scenario Outline: The user run the code in tryEditor with valid input for Deletion page
  Given The user is in a page having an tryEditor with a Run button to test
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
  
@tagLL30 
Scenario Outline: The user getting error message with invalid python code for Deletion page
Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |

      
@tagLL31
Scenario: The user validating "Practice Questions" page
  Given  The user is in the Linked List  page after logged in
  When The user clicks Introduction "Introduction" link
  And The user clicks on the Practice Questions
  Then The user should be directed to Practice Questions of Linked List Page 