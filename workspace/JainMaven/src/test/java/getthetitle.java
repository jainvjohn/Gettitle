import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getthetitle {

	

static{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\workspace\\chromedriver.exe");
}

@Test
public void demo()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com");
	
	System.out.println(driver.getTitle());
	System.out.println("***************");
driver.close();
}
}
