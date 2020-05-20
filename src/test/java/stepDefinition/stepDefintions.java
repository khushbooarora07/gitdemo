package stepDefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import resources.base;

public class stepDefintions extends base{
	
	public WebDriver driver;
	

    @Given("^User is on greenkart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
    	
		driver = initialisebrowser();
		    
    }

    @When("^user search for \"([^\"]*)\" vegetable$")
    public void user_search_for_something_vegetable(String strArg1) throws Throwable {
    	
    	driver.findElement(By.cssSelector(".search-keyword")).sendKeys(strArg1);
    	System.out.println("learning  GITHUb");
    	System.out.println("learning  GITHUb change 2 ");
    	//driver.findElement(By.cssSelector(".search-button")).click();
    	Thread.sleep(2000);
  
    }

    @SuppressWarnings("deprecation")
	@Then("^\"([^\"]*)\" result is displayed$")
    public void something_result_is_displayed(String strArg1) throws Throwable {
    
   int products = driver.findElements(By.cssSelector(".products")).size();
   int count=1;
   Assert.assertEquals(count, products);
   
    String textdisplayed = driver.findElement(By.cssSelector("h4.product-name")).getText();
    System.out.println(textdisplayed);
   Assert.assertTrue(textdisplayed.contains(strArg1));
 
    }
    
    @And("^Add 2 quantities to the cart$")
    public void add_2_quantities_to_the_cart() throws Throwable {
    int i=1;
    	while(i<3)
    	{
    		driver.findElement(By.cssSelector(".increment")).click();
    	
    		i++;
    	}
    	
    	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
    	
    }
    

    @And("^Add \"([^\"]*)\" quantities to the cart$")
    public void add_something_quantities_to_the_cart(int strArg1) throws Throwable {
    	int i=1;
    	while(i < strArg1)
    	{
    		driver.findElement(By.cssSelector(".increment")).click();
    		i++;
    	}
    	
    	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
    	System.out.println("learning  GITHUb");
    	System.out.println("learning  GITHUb change 2 ");
    	
    }
    
    @Then("^validate the cart with \"([^\"]*)\" items$")
    public void validate_the_cart_with_something_items(String strArg1) throws Throwable {
        
    	driver.findElement(By.cssSelector(".cart-icon")).click();
    	Assert.assertTrue(driver.findElement(By.cssSelector(".quantity")).getText().contains(strArg1));
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        System.out.println("learning  Branches");
        
    	
    }

    
    }
  
