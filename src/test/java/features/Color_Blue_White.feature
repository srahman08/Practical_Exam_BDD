@ColorTest
 Feature: Validate Techfios Automation Practical Exam Page Color Change to Blue & White

Background: 
	Given User is on the Techfios Automation Practical Exam Page  
	
	
Scenario: User should be able to change the background color to Blue 

	Given "Set SkyBlue Background" button exists
	When User clicks on the button 			 	     
	Then the background color will change to sky blue
	And User clicks "Set White Background" button
	Then the background color will change to white
	