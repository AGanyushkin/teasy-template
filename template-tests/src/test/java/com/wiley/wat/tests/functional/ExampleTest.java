package com.wiley.wat.tests.functional;

import com.wiley.wat.base.UIBaseTest;
import org.testng.annotations.Test;

public class ExampleTest extends UIBaseTest {

    @Test
    public void example_test() {
        openGoogle()
                .input("Hello");
    }
}
