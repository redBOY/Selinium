package bridgelabzSelinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;

public class ScreenShotTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adithya Srinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("adithyasrinivas@gmail.com");

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        File sourceFile = takesScreenshot.getScreenshotAs((OutputType.FILE));

        File destinationFile = new File("./screenshot/"+System.currentTimeMillis() + "screenshot.png");

        try{
            FileHandler.copy(sourceFile,destinationFile);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(2000);
        driver.close();


    }
}

