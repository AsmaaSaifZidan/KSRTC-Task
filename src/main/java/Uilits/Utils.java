package Uilits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

    public class Utils {

        public static Object selectFromAutocomplete;
        private static WebDriver driver;
         public Utils(WebDriver driver) {
            Utils.driver = driver;
        }
        public static void selectFromAutocomplete(By inputFieldLocator, String partialText, String optionToSelect) {
            WebElement inputField = driver.findElement(inputFieldLocator);
            inputField.clear();
            inputField.sendKeys(partialText);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + partialText + "')]")));
            List<WebElement> options = driver.findElements(By.xpath("//*[contains(text(), '" + partialText + "')]"));
            for (WebElement option : options) {
                if (option.getText().equalsIgnoreCase(optionToSelect)) {
                    option.click();
                    break;
                }
            }
        }
        public static void selectFromDropdownByIndex(By dropdownLocator, int index) {
            WebElement dropdownElement = driver.findElement(dropdownLocator);
            Select dropdown = new Select(dropdownElement);
            dropdown.selectByIndex(index);
        }
    }


