package com.baseclass.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getProperty(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void BrowserOpen(String linkurl) {
		driver.get(linkurl);
	}
	public static void currenturlTitle() {
		driver.getCurrentUrl();
		
	}
    public static void Title() {
    	driver.getTitle();
    }
    public static void moveTo(String linkname) {
    	driver.navigate().to(linkname);
    }
    public static void moveBack() {
    	driver.navigate().back();
    }
    public static void moveForward() {
    	driver.navigate().forward();
    }
    public static void PageRestore() {
    	driver.navigate().refresh();
    }
    public static void pagenotificationAlert() {
    	Alert Salert = driver.switchTo().alert();
    	Salert.accept();
    }
    public static void ConfirmAlert() {
    	Alert Calert = driver.switchTo().alert();
    	Calert.accept();
    }
    public static void PromptAlert() {
    	Alert Palert = driver.switchTo().alert();
    	Palert.accept();
   }
    
   public static void performClick(WebElement element) {
   Actions ac = new Actions(driver);
   ac.click(element).build().perform();
   }
   
   public static void performContextClick(WebElement element) {
	   Actions ac = new Actions(driver);
	   ac.contextClick(element).build().perform();
	   }
   
   public static void performDoubleClick(WebElement element) {
	   Actions ac = new Actions(driver);
	   ac.doubleClick(element).build().perform();
	   }
   
   public static void performMove(WebElement element) {
	   Actions ac = new Actions(driver);
	   ac.moveToElement(element).build().perform();
	   }
   
   public static void performDrag(WebElement source,WebElement target) {
	   Actions ac = new Actions(driver);
	   ac.dragAndDrop(source,target).build().perform();
	   }
   
   public static void Window(WebElement mframe) {
	   mframe.click();
	  driver.switchTo().frame(0);
   }
   
   public static void frameDefault(WebElement nframe) {
	   nframe.click();
	  driver.switchTo().frame(0);
   }
   
   public static void automateDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
   }
   
   public static void automateEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
   }
   
   public static void manageWindow() {
	   driver.getWindowHandle();
   }
   public static void manageWindows() {
	   driver.getWindowHandles();
   }
   public static void selectfromList(WebElement element) {
	   Select s = new Select(element);
	   List<WebElement> options = s.getOptions();
	   for (WebElement alloptions : options) {
		   String text = alloptions.getText();
		   System.out.println(text);
	   }
		
	}
   public static void elementVisible(WebElement element) {
	   element.isSelected();
   }
   
   public static void elementView(WebElement element) {
	   element.isEnabled();
   }
   
   public static void selectfromLists(WebElement element,String options,String input) {
	   Select s = new Select(element);
	   if(options.equalsIgnoreCase("index"))
	   {
		   int parseInt = Integer.parseInt(input);
		   s.selectByIndex(parseInt);
	   }
	   else if
	   (options.equalsIgnoreCase("value")) {
		   s.selectByVisibleText(input);
	   }
   }
	  
	   //public static void toselectAll (WebElement element1) {
		 //  Select s1= new Select(element1);
	// List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
	//  for (WebElement allsoptions: allSelectedOptions {
	//    String text = allsoptions.getText();
	//  System.out.println(text);
			
          public static void firstSelect(WebElement element) {
        	  Select s = new Select(element);
        	  WebElement firstSelectedOption = s.getFirstSelectedOption();
        	  String text = firstSelectedOption.getText();
          }
		   
          public static void togetAttribute(By searchbutton) {
        	  WebElement element= driver.findElement(searchbutton);
        	  System.out.println(element);
        	  
        }
   
          public static void timewait() {
        	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
          }
          
          public static void takePhoto() throws IOException {
        	  TakesScreenshot ts =(TakesScreenshot)driver;
        	  File source= ts.getScreenshotAs(OutputType.FILE);
        	  File destination = new File("E:\\Eclipse WorkSpace\\Final_Project\\Screenshot\\name.png");
              FileUtils.copyFile(source, destination);
          }
          public static void giveInput(WebElement element,String value) {
        	  element.sendKeys(value);
          }
          
          public static void Submit(WebElement element ) {
        	  element.click();
          }  
        	  public static void SessionClose() {
        		  driver.close();
        	  }

			public static WebDriver getBrowser(String browser) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public static void inputvalue(WebElement element,String s) {
				element.sendKeys(s);
				
			}
			public static void ClickOnElement(WebElement element) {
				element.click();
			}

         // public static void DropDown(WebElement element, String option, String input) {
        		//if(option.equals("text")) {
        		//	Select s = new Select(element);
        			//s.selectByVisibleText(input);
        			//}else if(option.equals("value")) {
        				//Select s = new Select(element);
        				//s.selectByValue(input);
        		//	}
        		
        	 
				
			
//}
public static void DropDown(WebElement element,String type,String value) {
	
	Select s=new Select(element);
	if (type.equalsIgnoreCase("byIndex")) {
		int index = Integer.parseInt(value);
		s.selectByIndex(index);
			}
	else if (type.equalsIgnoreCase("byValue")) {
		s.selectByValue(value);
		 }
	else if (type.equalsIgnoreCase("text")) {
		
		s.selectByVisibleText(value);
		 }
}
}
     
   
   
   

   
   
   






  