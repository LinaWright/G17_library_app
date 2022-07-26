package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksBorrowingBooksPages extends BasePage {

    public BooksBorrowingBooksPages(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//h3[.='Book Management']")

    public WebElement bookManagementHeader;

    @FindBy(xpath = "//h3[.='Borrowing Books']")
    public WebElement borrowingBookHeader;


}
