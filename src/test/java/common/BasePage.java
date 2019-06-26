package common;
/*
 * @author Helen Lee
 * @create 2019-06-26
 * @description
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;

public class BasePage {
    WebDriver driver;
    private int timeOut=10;

    /*wait the element visitable and clear past input before we "sendKeys"*/
    public void sendKeys(WebElement element,String s){
        new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf(element));//wait for element
        element.clear();
        element.sendKeys(s);
    }

    /*wait the element visitable before we "click"*/
    public void click(WebElement element){
        new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    /*get element*/
    public WebElement findElement(WebElement element){
        new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    /*get elements*/
    public List<WebElement> findElements(List<WebElement> elements){
        Iterator iterator = elements.iterator();
        new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf((WebElement) iterator.next()) );
        return elements;
    }
}
