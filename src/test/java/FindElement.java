import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElement {

    public  static  void  main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));


         String label = loginButton.getText();  // It will get the text between the tags

        loginButton.click();

        System.out.println(label);


        Thread.sleep(3000);

        driver.close();

        //multipleSelection ();

        //navigateBtwPages ();

        getAllAnchorLinks();
    }


    public static void multipleSelection (){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/selectable");

        List<WebElement> options = driver.findElements(By.id("verticalListContainer")); // Here you are able to locate multiple elements



        for ( WebElement temp : options){
           temp.click();  // Here how you are able to click on multiple options from a list,(applicable for Multiselect)
        }


        for (WebElement e : options){

            System.out.println(e.getText()); // Here each option label is printed to the console

        }




         driver.close();
    }
    
    
    public static void navigateBtwPages () {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

        List<WebElement> links = driver.findElements(By.className("/html/body/footer/div/div/div[1]/ul")); // This is how to navigate between several links (applicable to footer links )

        int noOflinks = links.size();

        String path = "(/html/body/footer/div/div/div[1]/ul)";

        for (int i = 1; i < noOflinks; i ++){

            String elementPath = path + "["+i +"]";

            driver.findElement(By.xpath(elementPath)).click();
        }

        System.out.println(noOflinks);
    }


    public static void getAllAnchorLinks (){

        WebDriver driver = new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
       List<WebElement> anchorLinks = driver.findElements(By.xpath("//a")); // Here user is able to get all the anchor tags on a webpage

       for(WebElement e : anchorLinks){

           if(e.getAttribute("href") !=null){

               System.out.println(e.getAttribute("href"));
           }


       }

       driver.close();
    }
}
