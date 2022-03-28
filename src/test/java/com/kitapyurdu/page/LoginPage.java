package com.kitapyurdu.page;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {
    Methods methods;

    public LoginPage() {
        methods = new Methods();
    }

    public void login() {
        methods.waitBySecond(3);
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.sendKeys(By.id("login-email"), "burakokur616@gmail.com");
        methods.sendKeys(By.id("login-password"), "1q2w3e4r5t");
        methods.waitBySecond(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySecond(1);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".attention")));
    }

    public void closePopUp() {
        methods.click(By.cssSelector(".popupContainer.show>div>svg"));


    }
}
