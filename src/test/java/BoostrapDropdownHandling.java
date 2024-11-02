import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropdownHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://carbon.now.sh/?bg=rgba%2874%2C144%2C226%2C1%29&t=3024-night&wt=none&l=auto&width=680&ds=true&dsyoff=20px&dsblur=68px&wc=true&wa=true&pv=56px&ph=56px&ln=false&fl=1&fm=Hack&fs=14px&lh=133%25&si=false&es=2x&wm=false");

        // Locate the drop-down
        WebElement dropdown = driver.findElement(By.id("downshift-input-3024 Night"));

        dropdown.click();

        // locate the options u wish to selection and click on it

        WebElement accountOption = driver.findElement(By.xpath("//div[normalize-space()='Cobalt']"));

        accountOption.click();


        WebElement autodropdown = driver.findElement(By.id("downshift-input-Auto"));
        autodropdown.click();

        WebElement cobolOption = driver.findElement(By.xpath("//span[@class='jsx-2707462174 dropdown-list-item-text']"));

        cobolOption.click();

        Thread.sleep(10000);

        driver.close();


    }
}
