package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class InformationUserTest {

    private WebDriver chrome;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alexandre.marques\\drivers\\chromedriver.exe");
        chrome = new ChromeDriver();
        chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chrome.get("https://www.microsoft.com/pt-br");
    }

    @Test
    public void testAddInfoUser() {

        chrome.findElement(By.id("mectrl_main_trigger")).click();

        WebElement login = chrome.findElement(By.id("i0116"));
        login.sendKeys("teste@outlook.com");

        chrome.findElement(By.id("idSIButton9")).click();

        WebElement passwd = chrome.findElement(By.id("i0118"));
        passwd.sendKeys("admin");

        assertEquals(2, 2);
    }

    @After
    public void tearDown() {
        chrome.quit();
    }
}