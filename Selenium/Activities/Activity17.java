package Activities;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Find the multilist
        WebElement selectElement = driver.findElement(By.cssSelector("select.h-80"));
        // Pass the WebElement to the Select object
        Select multiSelect = new Select(selectElement);

        // Select the HTML option using visible text
        multiSelect.selectByVisibleText("HTML");
        //select 4th,5th,6th index option
        
        for (int i = 3; i<=5;i++) {
        	multiSelect.selectByIndex(i);
        }
     // Select "Node" using value attribute
        multiSelect.selectByValue("nodejs");
        
     // Print the selected options
        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        // Deselect the 5th index option
        multiSelect.deselectByIndex(4);
        
       // Print the selected options
        selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        // Close the browser
        driver.quit();
    }
}