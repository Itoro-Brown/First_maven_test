import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multiSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");

        WebElement multiSelect = driver.findElement(By.id("cars")); // Locate the drop-down and create a Webelement for it

        Select select = new Select(multiSelect); // Using the SELECT class , proceed to perform actions on the drop-down

        select.selectByVisibleText("Volvo");

       // byIndex();
       // ifMultiselectable ();

        getAllSelectedOptions();

        System.out.println("All Test Passed ");

        driver.close();
    }


    //Selection can also be done by Index

    public static void byIndex(){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");

        WebElement multiSelect = driver.findElement(By.id("cars")); // Locate the drop-down and create a Webelement for it

        Select select = new Select(multiSelect); // Using the SELECT class , proceed to perform actions on the drop-down

        select.selectByIndex(2);

        driver.close();
    }

    // Selection can also be done by attributeValue

    public static void attriButeSelection(){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");

        WebElement multiSelect = driver.findElement(By.id("cars")); // Locate the drop-down and create a Webelement for it

        Select select = new Select(multiSelect); // Using the SELECT class , proceed to perform actions on the drop-down

        select.selectByValue("audi");

        System.out.println("Test Passed");

        driver.close();
    }

    // To select more than one option at once

    public static void selectAtOnce() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");

        WebElement multiSelect = driver.findElement(By.id("cars")); // Locate the drop-down and create a Webelement for it

        Select select = new Select(multiSelect); // Using the SELECT class , proceed to perform actions on the drop-down

        select.selectByVisibleText("Volvo");
        select.selectByVisibleText("Audi");

        Thread.sleep(10000);

        //To deselect selected options

        select.deselectByVisibleText("Audi");

        Thread.sleep(3000);



        System.out.println("Test Passed");

        driver.close();
    }


    // To check if the drop-down is multi-selectable


    public static void ifMultiselectable (){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");

      WebElement  selectableDropdown =  driver.findElement(By.id("dropdown"));

      Select select = new Select(selectableDropdown);

        List<WebElement> dropDownOptions = select.getOptions();

        for (WebElement temp : dropDownOptions){

            System.out.println(temp.getText());
        }

    }

    //These returns all the selected options

    public static void getAllSelectedOptions() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");

        WebElement multiSelect = driver.findElement(By.id("cars")); // Locate the drop-down and create a Webelement for it

        Select select = new Select(multiSelect); // Using the SELECT class , proceed to perform actions on the drop-down

        select.selectByVisibleText("Volvo");
        select.selectByVisibleText("Audi");

        Thread.sleep(10000);

        //To get all selected options

        List<WebElement> selectedOptions = select.getAllSelectedOptions();

        for (WebElement selectedOption : selectedOptions){

            System.out.println(selectedOption.getText());
        }

        Thread.sleep(3000);



        System.out.println("Test Passed");

        driver.close();
    }



}
