package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.ProductPage;
import org.junit.Test;

public class MainTest extends BaseTest {
    @Test
    public void mainTest() {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        Methods methods = new Methods();
        loginPage.closePopUp();
        loginPage.login();
        productPage.textControl();
        productPage.selectProduct();
        productPage.goToPointCatalog();
        productPage.sortByVote();
        productPage.goToAllBooks();
        methods.waitBySecond(3);
        productPage.addBacket();
        methods.waitBySecond(3);
        productPage.goToFavourties();
        methods.waitBySecond(3);
        productPage.deleteFavourite();
        methods.waitBySecond(3);
        productPage.goToBasket();
        methods.waitBySecond(3);
        productPage.changeAmountAndBuy();
        productPage.addAdress();
        productPage.addCreditCard();
        productPage.logOut();


    }

}
