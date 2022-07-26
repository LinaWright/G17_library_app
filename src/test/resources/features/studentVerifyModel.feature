Feature: Student verifies models

	*AC2*
	@B26G17-109 @B26G17-100 @B26G17-112
	Scenario: US#1, AC#2 Student verifies that there are 2 models on the page


		Given I am on the login page
		When I login as a student
		When student clicks Books button
		Then student sees Book Management Header
		When student clicks on Borrowing Books button
		Then student should sees Borrowing Books Header



		