import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class Accessurl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		//access the url case
		ChromeOptions option = new ChromeOptions ();
	    option.addArguments("--disable-notifications");
		WebDriver w = new ChromeDriver(option);
		w.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		w.get("https://www.eazydiner.com/");
		//search case
		WebElement ws=w.findElement(By.id("home-search"));
		ws.click();
    	ws.sendKeys("freshmenu");
    	Thread.sleep(2000);
    	ws.submit();
     	w.findElement(By.xpath("//button[@id='apxor_search']")).click();	
    	
    	}
	}


