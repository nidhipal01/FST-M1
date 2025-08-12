package Activities;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {
    public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);
     // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Open the page
        driver.get(" https://training-support.net/webelements/dynamic-content");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        //find the click button
        WebElement button = driver.findElement(By.id("genButton"));
       builder.click(button).perform();
      //  driver.findElement(By.id("genButton")).click();
      //System.out.println("Button is clicked ");
        // WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
         if (wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"),"release"))){
         	// Print the text to console
             System.out.println("Word found: " + driver.findElement(By.id("word")).getText());
            }
        driver.quit();
    }
}