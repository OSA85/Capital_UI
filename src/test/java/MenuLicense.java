import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * выпадающий список лицензий
 */
@Data
public class MenuLicense {

    private final SelenideElement listLicense =$x("//button [@class='cc-toggleLicense__btn']");

    private final SelenideElement licenseASIC = $x("//a[@href='https://capital.com/?license=ASIC']");
    private final SelenideElement licenseFCA = $x("//a[@href='https://capital.com/?license=FCA']");
    private final SelenideElement licenseCYSEC = $x("//a[@href='https://capital.com/?license=CYSEC']");
    private final SelenideElement licenseNBRB = $x("//a[@href='https://capital.com/?license=NBRB']");
    private final SelenideElement licenseLLC = $x("//a[@href='https://capital.com/?license=CCSTV']");
    private final SelenideElement licenseFSA = $x("//a[@href='https://capital.com/?license=SEY']");
    private final SelenideElement licenseSCB = $x("//a[@href='https://capital.com/?license=BAH']");
    private final SelenideElement ourGlobalOffices = $x("//a[@href='https://capital.com/international-offices']");

    public void choseLicense (SelenideElement license){
        listLicense.click();
        sleep(500);
        license.click();
    }

    public MainPage choseLicenseOnMainPage (SelenideElement license){
        license.click();
        return new MainPage();
    }
}
