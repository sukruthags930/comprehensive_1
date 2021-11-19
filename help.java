import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class help {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		 ChromeOptions option = new ChromeOptions();
		 option.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(option);
		 driver.manage().window().maximize();
		driver.get("https://www.eazydiner.com/");
		driver.findElement(By.id("help")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[16]/div/div[1]/div[1]/p[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
		Set<String>ids = driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        String Parentid=it.next();
        Thread.sleep(5000L);
        driver.switchTo().window(Parentid);
       driver.findElement(By.xpath("/html/body/div[6]/div/div/div/ul/li[1]/a/span")).click();
	}
}

