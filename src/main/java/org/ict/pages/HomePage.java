package org.ict.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public void SoftwareBlog(){
		WebElement blog=driver.findElement(By.xpath("//a[@href='https://www.eviltester.com/blog/'and@target='_blank']"));
		blog.click();
	}
	public void Resources() {
		WebElement Resource=driver.findElement(By.xpath("//a[text()='Resources']"));
		Resource.click();
	}
	/*List<WebElement> dropDownOptions = driver.findElements(By.xpath("//ul[@class='dropdownmenu']//a"));
	for(int i=0;i<dropDownOptions.size();i++) {
		System.out.println(dropDownOptions.get(i).getText());
		if(dropDownOptions.get(i).getText().contains("Agile testing")) {
			dropDownOptions.get(i).click();
			break;
		}*/
	public void AgileTesting() {
		
WebElement Agile=driver.findElement(By.xpath("//a[@href='/agile']"));
		Agile.click();
	}
	public void HomeButton() {
		WebElement hbutton=driver.findElement(By.xpath("//a[@class='brand-link'and@href='/']"));
		hbutton.click();
	}
}
