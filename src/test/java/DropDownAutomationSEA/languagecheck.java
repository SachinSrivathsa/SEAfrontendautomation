package DropDownAutomationSEA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Document;

import io.github.bonigarcia.wdm.WebDriverManager;

public class languagecheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		driver.manage().window().maximize();
		
		//Step 1: Print the list of cases
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(5000);
		//Step 2: By default the cases are printed in Danish. Now we change the language to english 
		WebElement language = driver.findElement(By.xpath("//select[@name='language']"));
		Select langChoose = new Select(language);
		langChoose.selectByIndex(1);
		Thread.sleep(1000);
		//Step 3: Press the new case button to check for language changes
		int i;
		for(i=0;i<5;i++) {
			driver.findElement(By.xpath("//button[@class='sc-jrcTuL dpGQOC']")).click();
			Thread.sleep(1000);
			
			
		}
		//Step 4: Reload the page and change the language first and check
		driver.navigate().refresh();
		WebElement language2 = driver.findElement(By.xpath("//select[@name='language']"));
		Select choose = new Select(language2);
		choose.selectByIndex(1);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
