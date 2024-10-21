import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

    public static void main (String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/radio-button");

        WebElement Element = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        String classValue =  Element.getAttribute("class");
        String nameValue =  Element.getAttribute("name");
        String typeValue = Element.getAttribute("type");

        Object [] attrValues = { classValue, nameValue, typeValue};

        for (Object temp : attrValues){

            System.out.println(temp);
        }

isDisplayed();
        isEnabled();

    }


    public  static  void isDisplayed (){

      try {
          WebDriver driver = new ChromeDriver();

          driver.get("https://demoqa.com/text-box");

          Boolean response =  driver.findElement(By.xpath("//button[@id='submit']")).isDisplayed();

          System.out.println(response);
      } catch (Throwable e) {

          System.out.println(e);
      }
    }

    public static void isEnabled (){

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        Boolean response =  driver.findElement(By.xpath("//button[@id='submit']")).isEnabled();

        if (response){
            System.out.println("Test Passed ");
        } else {

            System.out.println("Test Failed ");
        }


    }
}
