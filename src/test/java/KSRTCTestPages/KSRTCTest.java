package KSRTCTestPages;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Map;
import Uilits.Utils;
public class KSRTCTest extends TestBase {
    @Test
    public void testKSRTCBooking( ) throws InterruptedException {
        Utils.selectFromAutocomplete((By) ksrt.fromCity,"CHIKKAMA","CHIKKAMAGALURU");
        Utils.selectFromAutocomplete((By) ksrt.toCity,"BENGAL","BENGALURU");
        ksrt.clickArrivalDate();
        ksrt.clickMyArrivalDate();
        ksrt.clickSearch();
        ksrt.clickSelectSeat();
        Thread.sleep(5000);
        ksrt.clickSelectMySeat();
        Utils.selectFromDropdownByIndex((By)ksrt.boardingPoint,0);
        Utils.selectFromDropdownByIndex((By)ksrt.droppingPoint,0);
        ksrt.clickPassDetails();
        ksrt.TypePassNumber("6789125987");
        ksrt.TypePassEmail("as@gmail.com");
        ksrt.clickMakePayment();
        ksrt.TypePassName("Asmaa");
        ksrt.TypePassAge(24);
        Utils.selectFromDropdownByIndex((By)ksrt.PassGander,0);
        Utils.selectFromDropdownByIndex((By)ksrt.Concession,0);
        Utils.selectFromDropdownByIndex((By)ksrt.IdCard,0);
        ksrt.TypeIdCardNo(1231231);

    }
}
