import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedBoostrapHandlingDropdown {

   static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://carbon.now.sh/?bg=rgba%2874%2C144%2C226%2C1%29&t=3024-night&wt=none&l=auto&width=680&ds=true&dsyoff=20px&dsblur=68px&wc=true&wa=true&pv=56px&ph=56px&ln=false&fl=1&fm=Hack&fs=14px&lh=133%25&si=false&es=2x&wm=false");

        By a11yDropdown = By.id("downshift-input-A11y Dark");

        By colorDropdown = By.id("downshift-input-Auto");


    }


    // This method act as a location of the elements

    public static WebElement elementLocator (By field){

      return  driver.findElement(field);
    }


    // This method performs the action

    public static void clicker (By field, String valueOption){

        elementLocator(field).click();

        if (elementLocator(field).equals(driver.findElement(By.xpath(valueOption)))){

        }
    }


}
