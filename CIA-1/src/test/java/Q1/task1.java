package Q1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {
    public static void main( String[] args ) throws InterruptedException
    {
    	ChromeOptions co = new ChromeOptions();
    	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
    	co.addArguments("--remote-allow-origins=*");
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.amazon.in/dp/B0BT6W2P11/ref=syn_sd_onsite_desktop_0?ie=UTF8&psc=1&pf_rd_p=b7bab328-2147-46ed-8a61-81e78a5120b2&pf_rd_r=VZ0A49S0GMBN9KKETWNH&pd_rd_wg=oGFL5&pd_rd_w=9yqPx&pd_rd_r=65543014-abc1-4069-a9e6-4d918f34467e");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String etitle = "ASUS TUF Gaming A15, 15.6-inch (39.62 cms) FHD 144Hz, AMD Ryzen 5 4600H, 4GB NVIDIA GeForce GTX 1650, Gaming Laptop (8GB/512GB SSD/Windows 11/Black/2.3 Kg), FA506IHRZ-HN111W : Amazon.in: Computers & Accessories";
        System.out.println(title);
        if(title.equals(etitle)) {
        	System.out.println("Title is matching");
        }
        else {
        	System.out.println("Title Mismatch");
        }
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000); 
        Boolean present = driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).isDisplayed();
        System.out.println("Is item added to cart:" + present);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        Thread.sleep(2000);
        String removeText = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
        String extext = "Your Amazon Cart is empty.";
        if(removeText.equals(extext)) {
        	System.out.println("Product is removed");
        }
        driver.get("https://www.amazon.in/dp/B0BT6W2P11/ref=syn_sd_onsite_desktop_0?ie=UTF8&psc=1&pf_rd_p=b7bab328-2147-46ed-8a61-81e78a5120b2&pf_rd_r=VZ0A49S0GMBN9KKETWNH&pd_rd_wg=oGFL5&pd_rd_w=9yqPx&pd_rd_r=65543014-abc1-4069-a9e6-4d918f34467e");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name=\"proceedToRetailCheckout\"] "));
        Thread.sleep(1000);
        String sign = driver.getTitle();
        System.out.println(sign);
        String esign = "Amazon Sign In";
        if(sign.equals(esign)) {
        	System.out.println("Success");
        }
        else {
        	System.out.println("Failure");
        }
    }
}