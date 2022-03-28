package com.kitapyurdu.page;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage extends BaseTest {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithJavaScript(By.cssSelector("#product-table>div:nth-of-type(6)>div>div[class='image']"));
        methods.click(By.cssSelector("#product-table>div:nth-of-type(7)>div[class='grid_2 alpha omega relative']" +
                ">div[class='hover-menu']>a.add-to-favorites"));
        String attribute1 = methods.getAttribute(By.cssSelector("#product-table>div:nth-of-type(7)" +
                ">div[class='grid_2 alpha omega relative']>div[class='hover-menu']>a.in-favorites"), "data-title");
        Assert.assertEquals("Favorilerinizde", attribute1);
        methods.click(By.cssSelector("#product-table>div:nth-of-type(8)>div[class='grid_2 alpha omega relative']" +
                ">div[class='hover-menu']>a.add-to-favorites"));
        String attribute2 = methods.getAttribute(By.cssSelector("#product-table>div:nth-of-type(8)>div[class='grid_2 alpha omega relative']>div[class='hover-menu']>a.in-favorites"), "data-title");
        Assert.assertEquals("Favorilerinizde", attribute2);
        methods.click(By.cssSelector("#product-table>div:nth-of-type(9)>div[class='grid_2 alpha omega relative']" +
                ">div[class='hover-menu']>a.add-to-favorites"));
        String attribute3 = methods.getAttribute(By.cssSelector("#product-table>div:nth-of-type(9)" +
                ">div[class='grid_2 alpha omega relative']>div[class='hover-menu']>a.in-favorites"), "data-title");
        Assert.assertEquals("Favorilerinizde", attribute3);
        methods.click(By.cssSelector("#product-table>div:nth-of-type(10)>div[class='grid_2 alpha omega relative']" +
                ">div[class='hover-menu']>a.add-to-favorites"));
        String attribute4 = methods.getAttribute(By.cssSelector("#product-table>div:nth-of-type(10)" +
                ">div[class='grid_2 alpha omega relative']>div[class='hover-menu']>a.in-favorites"), "data-title");
        Assert.assertEquals("Favorilerinizde", attribute4);
        methods.click(By.cssSelector(".logo-icon"));


    }

    public void addAdress() {
        methods.click(By.cssSelector("a[onclick=\"setShippigAddressType('new')\"]"));
        methods.sendKeys(By.cssSelector("input[id='address-firstname-companyname']"), "Burak");
        methods.sendKeys(By.cssSelector("input[id='address-lastname-title']"), "Okur");
        methods.selectByText(By.cssSelector("[id=\"address-country-id\"]"), "Türkiye");
        methods.click(By.id("address-zone-id"));
        methods.click(By.cssSelector("#address-zone-id>option[value='3354']"));
        methods.click(By.id("address-zone-id"));
        methods.click(By.cssSelector("#address-county-id>option[value='460']"));
        methods.sendKeys(By.id("district"), "Acıbadem");
        methods.sendKeys(By.id("address-address-text"), "Acıbadem caddesi tekin sokak no 15");
        methods.sendKeys(By.id("address-telephone"), "2163399713");
        methods.sendKeys(By.id("address-mobile-telephone"), "5331234567");
        methods.click(By.cssSelector("button[type='button']"));
        methods.waitBySecond(2);
        methods.click(By.cssSelector("button[type=button]"));

    }

    public void addCreditCard() {
        if (methods.isElementVisible(By.cssSelector("div[id='form-credit-card']"))) {
            methods.waitBySecond(3);
            methods.sendKeys(By.id("credit_card_number_1"), "1234");
            methods.sendKeys(By.id("credit_card_number_2"), "1234");
            methods.sendKeys(By.id("credit_card_number_3"), "1234");
            methods.sendKeys(By.id("credit_card_number_4"), "1234");
            methods.sendKeys(By.id("credit-card-owner"), "burak");
        }


    }

    public void logOut() {
        methods.click(By.cssSelector("a[class='checkout-logo']>img"));
        methods.scrollWithAction(By.cssSelector("div[class='menu top login']>ul>li>a[class='common-sprite']"));
        methods.click(By.cssSelector("div[class='menu top login']>ul>li>div>ul>li:nth-of-type(4)>a"));
        methods.waitBySecond(3);
    }

    public void changeAmountAndBuy() {
        methods.clear(By.cssSelector("input[style='width:22px']"), "4");
        methods.click(By.cssSelector("i[onclick='cartProductUpdate($(this).parent())']"));
        methods.waitBySecond(2);
        methods.click(By.cssSelector("div[class='right']"));
    }

    public void goToBasket() {
        methods.click((By.cssSelector("div[id='cart']")));
        boolean control = methods.isElementVisible(By.cssSelector("div[class='mg-b-5']>a[class='button']"));
        if (control) {
            methods.click((By.cssSelector("div[class='mg-b-5']>a[class='button']")));
        }

    }

    public void deleteFavourite() {
        if (methods.isElementVisible(By.xpath("//*[@id=\"product-570901\"]/div[2]/div[3]/a[4]/i"))) {
            methods.click(By.xpath("//*[@id=\"product-570901\"]/div[2]/div[3]/a[4]/i"));
        }
    }


    public void goToAllBooks() {
        methods.click(By.cssSelector(".has-open-menu:nth-of-type(3)>span"));
        boolean control = methods.isElementVisible(By.cssSelector("div[class='open-menu-cr long-cr']>div>div[class='subCategories']"));
        if (control) {
            methods.click(By.cssSelector("div[class='subCategories']>ul>li>a[href='kategori/kitap-hobi/1_212.html']"));
        }
    }

    public void addBacket() {
        methods.click(By.cssSelector("a[class='pr-img-link']>img"));
        methods.click(By.cssSelector("a[id='button-cart']"));
    }

    public void goToPointCatalog() {
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.click(By.cssSelector(".landing-block>a:nth-of-type(2)>img[title*='Türk Klasikleri']"));
    }

    public void sortByVote() {
        methods.selectByText(By.cssSelector(".sort>select[onchange='location = this.value;']"), "Yüksek Oylama");
    }


    public void textControl() {
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text : " + text);
        logger.info("Alınan text : ", text);
    }


    public void goToFavourties() {
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.click(By.cssSelector("div[class='menu top my-list']>ul>li>div>ul>li>a[href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
    }
}
