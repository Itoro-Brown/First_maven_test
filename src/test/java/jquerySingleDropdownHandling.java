import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class jquerySingleDropdownHandling {

    // This covers jquery drop-down fields for single selection
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        WebElement singleSelect = driver.findElement(By.id("justAnotherInputBox"));
        singleSelect.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement optionToSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='comboTreeItemTitle comboTreeItemHover']")));

        optionToSelect.click();

        driver.close();

    }



}
