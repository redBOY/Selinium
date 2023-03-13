package com.bridgelabz.Selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;


public class RobotClassTest {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("web,chrome.driver","C:\\Users\\Adithya Srinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Robot robot = new Robot();
        /*robot.mouseMove(300, 500);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_I);

        robot.keyRelease(KeyEvent.VK_I);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_C);

        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);*/

        driver.findElement(By.id("email")).sendKeys("adithyasrinivas66@gmail.com");
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(2000);
        driver.close();
    }
}

