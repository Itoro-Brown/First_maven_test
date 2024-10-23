import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tagname {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

       List<WebElement> inputFields = driver.findElements(By.tagName("input"));

       int numberOfinputs = inputFields.size();

        System.out.println(numberOfinputs);

        for(WebElement e : inputFields){
            System.out.println(e.getAttribute("type"));
        }
    driver.close();

        allHrefs();

    }

    public  static void allHrefs(){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for(WebElement e : allLinks){

            System.out.println(e.getAttribute("href"));
        }
    }
}
