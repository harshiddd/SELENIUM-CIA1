package Q1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
    	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		co.addArguments ("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
		WebElement box1=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		box1.sendKeys("macbook");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		String one=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(one);
		String two=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(two);
		String three=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(three);
		String four=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(four);
		String five=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(five);
		//filter
		driver.findElement(By.xpath("//*[@id=\"p_36/7252032031\"]/span/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"p_n_pattern_browse-bin/1464446031\"]/span/a/span")).click();
	}
}