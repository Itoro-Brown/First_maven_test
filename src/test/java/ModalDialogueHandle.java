import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModalDialogueHandle {

    //In modal dialogu we do not need to switch , as it is part of the web page

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice-automation.com/modals/");

        driver.findElement(By.id("simpleModal")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='pum_popup_title_1318']")));

    String  modalTitle = titleElement.getText();

        System.out.println(modalTitle);

        driver.findElement(By.xpath("(//button)[9]")).click();

        driver.close();


    }
}
