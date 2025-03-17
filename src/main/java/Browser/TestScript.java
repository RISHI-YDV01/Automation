package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript {

	static  ChromeDriver driver;

	// Test case 1
	public void Positive_LogIn_test() {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(opt);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String actualtitale="Congratulations student. You successfully logged in!";
		String Exp_titale=driver.findElement(By.xpath("//strong[text()='Congratulations student. You successfully logged in!']")).getText();
		if (actualtitale.equals(Exp_titale)) {
			System.out.println(true);
			System.out.print("Page title is: "+Exp_titale);
		}else  {
			System.out.print(false);
		}
		boolean logoutbutton=  driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();
		System.out.print(logoutbutton); 
		System.out.print("logout button is display"); 

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Test case 2
	public void Negative_username_test() {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(opt);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//button[@id='submit']")).click(); 

		String Error_msg =	driver.findElement(By.xpath("//div[@id='error']")).getText();
				System.err.println("Error_msg");
			}

		/*
		 * String actualtitale="Congratulations student. You successfully logged in!";
		 * String Exp_titale=driver.findElement(By.
		 * xpath("//strong[text()='Congratulations student. You successfully logged in!']"
		 * )).getText(); if (actualtitale.equals(Exp_titale)) {
		 * System.out.println(true); System.out.print("Page title is: "+Exp_titale);
		 * }else { System.out.print(false); } boolean logoutbutton=
		 * driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();
		 * System.out.print(logoutbutton);
		 * 
		 * try { Thread.sleep(5000); } catch (InterruptedException e) {
		 * e.printStackTrace(); } }
		 */
		//driver.quit();

	}



