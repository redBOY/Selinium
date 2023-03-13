package bridgelabzSelinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello User");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Adithya Srinivas\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("8109555221");

        Thread.sleep(2000);

        driver.findElement(By.name("pass")).sendKeys("Test12345");
        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);


    }
}
