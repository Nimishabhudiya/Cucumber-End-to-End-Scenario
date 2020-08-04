package org.example;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static sun.plugin.javascript.navig.JSType.URL;

public class Utils extends BasePage{


        private static PolicyUtils.IO FileUtils;


        //to click on elements
        public static void ClickOnElement(By by) {
            driver.findElement(by).click();
        }

        //to enter text
        public static void enterText(By by, String text) {
            driver.findElement(by).sendKeys(text);

        }

        //to get text from element
        public static String getTextFromElement(By by) {
            return driver.findElement(by).getText();
        }

        //to select from droplist by visible text
        public static void SelectByVisibleText(By by, String name) {
            new Select(driver.findElement(by)).selectByVisibleText(name);

        }

        //for creating timestamp to use in email for select random date
        public static String timeStamp() {
            DateFormat format = new SimpleDateFormat("DDMMYYHHMMSS");
            return format.format(new Date());
        }

        //to wait for element to be invisible
        public static void waitForElementToBeInvisible(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        }

        public static void waitForElementToBevisible(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }

        //to wait for a element to be display
        public static void waitForElementToBeDisplay(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
        }


        // to select from droplist by index
        public static void selectByIndex(By by, int numb) {
            new Select(driver.findElement(by)).selectByIndex(numb);
        }

        //to clear text
        public static void clearText(By by) {
            driver.findElement(by).clear();


        }
        //to open a URL in the current browser
        public static void get(){
            driver.get("URL");
        }


        // to check if the URL is correct
        public static void getCurrentUrl(){
            driver.getCurrentUrl();
        }


        //various string operations like contains()to ascertain the presence of the specificed string value
        public static void getPageSource(){
            driver.getPageSource().contains("String to find");
        }

        // to get page title in the selenium webdriver
        public static void gettitle(){
            driver.getTitle();
        }

        //to check whether the element is enabled or disabled in the webdriver
        public static void enabled(By by){
            driver.findElement(by).isEnabled();

        }


        //to submit a web form or to click on submit button
        public static void Submit(By by) {
            driver.findElement(by).submit();

        }
        //to verify if an element with particular locators is present in webpage
        public static void Size(By by) {
            driver.findElement(by).getSize();
        }

        //to set the time for a page to load
        public static void pageLoadTimeout(){
            driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
        }
        //from expected conditions to wait explicitly till an alert appears.
        public static void webdriverWaitandalertlsPresent(){
            WebDriverWait wait=new WebDriverWait(driver,10);
            WebElement element= (WebElement) wait.until(ExpectedConditions.alertIsPresent());
        }

        //to navigate between the URLs.
        public static void navigate(){
            driver.navigate().to("");   // navigate to URL
            driver.navigate().back();   //navigate back
            driver.navigate().forward();   //navigate forward
            driver.navigate().refresh();
        }

        //to capture the entire page screenshot in webdriver
        public static void Screenshort() throws IOException {
            File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //FileUtils.copyFile(shot,new File(""));
        }


        //move to element from the action class to simulate mouse hover effect
        public static void moveElement(By by){
            Actions actions=new Actions(driver) ;
            WebElement mouseHover=driver.findElement(By.id(""));
            actions.moveToElement(mouseHover);
            actions.perform();


        }

        //drag and drop from actions class to drag an element and drop it on another element
        public static void dragAnddrop(By by){
            WebElement sourceLocator=driver.findElement(By.xpath(""));
            WebElement destinationLocator=driver.findElement(By.xpath(""));
            Actions actions=new Actions(driver);
            actions.dragAndDrop(sourceLocator,destinationLocator).build().perform();

        }

        //Switch to()and accept()and sendkeys() methods from Alert class to switch to popup alerts and handle them
        public static void popup(){
            Alert alert=driver.switchTo().alert();    // switch to the alert window
            alert.sendKeys("this is softwaretesting help");   //its type inside the alert
            alert.accept();   // accept the alert and close it
            //alert.dismiss() can be used to dismiss the alert

        }


        //to handle multiple windows in selenium
        public static void getWindowHandle(){
            String handle= driver.getWindowHandle();
            // Set<String> handle= driver.getWindowHandles();
            //the above command are used to get window ids of the current window and all the windows respectively.see the loop below to see how can we go to each window by loop.
            //for (String handle:driver.getWindowHandles()){
            // driver.switchTo().window(handle);}
        }

        //drivermanager to start database connection
        public static void Connection() throws SQLException {
            DriverManager.getConnection(URL,"username","password");     //connect to database through URL & credentials
        }


        //POI to read from the excel files
        public static <Workbook> void Excel() {
            // Workbook workbook = WorkbookFactory.create(new FileInputStream(file));
            // Sheet sheet = workbook.getSheetAt(0);

        }

    }





