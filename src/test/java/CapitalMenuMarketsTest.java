import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Random;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class CapitalMenuMarketsTest extends BaseTest {
    @Test
    @DisplayName("Widget 'Trading instrument' в выпадающем меню раздела 'Markets'")
    public void checkMenuMarketsWidgetTest(){
        int i = new Random().nextInt(menu.getButtonsTradeMenuMarketsMainPage().size());
        mainPage
                .openMenu()
                .getButtonsTradeMenuMarketsMainPage()
                .get(i)
                .click();
        webdriver().shouldHave(urlContaining("https://capital.com/trading/platform/charting"), Duration.ofSeconds(5));
    }

    @Test
    @DisplayName("Кнопка Sell на Widget 'Trading instrument' заголовка 'Markets'")
    public void checkButtonSellTradingInstrumentOnTheWidgetInTitleMarketsTest(){
        mainPage
                .openMenu()
                .marketsPage()
                .checkButtonSell();
    }

    @Test
    @DisplayName("Кнопка Buy на Widget 'Trading instrument' заголовка 'Markets'")
    public void checkButtonBuyTradingInstrumentOnTheWidgetInTitleMarketsTest(){
        mainPage
                .openMenu()
                .marketsPage()
                .checkButtonBuy();
    }

    @Test
    @DisplayName("Кнопка 'Create account' раздела 'Still looking for a broker you can trust?' заголовка 'Markets'")
    public void checkButtonCreateAccountOnTheBlockStillLookingForTest(){
        mainPage.openMenu().marketsPage();
        stillLookingFor.getBlockBlackStillLookingFor().scrollTo();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        stillLookingFor.getButtonCreateBlockStillLooking().click();
        sleep(1000);
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        } else if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        } else {
            logIn.getFormLogin().isDisplayed();
            logIn.getButtonCloseFormLogin().click();
        }
    }

}
