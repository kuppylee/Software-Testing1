package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private By internetBoxAlertTrigger = By.id("hot-spot");

    WebDriver driver;
    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void setInternetBoxAlertTrigger(){
        Actions actions = new Actions(driver);
        WebElement internetBoxLocator = driver.findElement(internetBoxAlertTrigger);
        actions.contextClick(internetBoxLocator).perform();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }
}
