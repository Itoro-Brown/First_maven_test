import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class updatedMultidropdownSelect {

    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
         driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://letcode.in/dropdowns");

        // Using the By class locate the drop-down elements

        By fruits = By.id("fruits");
        By languages = By.id("lang");
        By heroes = By.id("superheros");

        allMethodsCombo(fruits, "byVisibleText", "Orange");
        allMethodsCombo(languages, "byValue", "java");
        allMethodsCombo(heroes, "byIndex", "5");



        Thread.sleep(10000);

        driver.close();

    }

    // This method here returns a locator for the element

    public static WebElement getElement (By field ){

       return driver.findElement(field);

    }

    // This method here combines all the methods below into one

    public static void allMethodsCombo (By field, String opionType, String optionValue){

        // Create a Select instance

        Select select = new Select(getElement(field));

        switch (opionType){
            case "byVisibleText" :
                select.selectByVisibleText(optionValue);
                break;

            case "byIndex" :
                select.selectByIndex(Integer.parseInt(optionValue));

                break;

            case "byValue" :
                select.selectByValue(optionValue);
                break;
        }



    }

    // This method here selects the option in drop-down based on visible text

    public  static Object optionSelectionbasedOnVisibleText (By field, String option){

        Select select = new Select(getElement(field));
        select.selectByVisibleText(option);

        return null;
    }

    public  static Object optionSelectionbasedOnIndex (By field, int index){

        Select select = new Select(getElement(field));
        select.selectByIndex(index);

        return null;
    }

    public  static Object optionSelectionbasedValue (By field, String value){

        Select select = new Select(getElement(field));
        select.selectByValue(value);

        return null;
    }





}
