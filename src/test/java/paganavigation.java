import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paganavigation {

    public static void main (String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");
        driver.navigate().to("https://demoqa.com/webtables"); //Switches to another website
        driver.navigate().back(); // Takes user back to the previous page
        driver.navigate().forward(); // Takes user forward
        driver.navigate().refresh(); // Refreshes the website

      //  pageSource();
      //  submitAction();
       // size ();

        switchDimension ();
    }


    // This is to get page source code
    public static void pageSource (){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/sample");

       String pageSourceCode = driver.getPageSource();

        System.out.println(pageSourceCode);

        driver.close();


    }


    //Using the submit method for login forms, without the need to click on the login button which is the native way

    public static void submitAction (){

        WebDriver driver = new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        driver.findElement(By.id("input-email")).sendKeys("itorobrownn@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("test123#");

        //driver.findElement(By.xpath("//input[@value='Login']")).click();

        driver.findElement(By.id("input-password")).submit();
    }

    //To get the height and weight of buttons and elements

    public  static  void  size (){

        WebDriver driver = new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

       Dimension buttonSize = driver.findElement(By.xpath("//input[@value='Login']")).getSize();

        System.out.println(buttonSize.height);
        System.out.println(buttonSize.width);


    }


    public  static void switchDimension (){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // User create an object for the Dimension method

        Dimension d = new Dimension(400, 500);

        driver.manage().window().setSize(d);


        // This here gets the class in use
        driver.getClass().getSimpleName();
    }
}
