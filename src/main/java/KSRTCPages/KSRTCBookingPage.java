package KSRTCPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class KSRTCBookingPage {
    WebDriver driver;
   public @FindBy(xpath = "//div[@id=\"fromCity_chosen\"]") WebElement fromCity;
   public @FindBy(xpath = "//div[@id=\"toCity_chosen\"]") WebElement toCity;
   public @FindBy(xpath = "//*[@id=\"fromCity_chosen\"]/div/div[1]/input") WebElement searchFromYourCityName ;
    public @FindBy(xpath = "//*[@id=\"toCity_chosen\"]/div/div[1]/input") WebElement searchToYourCityName ;
    public @FindBy(xpath = "//input[@id=\"departDate\"]") WebElement ArrivalDate;
    public @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[1]/a") WebElement MyArrivalDate;
    public @FindBy(xpath = "//div[@id=\"submitSearch\"]") WebElement SearhButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div/div/div[5]/div[7]/div") WebElement Seat;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div[5]/div[11]") WebElement MySeat;

    public @FindBy(xpath = "//div[@class=\"point-inp flex-vc active\"]")WebElement boardingPoint;
    public @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]")WebElement droppingPoint;
    @FindBy(xpath = "//div[@class=\"btnPassDetails\"]")WebElement PassDetails;
    @FindBy(xpath = "//input[@name=\"mobileNo\"]")WebElement PassNumber;
    @FindBy(xpath = "//input[@name=\"email\"]")WebElement PassEmail;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[1]/div[2]") WebElement MakePayment;
    public @FindBy(xpath="//input[@ name=\"paxName[0]\"]")WebElement PassName;
    public @FindBy(xpath="//input[@ name=\"paxGender[0]\"]")WebElement PassGander;
    public @FindBy(xpath = "//input[@name=\"paxAge[0]\"]")WebElement Age;
    public @FindBy(xpath = "//input[@name=\"paxAge[0]\"]")WebElement Concession;
    public @FindBy(xpath = "//input[@droptype=\"onward_idCardType\"]")WebElement IdCard;
    public @FindBy(xpath = "//input[@ name=\"paxIDCardNo[0]\"]")WebElement IdCardNo;





    public KSRTCBookingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectRoute(String from, String to) {
        fromCity.sendKeys(from);
        toCity.sendKeys(to);
    }



    public void clickSearch() {
        SearhButton.click();
    }
    public void clickMyArrivalDate() {
        MyArrivalDate.click();
    }
    public void clickArrivalDate() {
        ArrivalDate.click();
    }
    public void clickSelectSeat() {
        Seat.click();
    }
    public void clickSelectMySeat() {
        MySeat.click();
    }
    public void clickPassDetails() {
        PassDetails.click();
    }
    public void TypePassNumber(String num) {
        PassNumber.sendKeys(num);
    }
    public void TypePassEmail(String Email) {
        PassEmail.sendKeys( Email);
    }
    public void TypePassName(String name) {
        PassName.sendKeys( name);
    }
    public void clickMakePayment() {
        MakePayment.click();
    }
    public void TypePassAge(int num) {
        Age.sendKeys(String.valueOf(num));
    }
    public void TypeIdCardNo(int num) {
        IdCardNo.sendKeys(String.valueOf(num));
    }

  }
