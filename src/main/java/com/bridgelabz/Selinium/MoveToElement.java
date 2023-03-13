package com.bridgelabz.Selinium;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class MoveToElement {
    public static void main(String[] args) throws InterruptedException {
System.setProperty("web,chrome.driver","C:\\Users\\Adithya Srinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.istqb.in/");


        WebElement foundationLink = driver.findElement(By.xpath("//span[text()='FOUNDATION']"));

        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(foundationLink).perform();

        Thread.sleep(2000);

        driver.quit();
    }
}

