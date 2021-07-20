Feature: Sample Testing
Scenario: Samplepage Sumbit
When  user enter url
And  user enter wrong password "Tester123"
And  user click sumbit button
Then  message should display "wrong password"
