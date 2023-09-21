# DSAlgo
DSALGO is an education domain project. This is an application specially designed for
practicing data structures and algorithms. I have involved in the design and 
development of automation framework from scratch and reduced the test execution
effort by 60-70%

Designed and implementated Automation framework (using data 
driven and POM)

Major bug found
on screen 'Confirm password' after typing wrong Password and 'Password 
confirmation doesn't match password' is shown, even you fix value in input field , 
until you tap on 'Next'

Expected behavior
'Password confirmation doesn't match password' disappears when you start to fix 
value in 'confirm password' field

Actual behavior
'Password confirmation doesn't match password' doesn't disappear even when you 
entered correct value in 'confirm password' field
Reproduced the bug and shared the screenshots with the 
developer
Achieved the reduction of test execution effort by 60-70% by
1.Choosing the right automation framework to reduce code duplication improves 
test efficiency
2.Using explicit wait's instead of implicit waits
