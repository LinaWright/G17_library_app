package com.cydeo.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends BasePage{
    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksLink;
    @FindBy(css = "a.btn.btn-lg.btn-outline.btn-primary.btn-sm.add_book_btn")
    public WebElement addBook;
@FindBy(xpath = "//input[@placeholder='Book Name']")
    public WebElement BookName;
@FindBy(xpath = "//input[@placeholder='Author']")
    public WebElement Author;
@FindBy(xpath = "//input[@placeholder='ISBN']")
    public WebElement ISBN;
    @FindBy(xpath = "//input[@placeholder='Year']")
    public WebElement Year;
@FindBy(id="book_group_id")
    public WebElement BookCategory;
@FindBy(xpath = "//button[@type='submit']")
    public WebElement SaveChanges;
@FindBy(css = "h5.modal-title")
    public WebElement title;
}
