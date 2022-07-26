package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.BasePage;
import com.cydeo.library.pages.BooksBorrowingBooksPages;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentVerifiesModelsStepDef extends BasePage {

   BooksBorrowingBooksPages booksBorrowingBooksPages=new BooksBorrowingBooksPages();
   WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    @When("student clicks Books button")
    public void student_clicks_books_button() {
       booksLink.click();
    }
    @Then("student sees Book Management Header")
    public void student_sees_book_management_header() {
booksBorrowingBooksPages.bookManagementHeader.isDisplayed();
    }
    @When("student clicks on Borrowing Books button")
    public void student_clicks_on_borrowing_books_button() {
    borrowingBooks.click();
    }
    @Then("student should sees Borrowing Books Header")
    public void student_should_sees_borrowing_books_header() {
booksBorrowingBooksPages.borrowingBookHeader.isDisplayed();
    }



}
