package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		//Automating the first drop down
		WebElement textVal = driver.findElement(By.xpath("//label[contains(text(),'Accepted/Rejected')]"));
		//Verifying if the text is displayed.
		Thread.sleep(2000);
		if(textVal.isDisplayed()) {
			System.out.println("Text is displayed");
		}else {
			System.out.println("Text is not displayed");
		}
		//Validating the actual and expected text
		String expectedText = "Accepted/Rejected";
		String actualText = textVal.getText();
		if(actualText.equals(expectedText)) {
			System.out.println("The expected text is equal to: " +actualText);
		}else {
			System.out.println("The actual text is "+ actualText + ". The expected and actual text are not equal");
		}
		
		WebElement textVal2 = driver.findElement(By.xpath("//label[contains(text(),'Motive')]"));
		if(textVal2.isDisplayed()) {
			System.out.println("Text is displayed");
		}else {
			System.out.println("Text is not displayed");
		}
		String expectedText1 = "Motive";
		String actualText1 =textVal2.getText();
		if(actualText1.equals(expectedText1)) {
			System.out.println("The expected text is equal to: " +actualText1);
		}else {
			System.out.println("The actual text is "+ actualText1 + ". The expected and actual text are not equal");
		}
		
		WebElement textVal3 = driver.findElement(By.xpath("//label[contains(text(),'Country of Origin')]"));
		if(textVal3.isDisplayed()) {
			System.out.println("Text is displayed");
		}else {
			System.out.println("Text is not displayed");
		}
		String expectedText3 = "Country of Origin";
		String actualText3 = textVal3.getText();
		if(actualText3.equals(expectedText3)) {
			System.out.println("The expected text is equal to: " +actualText3);
		}else {
			System.out.println("The actual text is "+ actualText3 + ". The expected and actual text are not equal");
		}
		
		WebElement textVal4 = driver.findElement(By.xpath("//label[contains(text(),'Gender')]"));
		if(textVal4.isDisplayed()) {
			System.out.println("Text is displayed");
		}else {
			System.out.println("Text is not displayed");
		}
		String expectedText4 = "Gender";
		String actualText4 = textVal4.getText();
		if(actualText4.equals(expectedText4)) {
			System.out.println("The expected text is equal to: " +actualText4);
		}else {
			System.out.println("The actual text is "+ actualText4 + ". The expected and actual text are not equal");
		}
		
	
	}

}
