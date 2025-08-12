package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

        // Open the page
        driver.get("https://training-support.net/webelements/drag-drop");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        //Locate elements
        WebElement ball = driver.findElement(By.id("ball"));
        WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        // Perform drag and drop to dropzone 1
        builder.clickAndHold(ball).moveToElement(dropzone1).pause(5000).release().build().perform();
        if(dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 1");
        }
        builder.dragAndDrop(ball, dropzone2).pause(2000).build().perform();
        if (dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!"));{
        	System.out.println("Ball was dropped in Dropzone 2");
        }
        driver.quit();
    }
}