import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


// This clicks on a webelement holds it , drags it and releases it on a desire locations

public class dragAndDropToNewLocation {

   static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {


        driver.manage().window().maximize();

        driver.get("https://practice-automation.com/gestures/");

       WebElement draggableItem = driver.findElement(By.xpath("//img[@draggable='true']"));

       WebElement destination = driver.findElement(By.id("div2"));

        Actions actions = new Actions(driver);

        // actions.clickAndHold(draggableItem).moveToElement(destination).release().build().perform(); // This actions holds an item on the webpage abd drags it to the desired location.

        // This is another way it could be performed

        actions.dragAndDrop(draggableItem,destination).perform();

        mouseHover ();


    }

    // Mouse Hover

    public  static void  mouseHover () throws InterruptedException {
        driver.manage().window().maximize();

        driver.get("https://saucelabs.com/");

        Actions actions = new Actions(driver); //
        WebElement elem = driver.findElement(By.xpath("(//div[@class ='MuiBox-root css-0'])[1]"));

        actions.moveToElement(elem).perform(); // This will move the mouse to the webElement in focus and it take a webElement in its constructor
        // Make sure .perform is added for all Actions class method

        WebElement option1 = driver.findElement(By.xpath("(//span[@class='MuiTypography-root MuiTypography-buttonLabel css-1mh9myf'])[1]"));

        //actions.moveToElement(option1).perform();

        //actions.click().perform();

        actions.moveToElement(option1).click().build().perform(); // This another optimized way the last two lines can be written

        String pageTile =  driver.getTitle();

        System.out.println(pageTile);




        driver.close();


    }





}
