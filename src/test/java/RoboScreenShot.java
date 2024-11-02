import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RoboScreenShot {
    public static void main(String[] args) throws AWTException, IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

        Robot robot = new Robot();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(d);
        BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
        String destination = System.getProperty("user.dir")+"//Screens//test24.png ";
        ImageIO.write(bufferedImage,"PNG", new File(destination));
    }
}
