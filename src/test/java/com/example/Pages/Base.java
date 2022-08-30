package com.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {

    public String basePage(){
        return "https://www.saucedemo.com/";
    }

    public WebElement userName(WebDriver driver){
        return driver.findElement(By.xpath("//input[@id='user-name']"));
    }

    public WebElement passWord(WebDriver driver){
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement loginButton(WebDriver driver){
        return driver.findElement(By.xpath("//input[@id='login-button']"));
    }
}
