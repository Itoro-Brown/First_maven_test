import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectOptionsIndropdownsFieldsAtOnce {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://letcode.in/dropdowns");

        // We use the BY class here to locate multiple drop-downs on a single page

        By fruits = By.id("fruits");

        By programmingLanguage = By.id("lang");

        Select selectFruits = new Select(driver.findElement(fruits));

        selectFruits.selectByVisibleText("Orange");


        Select selectLang = new Select(driver.findElement(programmingLanguage));

        selectLang.selectByVisibleText("Java");


        System.out.println("Test Passed ");
    }
}
