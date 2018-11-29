package com.wiley.wat.pages;

import com.wiley.page.BasePage;
import org.openqa.selenium.By;

public class GooglePage extends BasePage {
    public void input(String query) {
        element(By.cssSelector("input[title='Search']")).sendKeys(query);
    }
}
