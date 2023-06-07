package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;

public class brokenlinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		Thread.sleep(2000);
		// Checking for broken links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// Printing the number of links
		System.out.println(links.size());

		int i;
		for (i = 0; i < links.size(); i++) {
			// Using href attribute to get the URL
			WebElement url = links.get(i);
			String urlLinks = url.getAttribute("href");
			URL lin = new URL(urlLinks);
			//Creating a connection using URL option
			HttpURLConnection httpConn = (HttpURLConnection) lin.openConnection();
			//Setting a waiting time to establish a connection
			Thread.sleep(2000);
			//Establishing connection
			httpConn.connect();
			int responseCode = httpConn.getResponseCode();
			//If the response code is above 400, it is a broken link.
			if(responseCode >= 400) {
			System.out.println(urlLinks + " - " + " is broken");	
			}else {
				System.out.println(urlLinks + " - " + " is a valid link");	
			}
		}

	}

}
