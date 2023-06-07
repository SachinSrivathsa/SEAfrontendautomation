package SummaryPageTestCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alignmentcheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		Thread.sleep(1000);
		// Need to check the alignment of the two dropdowns
		WebElement select1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[2]/div/select[1]"));
		WebElement select2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[2]/div/select[2]"));
		// Getting the location of the elements
		Point point = select1.getLocation();
		int xcord = point.getX();
		int ycord = point.getY();
		
		System.out.println(
				"The position of the first dropdown is: " + xcord + "The position of the second dropdown is: " + ycord);

	}

}
