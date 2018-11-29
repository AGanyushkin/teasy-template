package com.wiley.wat.base;

import com.wiley.basetests.SeleniumBaseTest;
import com.wiley.wat.pages.GooglePage;
import io.qameta.allure.Step;

public class UIBaseTest extends SeleniumBaseTest {

    @Step
    public GooglePage openGoogle() {
        return get(GooglePage.class, "http://google.com");
    }
}
