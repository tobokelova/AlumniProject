@product
Feature:  Testing Nhs Website
Scenario: TC_1 NHS Positive Login testing
Given the user navigate to the NHS website
And user validates the url of the page
When the user enters the username and password "valid"
And the user clicks the SignIn button
Then Then the user validates the title


