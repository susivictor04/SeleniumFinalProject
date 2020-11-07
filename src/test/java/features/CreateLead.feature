Feature: Leaftaps Login


Scenario Outline: TC001 Create a new Lead
When Click Leads Tab
And Click Create Leads Link
And Type Company Name <company>
And Type First Name <first name>
And Type Last Name <last name>
When Click on the Create Lead Button
Then Verify First Name <first name>

Examples:
|company|first name|last name|
|TestLeaf|Sethu|S|
|TestLeaf|Koushik|M|








