Feature: verify a new book is added
@book
  Scenario: verify a new book is added
Given Librarian is on the home page
When Librarian clicks Books module
When Librarian clicks “+Add Book” button
And Librarian enters BookName, ISBN, Year, Author and Description
And Librarian verifies a new book is added
