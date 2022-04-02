Feature: TechFios billing Login Functionality ValidaTion

Scenario: User should be able to login with valid credentials
Given user is on Techfios Login page 
When user enter username as "demo@techfios.com
When user enters password as "abc123"
When user clicks  signin button  
Then User should land on dashboard page