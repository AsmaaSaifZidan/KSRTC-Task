package KSRTCTestPages;

import KSRTCPages.KSRTCBookingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    KSRTCBookingPage ksrt;

    @BeforeTest
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        ksrt=new KSRTCBookingPage(driver);
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Ensures the browser closes after the test
        }
    }
}
