import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HtmlDropdownField {

    // Html drop-down fields are know when select is displayed after user rights clicked on the drop-down element
    //All drop-downs with SELECT tags are considered as Html drop-downs

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");

       WebElement dropDown = driver.findElement(By.id("dropdown")); // Locate the drop-down and create a Webelement for it

        Select select = new Select(dropDown); // Using the SELECT class , proceed to perform actions on the drop-down

        select.selectByVisibleText("Option 2"); // This selects the option based on the options text

       // byIndex ();
      //  byVAlue();
        //isMultiple();
        getDropDownOptions();

        driver.close();
    }


    //Selection by index

    public static void byIndex (){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdown")); // Locate the drop-down and create a Webelement for it

        Select select = new Select(dropDown); // Using the SELECT class , proceed to perform actions on the drop-down

        select.selectByIndex(1); // This selects the option based on the options index on the list

        driver.close();

    }

    //Selection by Value

    public static void byVAlue(){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdown")); // Locate the drop-down and create a Webelement for it

        Select select = new Select(dropDown); // Using the SELECT class , proceed to perform actions on the drop-down

        select.selectByValue("1"); // This selects the option based on the options value

        driver.close();



        // This is to check if a drop-down is multi-select or just a single selection
    }

    public static void isMultiple(){
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdown")); // Locate the drop-down and create a Webelement for it

        Select select = new Select(dropDown); // Using the SELECT class , proceed to perform actions on the drop-down

        System.out.println(select.isMultiple()); // This command will check if the drop-down can be multi-selected or Not

        driver.close();


    }

    //This is retrieve all the options on a drop-down

    public  static void getDropDownOptions(){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdown")); // Locate the drop-down and create a Webelement for it

        Select select = new Select(dropDown); // Using the SELECT class , proceed to perform actions on the drop-down

        List<WebElement> dropdownList = select.getOptions();  // Get the options and store them in a webelemnt ,

        for (WebElement temp : dropdownList)  // Perform a forEach loop to print out all the options on the list
        {

            System.out.println(temp.getText());
        }

        driver.close();
    }
}
