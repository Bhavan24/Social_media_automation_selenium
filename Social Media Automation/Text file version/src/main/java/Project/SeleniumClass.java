package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumClass {

    private static final WebDriver driver = new ChromeDriver();
    private static final WebDriver.Timeouts timeouts = driver.manage().timeouts();

    @Test
    public static void facebook(String email, String password) {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        // Going to the given website
        driver.get("http://www.facebook.com/");
        timeouts.implicitlyWait(30, TimeUnit.SECONDS);
        // Filling username and password
        txtBoxFillId("email", email);
        txtBoxFillId("pass", password);
        // Clicking the login button
        btnClickName("login");
    }

    @Test
    public static void instagram(String username, String password) {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        // Going to the given website
        driver.get("https://www.instagram.com/");
        timeouts.implicitlyWait(30, TimeUnit.SECONDS);
        // Filling username and password
        txtBoxFillName("username", username);
        txtBoxFillName("password", password);
        // Clicking the login button
        btnClickByText("Log In");
    }

    @Test
    public static void twitter(String email, String password) {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        // Going to the given website
        driver.get("http://www.twitter.com/login/");
        timeouts.implicitlyWait(30, TimeUnit.SECONDS);
        txtBoxFillName("session[username_or_email]", email);
        txtBoxFillName("session[password]", password);
        timeouts.implicitlyWait(30, TimeUnit.SECONDS);
        // Clicking the login button
        btnClickCss("form > div > div:nth-child(8) > div > div");
    }

    @Test
    public static void linkedIn(String email, String password) {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        // Going to the given website
        driver.get("https://www.linkedin.com/");
        timeouts.implicitlyWait(30, TimeUnit.SECONDS);
        // Filling username and password
        txtBoxFillId("session_key", email);
        txtBoxFillId("session_password", password);
        timeouts.implicitlyWait(30, TimeUnit.SECONDS);
        // Clicking the login button
        btnClickClass("sign-in-form__submit-button");
    }

    @Test
    public static void github(String email, String password) {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        // Going to the given website
        driver.get("https://github.com/login/");
        timeouts.implicitlyWait(30, TimeUnit.SECONDS);
        // Filling username and password
        txtBoxFillId("login_field", email);
        txtBoxFillId("password", password);
        timeouts.implicitlyWait(30, TimeUnit.SECONDS);
        // Clicking the login button
        btnClickName("commit");
    }

    @Test
    public static void iit(String email, String password) {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        // Going to the given website
        driver.get("https://learning.iit.ac.lk/login/index.php");
        timeouts.implicitlyWait(30, TimeUnit.SECONDS);
        btnClickCss("div:nth-child(2) > div > div > a");
        timeouts.implicitlyWait(10, TimeUnit.SECONDS);
        // Filling username and password
        txtBoxFillId("identifierId", email);
        btnClickClass("VfPpkd-RLmnJb");
        timeouts.implicitlyWait(30, TimeUnit.SECONDS);
        txtBoxFillName("password", password);
        timeouts.implicitlyWait(30, TimeUnit.SECONDS);
        try {
            btnClickXpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button");
            timeouts.implicitlyWait(10, TimeUnit.SECONDS);
            btnClickXpath("/html/body/nav/ul[1]/li[2]/a");
            btnClickXpath("/html/body/nav/ul[1]/li[2]/div/a[1]");
        } catch (Exception e) {
            btnClickClass("VfPpkd-RLmnJb");
            timeouts.implicitlyWait(10, TimeUnit.SECONDS);
            btnClickXpath("/html/body/nav/ul[1]/li[2]/a");
            btnClickXpath("/html/body/nav/ul[1]/li[2]/div/a[1]");
        }
    }

    // Button click function by id
    private static void btnClickXpath(String xpath) {
        WebElement Button = driver.findElement(By.xpath(xpath));
        Button.click();
    }

    // Button click function by css selector
    private static void btnClickClass(String className) {
        WebElement Button = driver.findElement(By.className(className));
        Button.click();
    }

    // Button click function by css selector
    private static void btnClickCss(String cssSelector) {
        WebElement Button = driver.findElement(By.cssSelector(cssSelector));
        Button.click();
    }

    // Button click function by name
    private static void btnClickName(String name) {
        WebElement Button = driver.findElement(By.name(name));
        Button.click();
    }

    // Find element by text
    private static void btnClickByText(String text) {
        String xpath = String.format("//*[contains(text(),'%s')]", text);
        WebElement textElement = driver.findElement(By.xpath(xpath));
        textElement.click();
    }

    // Filling Text boxes function using id
    private static void txtBoxFillId(String id, String value) {
        WebElement textElement = driver.findElement(By.id(id));
        textElement.sendKeys(value);
    }

    // Filling Text boxes function using name
    private static void txtBoxFillName(String name, String value) {
        WebElement textElement = driver.findElement(By.name(name));
        textElement.sendKeys(value);
    }

}