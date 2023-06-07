package DropDownAutomationSEA;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowntc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		// Need to verify if the values are same.
		WebElement status = driver.findElement(By.xpath("//select[@name='status']"));
		Select ddown = new Select(status);
		ddown.selectByIndex(1);

		List<WebElement> ddownList = ddown.getOptions();
		List<String> actualValues = new ArrayList<String>();
		for (int i = 0; i < ddownList.size(); i++) {
			actualValues.add(ddownList.get(i).getText());
		}

		// Getting the actual values of a list.
		// Creating a list of expected value
		List<String> expectedValues = Arrays.asList("All", "Accepted", "Rejected", "Unknown");
		// Comparing the values
		Assert.assertEquals(actualValues, expectedValues);
		if(actualValues.equals(expectedValues)) {
			System.out.println("Match Successful");
		}else {
			System.out.println("Match failed");
		}

	}

}
