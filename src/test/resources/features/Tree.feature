#
# Tree data structure
@tree
Feature: The user is using Tree data structure page
#	@tag1_tree_01
  #Scenario: The user is logged in to DS Algo portal
  #	Given The user is on Signin page of DS Algo portal
  #	When The user enter valid "numpy@108_1" and "Welcome108" and login  	
  #	Then The user is redirected to homepage
  @tag2_tree_02	
  Scenario: The user is able to navigate to Tree Data Structure Page
    Given The user is on the Ninja home page after logged in    
    When The user clicks the Tree item from drop down menu
    Then The user should be directed to Tree Data Structure Page

  @tag2_tree_03
  Scenario: The user is able to navigate to "Overview of Trees" page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Overview of Trees" link
    Then The user should then be directed to "Overview of Trees" Page
    
  @tag2_tree_04
  Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the overview "Overview of Trees" after logged in
    When The user clicks Tree "Try Here" button on "Overview of Trees" page
    Then The user should be redirected to Try Here page
  
  @tag2_tree_05
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
	@tag2_tree_06
	Scenario Outline: The user is able to get the error message for invalid syantax
	 Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
#	
    @tag2_tree_07
    Scenario: The user is able to navigate to "Terminologies" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Terminologies" link
    Then The user should then be directed to "Terminologies" Page
#
    @tag2_tree_08
    Scenario: The user is able to navigate to Terminologies page having an tryEditor
    Given The user is on the tree "Terminologies" after logged in
    When The user clicks Tree "Try Here" button on "Terminologies" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_09
    
    Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_10
    Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
    @tag2_tree_11
    Scenario: The user is able to navigate to "Types of Trees" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Types of Trees" link
    Then The user should then be directed to "Types of Trees" Page
    
    @tag2_tree_12
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Types of Trees" after logged in
    When The user clicks Tree "Try Here" button on "Types of Trees" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_13
    Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_14
    Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
    @tag2_tree_15
    Scenario: The user is able to navigate to "Tree Traversals" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Tree Traversals" link
    Then The user should then be directed to "Tree Traversals" Page
    
    @tag2_tree_16
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Tree Traversals" after logged in
     When The user clicks Tree "Try Here" button on "Tree Traversals" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_17
    
    Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_18
    Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
    @tag2_tree_19   
    Scenario: The user is able to navigate to "Traversals illustration" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Traversals illustration" link
    Then The user should then be directed to "Traversals illustration" Page
    
    @tag2_tree_20
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Traversals illustration" after logged in
    When The user clicks Tree "Try Here" button on "Types of Trees" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_21
    
    Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_22
    Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
    @tag2_tree_23
    Scenario: The user is able to navigate to "Binary trees" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Binary trees" link
    Then The user should then be directed to "Binary trees" Page
    
    
    @tag2_tree_24
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Binary trees" after logged in
    When The user clicks Tree "Try Here" button on "Tree Traversals" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_25
    
    Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_26
    Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
    
    @tag2_tree_27
    Scenario: The user is able to navigate to "Types of Binary trees" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Types of Binary trees" link
    Then The user should then be directed to "Types of Binary trees" Page
    
    @tag2_tree_28
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Types of Binary trees" after logged in
    When The user clicks Tree "Try Here" button on "Tree Traversals" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_29
    
    Scenario Outline: The user is able to run code in tryEditor
     Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_30
    Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
   
    #Implementation in Python
    @tag2_tree_31
    Scenario: The user is able to navigate to "Implementation in Python" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Implementation in Python" link
    Then The user should then be directed to "Implementation in Python" Page
    
    @tag2_tree_32
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Implementation in Python" after logged in
    When The user clicks Tree "Try Here" button on "Tree Traversals" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_33
    
    Scenario Outline: The user is able to run code in tryEditor
   Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_34
    Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
    #Binary Tree Traversals
    @tag2_tree_35
    Scenario: The user is able to navigate to "Binary Tree Traversals" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Binary Tree Traversals" link
    Then The user should then be directed to "Binary Tree Traversals" Page
    
    @tag2_tree_36
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Implementation in Python" after logged in
    When The user clicks Tree "Try Here" button on "Tree Traversals" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_37
    
    Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_38
    Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
    #Binary Tree Traversals
    @tag2_tree_39
    Scenario: The user is able to navigate to "Binary Tree Traversals" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Binary Tree Traversals" link
    Then The user should then be directed to "Binary Tree Traversals" Page
    
    
    @tag2_tree_40
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Implementation in Python" after logged in
    When The user clicks Tree "Try Here" button on "Tree Traversals" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_41
    
    Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_42
    Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
      
    #Implementation of Binary Trees
    @tag2_tree_43
    Scenario: The user is able to navigate to "Implementation of Binary Trees" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Implementation of Binary Trees" link
    Then The user should then be directed to "Implementation of Binary Trees" Page
    
    @tag2_tree_44
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Implementation of Binary Trees" after logged in
    When The user clicks Tree "Try Here" button on "Tree Traversals" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_45
    
    Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_46
    Scenario Outline: The user is able to get the error message for invalid syantax
		Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
    #Applications of Binary trees
    @tag2_tree_47
    Scenario: The user is able to navigate to "Applications of Binary trees" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Applications of Binary trees" link
    Then The user should then be directed to "Applications of Binary trees" Page
    
    @tag2_tree_48
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Applications of Binary trees" after logged in
    When The user clicks Tree "Try Here" button on "Tree Traversals" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_49
    
    Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_50
    Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
    #Binary Search Trees
    @tag2_tree_51
    Scenario: The user is able to navigate to "Binary Search Trees" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Binary Search Trees" link
    Then The user should then be directed to "Binary Search Trees" Page
    
    @tag2_tree_52
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Binary Search Trees" after logged in
    When The user clicks Tree "Try Here" button on "Binary Search Trees" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_53
    
    Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_54
    Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
    #Implementation of BST
    @tag2_tree_55
    Scenario: The user is able to navigate to "Implementation Of BST" Page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Implementation Of BST" link
    Then The user should then be directed to "Implementation Of BST" Page
    
    @tag2_tree_56
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the tree "Implementation Of BST" after logged in
    When The user clicks Tree "Try Here" button on "Implementation Of BST" page
    Then The user should be redirected to Try Here page
    
    @tag2_tree_57
    
    Scenario Outline: The user is able to run code in tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         0 |
    
    @tag2_tree_58
    Scenario Outline: The user is able to get the error message for invalid syantax
		Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | Sheet3 |         2 |
    
    @tag2_tree_59
    Scenario: The user validating "Practice Questions" page
    Given The user is on the Tree page after logged in
    When The user clicks on the "Overview of Trees" link
   And The user clicks on the Practice Questions
  Then The user should be directed to Practice Questions of Overview of trees Page 
    