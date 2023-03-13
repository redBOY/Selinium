package com.bridgelabz.Selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyBoardMouseOperations {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("web,chrome.driver","C:\\Users\\Adithya Srinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Robot robot = new Robot();
        robot.mouseMove(300, 500);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_ALT);
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_W);
        Thread.sleep(3000);

        //driver.close();
    }
}

