package org.example;


import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelectors extends BasePage {
    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");

    public void SetUpBrowser() {
        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "src\\Resources\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else

        {
            System.out.println("browser is wrong");
        }

    }
}
