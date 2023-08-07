package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;

public class InstaPage extends Driver{
	
	SeleniumUtility sel = new SeleniumUtility();
	
	@FindBy(xpath="//div[@class='flex justify-end items-center pr-2 sm:pr-4 md:pr-6 xl:pr-12 loan-hero-image']//form[@class='flex flex-col gap-y-4 p-4 text-white bg-primary rounded-lg sm:p-8 md:max-w-md lg:max-w-md']//div//input[@id='mobile-number']")
	private WebElement MobilenumberTF;
	@FindBy(xpath="//div[@class='flex justify-end items-center pr-2 sm:pr-4 md:pr-6 xl:pr-12 loan-hero-image']//input[@id='agreement']")
	private WebElement agreementnotebox;
	@FindBy(xpath="//div[@class='flex justify-end items-center pr-2 sm:pr-4 md:pr-6 xl:pr-12 loan-hero-image']//button[@id='submit']")
	private WebElement SubmitButton;
	@FindBy(xpath="//button[text()='Correct']")
	private WebElement CorrectBtn;
	@FindBy(xpath="//button[text()='Close']")
	private WebElement CloseBtn;
	@FindBy(xpath="//button[text()='Next']")
	private WebElement NextBtn;
	@FindBy(xpath="//p[text()='Business Owner']")
	private WebElement BusinessOwnerTF;
	@FindBy(xpath="//p[text()='Books and Stationary']")
	private WebElement BooksandStationaryTF;
	@FindBy(xpath="//img[@alt='arrow']")
	private WebElement ArrowBtn;
	@FindBy(xpath="//input[@value='>36 months']")
	private WebElement entermonthvalue;
	@FindBy(xpath="//select[@class='px-4 py-3 w-full']")
	private WebElement Buisnessnaturedropdown;
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement Textbtn;
	@FindBy(xpath="//p[text()='Expansion']")
	private WebElement ExpansionButton;
	@FindBy(xpath="//input[@name='business-name']")
	private WebElement BuisnessNameTF;
	@FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
	private WebElement placeholderTF;
	@FindBy(xpath="//input[@name='business-address']")
	private WebElement buisnessaddresTF;
	
	
	
	
	
	public InstaPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	 public void clickbusinessnameTF(String Businessname) {
		 BuisnessNameTF.sendKeys(Businessname);
	 }
	
	 public void placeholderclick(String date) {
		 placeholderTF.sendKeys(date); 
	 }
	 
	 public void SendBuisnessaddressTF(String Buisnessaddress) {
		 buisnessaddresTF.sendKeys(Buisnessaddress);
	 }
	
	
	 public void selectDropdownvalue() {
		 ArrowBtn.click();
		 entermonthvalue.click();
	 }
	 public void clickTextButton() {
		 Textbtn.click();
	 }
	 
	 
	 
	 public void Expansion() {
		 ExpansionButton .click();
	 }
	 
	 public void selectBuisnessnatureDropdown() {
		  sel.selectByvalue(Buisnessnaturedropdown, "1");
	 }
	
	 public void BuisnessOwnerTF() {
		 BusinessOwnerTF.click();
	 }
	 
	 public void BooksandStationaryTF() {
		 BooksandStationaryTF.click();
	 }
    
	public void entermobilenumber(String number) {
		MobilenumberTF.sendKeys(number);
		agreementnotebox.click();
		SubmitButton.click();
	}
	
	public void clicksubmitbutton() {
		CorrectBtn.click();
	}
	
	public void clickclosebutton() {
		CloseBtn.click();
	}
	
	public void ClickNextButton() {
		NextBtn.click();
	}
	
	
}
