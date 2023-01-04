import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Random;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;



public class CapitalMenuMarketsForexTest extends BaseTest {

    @Test
    @DisplayName("Кнопка 'Start Trading Now' в разделе 'Forex'")
    public void checkButtonStartTradingNowMenuMarketsForexTest(){
        mainPage.openMenu();
        menu.forexPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        forexPage.getButtonStartTradingNow().click();
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

    @Test
    @DisplayName("Кнопка 'Start trading' в разделе 'Forex'")
    public void checkButtonStartTradingMenuMarketsForexTest(){
        mainPage.openMenu();
        menu.forexPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        forexPage.getListPages().scrollTo();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        forexPage.getButtonStartTrading().click();
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
    @Test
    @DisplayName("Кнопка 'Create account' раздела 'Still looking for a broker you can trust?' заголовка 'Markets' раздела 'Forex'")
    public void checkButtonCreateAccountOnTheBlockStillLookingForMenuMarketsForexTest(){
        mainPage.openMenu();
        menu.forexPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        forexPage.getButtonStartTrading().scrollTo();
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

    @Test
    @DisplayName("Открытие формы после нажатия на кнопку 'Sell' виджета 'Live Forex prices' заголовка 'Markets' раздела 'Forex'")
    public void checkButtonSellOnTheWidgetLiveForexForMenuMarketsForexTest(){
        mainPage.openMenu();
        menu.forexPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        SelenideElement buttonSell = forexPage.choseRandomButton(forexPage.getListButtonSell());

        if (buttonSell.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonSell.click();
            webdriver().shouldHave(urlContaining("https://capital.com/trading/platform/charting"), Duration.ofSeconds(5));

        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonSell.scrollTo();
            buttonSell.click();
            webdriver().shouldHave(urlContaining("https://capital.com/trading/platform/charting"), Duration.ofSeconds(5));
        }
    }

    @Test
    @DisplayName("Открытие формы после нажатия на кнопку 'Buy' виджета 'Live Forex prices' заголовка 'Markets' раздела 'Forex'")
    public void checkButtonBuyOnTheWidgetLiveForexForMenuMarketsForexTest(){
        mainPage.openMenu();
        menu.forexPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        SelenideElement buttonBuy = forexPage.choseRandomButton(forexPage.getListButtonBuy());

        if (buttonBuy.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonBuy.click();
            webdriver().shouldHave(urlContaining("https://capital.com/trading/platform/charting"), Duration.ofSeconds(5));

        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonBuy.scrollTo();
            buttonBuy.click();
            webdriver().shouldHave(urlContaining("https://capital.com/trading/platform/charting"), Duration.ofSeconds(5));
        }
    }
}
