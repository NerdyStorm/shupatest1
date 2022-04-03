Feature: TechFios billing Login Functionality ValidaTion

    @Smoke
    Scenario: User should be able to login with valid credentials
        Given user is on Techfios Login page
        When user enters "username" as "demo@techfios.com"
        When user enters "password" as "abc123"
        When user clicks  signin button
        Then user should land on dashboard page