package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textfieldlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		//Checking for the maximum elements in the text field.
		WebElement maxText = driver.findElement(By.xpath("//input[@name = 'minAge']"));
		//Typing 20 characters to check the limit
		maxText.sendKeys("8546291969399540789147291110195167571888446042986835816015353420744959667755952371046144530251214339");
		String value = maxText.getAttribute("value");
		int size = value.length();
		if(size==1000) {
			System.out.println("Max limit is reached");
		}else {
			System.out.println("No maximum values");
		}
		WebElement minText = driver.findElement(By.xpath("//input[@name='maxAge']"));
		minText.sendKeys("8546291969399540789147291110195167571888446042986835816015353420744959667755952371046144530251214339");
		String minValue = minText.getAttribute("value");
		int minSize = minValue.length();
		if(minSize==1000) {
			System.out.println("Max limit is reached");
		}else {
			System.out.println("No maximum values");
		}
		//Clicking the submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
