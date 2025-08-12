package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity2 {
    public static void main(String[] args) {
        // Initialize the Chrome Driver
        WebDriver driver = new ChromeDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/login-form");

        // Verify the page title
        System.out.println("Page title is: " + driver.getTitle());
       // Find the username field and enter the username
        driver.findElement(By.id("username")).sendKeys("admin");
        // Find the password field and enter the password
        driver.findElement(By.id("password")).sendKeys("password");
        // Find the login button and click it
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Print the confirmation message
        String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println(message);

        // Close the browser
        driver.quit();
    }
}