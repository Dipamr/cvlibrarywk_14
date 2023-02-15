package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement JobTitle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement Location;
    @CacheLookup
    @FindBy(xpath = "//select[@class='hp-distance form__select']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOption;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement SalaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement JobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public void enterJobTitle(String title) {
        sendTextToElement(JobTitle, title);


    }

    public void enterLocation(String loction) {
        sendTextToElement(Location, loction);


    }

    public void selectDistanceFromDropDown(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }


    public void clickOnMoreSearchOption() {
        clickOnElement(moreSearchOption);
    }

    public void enterSalaryMin(String minSalary) {
        sendTextToElement(salaryMin, minSalary);

    }

    public void enterSalaryMax(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);

    }

    public void selectSalaryTypeDropDown(String sType) {
        selectByValueFromDropDown(SalaryTypeDropDown, sType);
    }


    public void selectJobTypeDropDown(String jobType) {
        selectByValueFromDropDown(JobTypeDropDown, jobType);
    }

    public void clickOnFINDJOBS() {
        clickOnElement(findJobsBtn);


    }

    public String verifyTheResults(String Text) {
        return getTextFromElement(resultText);

    }


        public void acceptCookiesandSwitchToIframe () throws InterruptedException {
            driver.switchTo().frame("gdpr-consent-notice");
            Thread.sleep(400);
            WebElement acceptCookies = driver.findElement(By.xpath("//span[contains(text(),'Accept All')]"));
            acceptCookies.click();


        }


    }




