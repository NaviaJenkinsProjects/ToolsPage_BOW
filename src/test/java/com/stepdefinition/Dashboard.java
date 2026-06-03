package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboard extends BaseClass{
	
	
	@When("User Navigate The {string} and {string} Stock")
	public void user_navigate_the_and_stock(String string, String string2) throws InterruptedException, AWTException {
	    
		switch (string) {
		
		case "BSE":
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		       JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.open()"); 

		        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

		        driver.switchTo().window(tabs.get(1));

		        driver.get("https://www.bseindia.com/");
			
			Thread.sleep(1000);
			
			try {
				
				driver.findElement(By.xpath("(//button[@class='btn-close'])[1]")).click();
				
				
			} catch (Exception e) {
				
				//System.out.println("Not Visiable to ");
			}
	
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Enter Security Name / Code / ID / ISIN']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Enter Security Name / Code / ID / ISIN']")).sendKeys(string2);
			
			Thread.sleep(3000);
			Actions ac = new Actions(driver);
			WebElement element3 = driver.findElement(By.xpath("(//a[text()='Tata Consultancy Services Ltd'])[1]"));
			ac.doubleClick(element3).perform();
//			Robot r =new Robot();
//			
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
			
			break;
			
       case "NSE":
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	   
    	   
    	   JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("window.open()"); 
	        Thread.sleep(3000);

	        ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());

	        driver.switchTo().window(tabs1.get(1));
	        Thread.sleep(3000);

	        driver.get("https://www.nseindia.com/get-quotes/equity?symbol="+string2+"");
			
			break;

       case "MCX":
    	   
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	       JavascriptExecutor js11 = (JavascriptExecutor) driver;
	        js11.executeScript("window.open()"); 

	        ArrayList<String> tabs11 = new ArrayList<>(driver.getWindowHandles());

	        driver.switchTo().window(tabs11.get(1));

	        driver.get("https://www.mcxindia.com/");
		
		Thread.sleep(1000);

		try {
			
			driver.findElement(By.xpath("(//div[@class='close_apply_now']//child::img)[2]")).click();
			
		} catch (Exception e) {
			
			System.out.println("Not Visiable Adds Page");
		}
		
		driver.findElement(By.xpath("(//a[text()='market data']//parent::li)[1]")).click();
		
		Thread.sleep(1000);
		
        driver.findElement(By.xpath("(//div[@class='min200 rel noindex']//descendant::a)[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.xpath("//select[@id='ddlInstrumentName']"));
		Select d=new Select(element);
		d.selectByVisibleText("FUTCOM");
		
       Thread.sleep(1000);
		
		WebElement element1 = driver.findElement(By.xpath("(//input[@class='rcbInput radPreventDecorate'])[2]"));
		element1.click();
		
       Thread.sleep(1000);
		
		WebElement element2 = driver.findElement(By.xpath("(//li[text()='"+string2+"'])[1]"));
		element2.click();
		
		 Thread.sleep(1000);
			
			WebElement element21 = driver.findElement(By.xpath("//a[text()='Show']"));
			element21.click();
		
		break;
			
			
		default:
			
			System.out.println("Invalid Your Condition");
			break;
		}
		
		Thread.sleep(3000);
		
	}
	
	@When("User Search any {string} Script by {string}")
	public void user_search_any_script_by(String string, String string2) throws InterruptedException {
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element3 = driver.findElement(By.xpath("//input[@id='project-id']"));
		element3.click();
		Thread.sleep(2000);
		element3.sendKeys(string);
		
		//WebElement element = driver.findElement(By.xpath("//span[text()='"+string+"']//following-sibling::span[text()='"+string2+"']"));
		//Actions ac = new Actions(driver);
		Thread.sleep(2000);
		
		if (string2.equals("MCX")) {
			
			try {
				
				driver.findElement(By.xpath("(//span[text()='Futures'])[2]")).click();
				
			} catch (Exception e) {
				
				driver.findElement(By.xpath("(//span[text()='Futures'])[1]")).click();
				
			}
			
			
			
		}
		//ac.moveToElement(element).build().perform();
		Thread.sleep(6000);
		WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'"+string+"')]//following-sibling::span[text()='"+string2+"'])[1]"));
		element.click();
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath("//div[text()=' Volume ']"));
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].scrollIntoView();", element2);

		Thread.sleep(2000);
	}
	

	@When("User Verify The {string} Market Depth Options {string} Value")
	public void user_verify_the_market_depth_options_value(String string, String string2) throws InterruptedException {
	    
        switch (string) {
		case "BSE":
			
			
	        
	        if (string2.equals("Today Open")) {  
	        	
	        	ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element = driver.findElement(By.xpath("(//div[contains(text(),'"+string2+"')]//following-sibling::div)[1]"));
		        String kk = element.getText();
		        String text = kk.replaceAll("[^0-9.-]", "");
		        //String substring = text.substring(6);
		      
				double a = Double.parseDouble(text);
				System.out.println("Navia Value :-"+string2+" : "+text);
		        
				ArrayList<String> window1 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window1.get(1));
		        Thread.sleep(2000);
	        	
	        	WebElement table = driver.findElement(By.xpath("(//div[@class='card-conatiner']//tbody/tr[2]/td[2])[1]"));
	        	String text2 = table.getText();
	        	String total1 = text2.replaceAll("[^0-9.-]", "");
	        	System.out.println("BSE Value :-"+string2+" : "+total1);
	        	double b = Double.parseDouble(total1);
	 			
	        	Thread.sleep(1000);
	 			if (a == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total1);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
	        	
			}
	        
	        else if (string2.equals("Previous Close")) {
	        	
	        	ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element = driver.findElement(By.xpath("//div[@class='close_price']"));
		        String kk = element.getText();
		        //String substring = text.substring(6);
		        String text = kk.replaceAll("[^0-9.-]", "");
				double a = Double.parseDouble(text);
				System.out.println("Navia Value :-"+string2+" : "+text);
		        
				ArrayList<String> window1 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window1.get(1));
		        Thread.sleep(2000);
	        	
	        	WebElement table = driver.findElement(By.xpath("(//div[@class='card-conatiner']//tbody/tr[1]/td[2])[1]"));
	        	String text2 = table.getText();
	        	String total1 = text2.replaceAll("[^0-9.-]", "");
	        	System.out.println("BSE Value :-"+string2+" : "+total1);
	        	double b = Double.parseDouble(total1);
	 			
	        	Thread.sleep(1000);
	 			if (a == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total1);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
				
			}
	        else {
	        	System.err.println("Invalid");
	        	
	        }
	        
			break;
			
         case "NSE":
			
			
	        
	        if (string2.equals("Today Open")) {  
	        	
	        	ArrayList<String> window2 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window2.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element1 = driver.findElement(By.xpath("(//div[contains(text(),'"+string2+"')]//following-sibling::div)[1]"));
		        String kk = element1.getText();
		        //String substring1 = text1.substring(6);
		        String text1 = kk.replaceAll("[^0-9.-]", "");
				double a1 = Double.parseDouble(text1);
				System.out.println("Navia Value :-"+string2+" : "+text1);
		        
				ArrayList<String> window3 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window3.get(1));
		        Thread.sleep(2000);
	        	
	        	WebElement table = driver.findElement(By.xpath("//div[text()='Open']//following-sibling::div"));
	        	String text2 = table.getText();
	        	String total1 = text2.replaceAll("[^0-9.,-]", "");
	        	System.out.println("NSE Value :-"+string2+" : "+total1);
	        	double b = Double.parseDouble(total1);
	 			
	        	Thread.sleep(1000);
	 			if (a1 == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total1);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
	        	
			}
	        
	        else if (string2.equals("Previous Close")) {
	        	
	        	ArrayList<String> window2 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window2.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element1 = driver.findElement(By.xpath("//div[@class='close_price']"));
		        String kk = element1.getText();
		        //String substring1 = text1.substring(6);
		        String text1 = kk.replaceAll("[^0-9.-]", "");
				double a1 = Double.parseDouble(text1);
				System.out.println("Navia Value :-"+string2+" : "+text1);
		        
				ArrayList<String> window3 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window3.get(1));
		        Thread.sleep(2000);
	        	
	        	WebElement table = driver.findElement(By.xpath("//div[text()='Prev. Close']//following-sibling::div"));
	        	String text2 = table.getText();
	        	String total1 = text2.replaceAll("[^0-9.,-]", "");
	        	System.out.println("NSE Value :-"+string2+" : "+total1);
	        	double b = Double.parseDouble(total1);
	 			
	        	Thread.sleep(1000);
	 			if (a1 == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total1);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
				
			}
	        else {
	        	System.err.println("Invalid");
	        	
	        }
	        
			break;
			
         case "MCX":
   			
   			
   	        
   	        if (string2.equals("Today Open")) {  //(//table[@class='markt marketwatch-table']//tbody//td[contains(text(),'OCT')]//following-sibling::td[7]//child::div)[1]
   	        	
//   	        	LocalDate today = LocalDate.now();
//   	          String monthAbbreviation = today.getMonth()
//   	                  .getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase();
   	        	
   	        	ArrayList<String> window21 = new ArrayList<>(driver.getWindowHandles());
   	   	        driver.switchTo().window(window21.get(0));
   	   	        Thread.sleep(2000);
   	   	        
   	   	        WebElement element11 =driver.findElement(By.xpath("(//div[contains(text(),'"+string2+"')]//following-sibling::div)[1]"));
   	   	        String kk = element11.getText();
   	   	       // String substring11 = text11.substring(6);
   	   	  String text11 = kk.replaceAll("[^0-9.-]", "");
   	   	     WebElement element2 = driver.findElement(By.xpath("//span[@class='dh_sym']"));
   	  	      String text3 = element2.getText();
   	  	    String fg = text3.substring(13, 16);
   	  	String substring = fg.toUpperCase();
   	   			double a11 = Double.parseDouble(text11);
   	   			System.out.println("Navia Value :-"+string2+" : "+text11);
   	   	        
   	   			ArrayList<String> window31 = new ArrayList<>(driver.getWindowHandles());
   	   	        driver.switchTo().window(window31.get(1));
   	   	        Thread.sleep(2000);

   	          System.out.println("Current Feature Month : " + substring);
   	        	
   	        	
   	        	WebElement table = driver.findElement(By.xpath("(//table[@class='markt marketwatch-table']//tbody//td[contains(text(),'"+substring+"')]//following-sibling::td[4])[1]"));
   	        	String text2 = table.getText();
   	        	String total1 = text2.replaceAll("[^0-9.,-]", "");
   	        	System.out.println("MCX Value :-"+string2+" : "+total1);
   	        	double b = Double.parseDouble(total1);
   	 			
   	        	Thread.sleep(1000);
   	 			if (a11 == b) {
   	 				
   	 				String yellow = "\u001B[33m";
   	 			    System.out.println(yellow+"Values are equal : "+total1);
   	 			}
   	 			
   	 			else {
   	 				
   	 				System.err.println("Values are Not equal");
   	 				
   	 			}
   	        	
   			}
   	        
   	        else if (string2.equals("Previous Close")) {
   	        	
   	        	ArrayList<String> window21 = new ArrayList<>(driver.getWindowHandles());
   	   	        driver.switchTo().window(window21.get(0));
   	   	        Thread.sleep(2000);
   	   	        
   	   	        WebElement element11 =driver.findElement(By.xpath("//div[@class='close_price']"));
   	   	        String kk = element11.getText();
   	   	       // String substring11 = text11.substring(6);
   	   	  String text11 = kk.replaceAll("[^0-9.-]", "");
   	   	     WebElement element2 = driver.findElement(By.xpath("//span[@class='dh_sym']"));
   	  	      String text3 = element2.getText();
   	  	      
   	  	    String substringf = text3.substring(13, 16);
   	  	String substring = substringf.toUpperCase();
   	  	    
   	   			double a11 = Double.parseDouble(text11);
   	   			System.out.println("Navia Value :-"+string2+" : "+text11);
   	   	        
   	   			ArrayList<String> window31 = new ArrayList<>(driver.getWindowHandles());
   	   	        driver.switchTo().window(window31.get(1));
   	   	        Thread.sleep(2000);
   	        	
//   	        	LocalDate today = LocalDate.now();
//     	          String monthAbbreviation = today.getMonth()
//     	                  .getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase();

     	          System.out.println("Current Feature Month : " + substring);
     	        	
     	        	
     	        	WebElement table = driver.findElement(By.xpath("(//table[@class='markt marketwatch-table']//tbody//td[contains(text(),'"+substring+"')]//following-sibling::td[8])[1]"));
     	        	
   	        	
   	        	//WebElement table = driver.findElement(By.xpath("(//table[@class='markt marketwatch-table']//tbody/tr[1]/td[11])[1]"));
   	        	String text2 = table.getText();
   	        	String total1 = text2.replaceAll("[^0-9.,-]", "");
   	        	System.out.println("MCX Value :-"+string2+" : "+total1);
   	        	double b = Double.parseDouble(total1);
   	 			
   	        	Thread.sleep(1000);
   	 			if (a11 == b) {
   	 				
   	 				String yellow = "\u001B[33m";
   	 			    System.out.println(yellow+"Values are equal : "+total1);
   	 			}
   	 			
   	 			else {
   	 				
   	 				System.err.println("Values are Not equal");
   	 				
   	 			}
   				
   			}
   	        else {
   	        	System.err.println("Invalid");
   	        	
   	        }
   	        
   			break;
			
			
			

		default:
			
			System.err.println("Invalid Your Condition");
			
			break;
		}
        Thread.sleep(3000); 
		
	}

	@When("User Verify The {string} Market Depth Options Days Range {string} Value")
	public void user_verify_the_market_depth_options_days_range_value(String string, String string2) throws InterruptedException {
	    
		switch (string) {
		case "BSE":
			
			
	        
	        if (string2.equalsIgnoreCase("Low")) {  
	        	
	        	ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element = driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[1]"));
		        String kk = element.getText();
		        String text = kk.replaceAll("[^0-9.-]", "");
		        System.out.println("Navia Value :-"+string2+" : "+text);
		        double a = Double.parseDouble(text);
		        
				ArrayList<String> window1 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window1.get(1));
		        Thread.sleep(2000);
	        	
	        	WebElement table = driver.findElement(By.xpath("(//div[@class='card-conatiner']//tbody/tr[4]/td[2])[1]"));
	        	String total1 = table.getText();
	        	String text2 = total1.replaceAll("[^0-9.-]", "");
	        	System.out.println("BSE Value :-"+string2+" : "+text2);
	        	double b = Double.parseDouble(text2);
	 			
	        	Thread.sleep(1000);
	 			if (a == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+text2);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
	        	
			}
	        
	        else if (string2.equalsIgnoreCase("High")) {
	        	
	        	ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element = driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[2]"));
		        String kk = element.getText();
		        String text = kk.replaceAll("[^0-9.-]", "");
		        System.out.println("Navia Value :- "+string2+" : "+text);
		        double a = Double.parseDouble(text);
		        
				ArrayList<String> window1 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window1.get(1));
		        Thread.sleep(2000);
	        	
	        	WebElement table = driver.findElement(By.xpath("(//div[@class='card-conatiner']//tbody/tr[3]/td[2])[1]"));
	        	String df = table.getText();
	        	String text2 = df.replaceAll("[^0-9.-]", "");
	        	System.out.println("BSE Value :-"+string2+" : "+text2);
	        	double b = Double.parseDouble(text2);
	 			
	        	Thread.sleep(1000);
	 			if (a == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+text2);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
				
			}
	        else {
	        	System.err.println("Invalid");
	        	
	        }
	        
			break;
			
         case "NSE":
			
			
	        if (string2.equalsIgnoreCase("Low")) {  
	        	
	        	ArrayList<String> window2 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window2.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element1 = driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[1]"));
		        String kk = element1.getText();
		        String text1 = kk.replaceAll("[^0-9.-]", "");
		        System.out.println("Navia Value :- "+string2+" : "+text1);
		        double a1 = Double.parseDouble(text1);
		        
				ArrayList<String> window3 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window3.get(1));
		        Thread.sleep(2000);
		        
	        	
	        	WebElement table = driver.findElement(By.xpath("//div[text()='Low ']//following-sibling::div"));
	        	String text2 = table.getText();
	        	System.out.println("NSE Value :-"+string2+" : "+text2);
	        	double b = Double.parseDouble(text2);
	 			
	        	Thread.sleep(1000);
	 			if (a1 == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+text2);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
	        	
			}
	        
	        else if (string2.equalsIgnoreCase("High")) {
	        	
	        	ArrayList<String> window2 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window2.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element1 = driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[2]"));
		        String kk = element1.getText();
		        String text1 = kk.replaceAll("[^0-9.-]", "");
		        System.out.println("Navia Value :- "+string2+" : "+text1);
		        double a1 = Double.parseDouble(text1);
		        
				ArrayList<String> window3 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window3.get(1));
		        Thread.sleep(2000);
		        
	        	
	        	WebElement table = driver.findElement(By.xpath("//div[text()='High ']//following-sibling::div"));
	        	String text2 = table.getText();
	        	System.out.println("NSE Value :-"+string2+" : "+text2);
	        	double b = Double.parseDouble(text2);
	 			
	        	Thread.sleep(1000);
	 			if (a1 == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+text2);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
				
			}
	        else {
	        	System.err.println("Invalid");
	        	
	        }
	        
			break;
			
         case "MCX":
   			
  			
  	        if (string2.equalsIgnoreCase("Low")) {  
  	        	
  	        	ArrayList<String> window21 = new ArrayList<>(driver.getWindowHandles());
  	  	        driver.switchTo().window(window21.get(0));
  	  	        Thread.sleep(2000);
  	  	        
  	  	        WebElement element11 =driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[1]"));
  	  	        String kk = element11.getText();
  	  	    String text11 = kk.replaceAll("[^0-9.-]", "");
  	  	        System.out.println("Navia Value :- "+string2+" : "+text11);
  	  	        double a11 = Double.parseDouble(text11);
  	  	      Thread.sleep(2000);
  	  	      
  	  	      
  	  	    WebElement element2 = driver.findElement(By.xpath("//span[@class='dh_sym']"));
  	 	      String text3 = element2.getText();
  	 	    String substringn = text3.substring(13, 16);
  	 	 String substring = substringn.toUpperCase();
  	  	        
  	  			ArrayList<String> window31 = new ArrayList<>(driver.getWindowHandles());
  	  	        driver.switchTo().window(window31.get(1));
  	  	        Thread.sleep(2000);
  	  	        
//  	        	
//  	        	LocalDate today = LocalDate.now();
//   	          String monthAbbreviation = today.getMonth()
//   	                  .getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase();

   	          System.out.println("Current Feature Month : " + substring);
   	        	
   	        	
   	        	WebElement table = driver.findElement(By.xpath("(//table[@class='markt marketwatch-table']//tbody//td[contains(text(),'"+substring+"')]//following-sibling::td[5]//child::div[contains(@class,'low')])[1]"));
   	        	
  	        	
  	        	//WebElement table = driver.findElement(By.xpath("(//table[@class='markt marketwatch-table']//tbody/tr[1]/td[8]/div[2])[1]"));
  	        	String text2 = table.getText();
  	        	System.out.println("MCX Value :-"+string2+" : "+text2);
  	        	double b = Double.parseDouble(text2);
  	 			
  	        	Thread.sleep(1000);
  	 			if (a11 == b) {
  	 				
  	 				String yellow = "\u001B[33m";
  	 			    System.out.println(yellow+"Values are equal : "+text2);
  	 			}
  	 			
  	 			else {
  	 				
  	 				System.err.println("Values are Not equal");
  	 				
  	 			}
  	        	
  			}
  	        
  	        else if (string2.equalsIgnoreCase("High")) {
  	        	
  	        	ArrayList<String> window21 = new ArrayList<>(driver.getWindowHandles());
  	  	        driver.switchTo().window(window21.get(0));
  	  	        Thread.sleep(2000);
  	  	        
  	  	        WebElement element11 =driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[2]"));
  	  	        String kk = element11.getText();
  	  	    String text11 = kk.replaceAll("[^0-9.-]", "");
  	  	        System.out.println("Navia Value :- "+string2+" : "+text11);
  	  	        double a11 = Double.parseDouble(text11);
  	  	      Thread.sleep(2000);
  	  	      
  	  	      
  	  	    WebElement element2 = driver.findElement(By.xpath("//span[@class='dh_sym']"));
  	 	      String text3 = element2.getText();
  	 	    String substringh = text3.substring(13, 16);
  	  	        
  	 	 String substring = substringh.toUpperCase();
  	 	    
  	  			ArrayList<String> window31 = new ArrayList<>(driver.getWindowHandles());
  	  	        driver.switchTo().window(window31.get(1));
  	  	        Thread.sleep(2000);
  	  	        

//  	        	LocalDate today = LocalDate.now();
//   	          String monthAbbreviation = today.getMonth()
//   	                  .getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase();

   	          System.out.println("Current Feature Month : " + substring);
   	        	
   	        	
   	        	WebElement table = driver.findElement(By.xpath("(//table[@class='markt marketwatch-table']//tbody//td[contains(text(),'"+substring+"')]//following-sibling::td[7]//child::div[contains(@class,'high')])[1]"));
   	        	
  	        	
  	        	//WebElement table = driver.findElement(By.xpath("(//table[@class='markt marketwatch-table']//tbody/tr[1]/td[10]/div)[1]"));
  	        	String text2 = table.getText();
  	        	System.out.println("MCX Value :-"+string2+" : "+text2);
  	        	double b = Double.parseDouble(text2);
  	 			
  	        	Thread.sleep(1000);
  	 			if (a11 == b) {
  	 				
  	 				String yellow = "\u001B[33m";
  	 			    System.out.println(yellow+"Values are equal : "+text2);
  	 			}
  	 			
  	 			else {
  	 				
  	 				System.err.println("Values are Not equal");
  	 				
  	 			}
  				
  			}
  	        else {
  	        	System.err.println("Invalid");
  	        	
  	        }
  	        
  			break;
			

		default:
			
			System.err.println("Invalid Your Condition");
			break;
		}
		
		Thread.sleep(3000);
	}

	@When("User Verify The {string} Market Depth Options year Range {string} Value")
	public void user_verify_the_market_depth_options_year_range_value(String string, String string2) throws InterruptedException {
	    
		switch (string) {
		case "BSE":
			
			
	        
	        if (string2.equalsIgnoreCase("Low")) {  
	        	
	        	ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element = driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[3]"));
		        String kk = element.getText();
		        String text = kk.replaceAll("[^0-9.-]", "");
		        System.out.println("Navia Value :- "+string2+" : "+text);
		        double a = Double.parseDouble(text);
		        
				ArrayList<String> window1 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window1.get(1));
		        Thread.sleep(2000);
	        	
	        	WebElement table = driver.findElement(By.xpath(("(//div[@class='card-b black-bg position-relative']//tbody)[2]/tr[2]/td[2]")));
	        	String text2 = table.getText();
	        	String total = text2.replaceAll("[^0-9.]", "");
	        	System.out.println("BSE Value :-"+string2+" : "+total);
	        	Thread.sleep(2000);
	        	double b = Double.parseDouble(total);
	 			
	        	Thread.sleep(1000);
	 			if (a == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
	        	
			}
	        
	        else if (string2.equalsIgnoreCase("High")) {
	        	
	        	ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element = driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[4]"));
		        String kk = element.getText();
		        String text = kk.replaceAll("[^0-9.-]", "");
		        System.out.println("Navia Value :- "+string2+" : "+text);
		        double a = Double.parseDouble(text);
		        
				ArrayList<String> window1 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window1.get(1));
		        Thread.sleep(2000);
	        	
	        	WebElement table = driver.findElement(By.xpath("(//div[@class='card-b black-bg position-relative']//tbody)[2]/tr[1]/td[2]"));
	        	String text2 = table.getText();
	        	String total = text2.replaceAll("[^0-9.]", "");
	        	System.out.println("BSE Value :-"+string2+" : "+total);
	        	double b = Double.parseDouble(total);
	 			
	        	Thread.sleep(1000);
	 			if (a == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
				
			}
	        else {
	        	System.err.println("Invalid");
	        	
	        }
	        
			break;
			
        case "NSE":
			
			

	        if (string2.equalsIgnoreCase("Low")) {  
	        	
	        	ArrayList<String> window2 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window2.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element1 =driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[3]"));
		        String kk = element1.getText();
		        String text1 = kk.replaceAll("[^0-9.-]", "");
		        System.out.println("Navia Value :- "+string2+" : "+text1);
		        double a1 = Double.parseDouble(text1);
		        
				ArrayList<String> window4 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window4.get(1));
		        Thread.sleep(2000);
		        
		        WebElement data = driver.findElement(By.xpath("//span[contains(text(),'Price Information')]"));
		        
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,500);");

		        js.executeScript("arguments[0].scrollIntoView(true);", data);
	        	
	        	WebElement table = driver.findElement(By.xpath("//div[text()='52 Week Low ']//following-sibling::div"));
	        	String text2 = table.getText();
	        	String total = text2.replaceAll("[^0-9.]", "");
	        	System.out.println("NSE Value :-"+string2+" : "+total);
	        	Thread.sleep(2000);
	        	double b = Double.parseDouble(total);
	 			
	        	Thread.sleep(1000);
	 			if (a1 == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
	        	
			}
	        
	        else if (string2.equalsIgnoreCase("High")) {
	        	
	        	ArrayList<String> window2 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window2.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element1 =driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[4]"));
		        String kk = element1.getText();
		        String text1 = kk.replaceAll("[^0-9.-]", "");
		        System.out.println("Navia Value :- "+string2+" : "+text1);
		        double a1 = Double.parseDouble(text1);
		        
				ArrayList<String> window4 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window4.get(1));
		        Thread.sleep(2000);
		        
		        WebElement data = driver.findElement(By.xpath("//span[contains(text(),'Price Information')]"));
		        
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,500);");

		        js.executeScript("arguments[0].scrollIntoView(true);", data);
		        
	        	WebElement table = driver.findElement(By.xpath("//div[text()='52 Week High ']//following-sibling::div"));
	        	String text2 = table.getText();
	        	String total = text2.replaceAll("[^0-9.]", "");
	        	System.out.println("NSE Value :-"+string2+" : "+total);
	        	double b = Double.parseDouble(total);
	 			
	        	Thread.sleep(1000);
	 			if (a1 == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
				
			}
	        else {
	        	System.err.println("Invalid");
	        	
	        }
	        
			break;
			

		default:
			
			System.err.println("Invalid Your Condition");
			break;
		}
		
		Thread.sleep(3000);
	}

	@When("User Verify The {string} Market Depth Options Daily price range {string} Value")
	public void user_verify_the_market_depth_options_daily_price_range_value(String string, String string2) throws InterruptedException {
	    
		switch (string) {
		case "BSE":
			
			
	        
	        if (string2.equalsIgnoreCase("Min")) {  
	        	
	        	ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element = driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[1]"));
		        String text = element.getText();
		        String tota2 = text.replaceAll("[^0-9.]", "");
		        System.out.println("Navia Value :-"+string2+" : "+tota2);
		        double a = Double.parseDouble(tota2);
		        
				ArrayList<String> window1 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window1.get(1));
		        Thread.sleep(2000);
		        
	        	WebElement table = driver.findElement(By.xpath("(//div[@class='card-b black-bg position-relative']//tbody)[2]/tr[4]/td[2]"));
	        	String text2 = table.getText();
	        	String total1 = text2.replaceAll("[^0-9.]", "");
	        	System.out.println("BSE Value :-"+string2+" : "+total1);
	        	double b = Double.parseDouble(total1);
	 			
	        	Thread.sleep(1000);
	 			if (a == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total1);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
	        	
			}
	        
	        else if (string2.equalsIgnoreCase("Max")) {
	        	
	        	ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window.get(0));
		        Thread.sleep(2000);
		        
		        WebElement element = driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[2]"));
		        String text = element.getText();
		        String tota2 = text.replaceAll("[^0-9.]", "");
		        System.out.println("Navia Value :-"+string2+" : "+tota2);
		        double a = Double.parseDouble(tota2);
		        
				ArrayList<String> window1 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window1.get(1));
		        Thread.sleep(2000);
	        	
	        	WebElement table = driver.findElement(By.xpath("(//div[@class='card-b black-bg position-relative']//tbody)[2]/tr[3]/td[2]"));
	        	String text2 = table.getText();
	        	String total = text2.replaceAll("[^0-9.]", "");
	        	System.out.println("BSE Value :-"+string2+" : "+total);
	        	double b = Double.parseDouble(total);
	 			
	        	Thread.sleep(1000);
	 			if (a == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
				
			}
	        else {
	        	System.err.println("Invalid");
	        	
	        }
	        
			break;
			
        case "NSE":
			
			
	        
	        if (string2.equalsIgnoreCase("Min")) {  
	        	
	        	ArrayList<String> window2 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window2.get(0));
		        Thread.sleep(3000);
		        
		        WebElement element1 = driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[1]"));
		        String text1 = element1.getText();
		        String tota21 = text1.replaceAll("[^0-9.]", "");
		        System.out.println("Navia Value :-"+string2+" : "+tota21);
		        double a1 = Double.parseDouble(tota21);
		        
				ArrayList<String> window11 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window11.get(1));
		        Thread.sleep(3000);
	        	
	        	WebElement table = driver.findElement(By.xpath("//div[text()='Lower Band']//following-sibling::div"));
	        	String text2 = table.getText();
	        	String total1 = text2.replaceAll("[^0-9.]", "");
	        	System.out.println("NSE Value :-"+string2+" : "+total1);
	        	double b = Double.parseDouble(total1);
	 			
	        	Thread.sleep(1000);
	 			if (a1 == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total1);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
	        	
			}
	        
	        else if (string2.equalsIgnoreCase("Max")) {
	        	
	        	ArrayList<String> window2 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window2.get(0));
		        Thread.sleep(3000);
		        
		        WebElement element1 = driver.findElement(By.xpath("(//div[text()='"+string2+"']//parent::div//child::span)[2]"));
		        String text1 = element1.getText();
		        String tota21 = text1.replaceAll("[^0-9.]", "");
		        System.out.println("Navia Value :-"+string2+" : "+tota21);
		        double a1 = Double.parseDouble(tota21);
		        
				ArrayList<String> window11 = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(window11.get(1));
		        Thread.sleep(3000);
	        	
	        	WebElement table = driver.findElement(By.xpath("//div[text()='Upper Band']//following-sibling::div"));
	        	String text2 = table.getText();
	        	String total = text2.replaceAll("[^0-9.]", "");
	        	System.out.println("NSE Value :-"+string2+" : "+total);
	        	double b = Double.parseDouble(total);
	 			
	        	Thread.sleep(1000);
	 			if (a1 == b) {
	 				
	 				String yellow = "\u001B[33m";
	 			    System.out.println(yellow+"Values are equal : "+total);
	 			}
	 			
	 			else {
	 				
	 				System.err.println("Values are Not equal");
	 				
	 			}
	 			
				
			}
	        else {
	        	System.err.println("Invalid");
	        	
	        }
	        
			break;
			

		default:
			
			System.err.println("Invalid Your Condition");
			break;
		}
		
		Thread.sleep(3000);
		
	}
	
	@Then("User Close The Current Window")
	public void user_close_the_current_window() throws InterruptedException {
	    
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.close();
        driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		
	}
	
	
	
	
	

}
