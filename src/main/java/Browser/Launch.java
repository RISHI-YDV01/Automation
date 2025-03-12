package Browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	static  ChromeDriver driver;

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(opt);
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();

		System.out.println("Page title is: " + title);
		System.out.println("Page title is: " + url);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//driver.quit();
	}
}


