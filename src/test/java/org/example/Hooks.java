package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
    BrowserSelectors browserSelectors=new BrowserSelectors();
    static String timeStamp=new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());


    @Before
    public void openBrowser(){
        browserSelectors.SetUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/books");
    }

    @After
    public void closeBrowser(){
       // driver.quit();
    }
}
