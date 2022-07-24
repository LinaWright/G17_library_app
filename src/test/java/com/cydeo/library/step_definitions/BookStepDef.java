package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.BookPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BookStepDef {
    LoginPage loginPage = new LoginPage();
    BookPage bookPage=new BookPage();
    @Given("Librarian is on the home page")
    public void librarian_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        loginPage.signinBtn.click();
    }
    @When("Librarian clicks Books module")
    public void librarian_clicks_books_module() {
bookPage.booksLink.click();
    }
    @When("Librarian clicks “+Add Book” button")
    public void librarian_clicks_add_book_button() {
bookPage.addBook.click();
//    BrowserUtils.waitForVisibility(WebElement bookPage.title);
    }
    @When("Librarian enters BookName, ISBN, Year, Author and Description")
    public void librarian_enters_book_name_isbn_year_author_and_description() throws InterruptedException {
Thread.sleep(3000);
        bookPage.BookName.sendKeys("2am Thoughts");
bookPage.Author.sendKeys("Makenze Campbell");
bookPage.BookCategory.sendKeys("poetry");
bookPage.ISBN.sendKeys("9781771681643");
   bookPage.Year.sendKeys("2009");
    }
    @When("Librarian verifies a new book is added")
    public void librarian_verifies_a_new_book_is_added() {
bookPage.SaveChanges.click();
    }


}
