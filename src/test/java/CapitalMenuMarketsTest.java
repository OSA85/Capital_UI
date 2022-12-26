import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Random;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class CapitalMenuMarketsTest extends BaseTest {
    LangPage langPage = new LangPage();
    MenuLicense menuLicense = new MenuLicense();
    MainBanner mainBanner = new MainBanner();
    LogIn logIn = new LogIn();
    TradeNow tradeNow = new TradeNow();
    Menu menu = new Menu();


    @Test
    @DisplayName("Widget 'Trading instrument' в выпадающем меню раздела 'Markets'")
    public void checkMenuMarketsWidgetTest(){
        mainPage.openMenu();
        int i = new Random().nextInt(menu.getButtonsTradeMenuMarketsMainPage().size());
        menu.getButtonsTradeMenuMarketsMainPage().get(i).click();
        webdriver().shouldHave(urlContaining("https://capital.com/trading/platform/charting/"), Duration.ofSeconds(5));
    }

    @Test
    @DisplayName("Кнопка Sell на Widget 'Trading instrument' заголовка 'Markets'")
    public void checkButtonSellTradingInstrumentOnTheWidgetInTitleMarketsTest(){
        mainPage.openMenu();
        menu.getTitleMarkets().click();
        menu.marketsPage().checkButtonSell();
    }

    @Test
    @DisplayName("Кнопка Buy на Widget 'Trading instrument' заголовка 'Markets'")
    public void checkButtonBuyTradingInstrumentOnTheWidgetInTitleMarketsTest(){
        mainPage.openMenu();
        menu.getTitleMarkets().click();
        menu.marketsPage().checkButtonBuy();
    }
}
