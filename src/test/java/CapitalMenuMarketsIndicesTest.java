import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class CapitalMenuMarketsIndicesTest extends BaseTest{
    @Test
    @DisplayName("Кнопка 'Start Trading Now' в разделе 'Indices'")
    public void checkButtonStartTradingNowMenuMarketsForexTest(){
        mainPage.openMenu();
        menu.indicesPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        indicesPage.getButtonStartTradingNow().click();
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
        menu.indicesPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        indicesPage.getListPages().scrollTo();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        indicesPage.getButtonStartTrading().click();
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
    @DisplayName("Кнопка 'Create account' раздела 'Still looking for a broker you can trust?' заголовка 'Markets' раздела 'Indices'")
    public void checkButtonCreateAccountOnTheBlockStillLookingForMenuMarketsForexTest(){
        mainPage.openMenu();
        menu.indicesPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        indicesPage.getButtonStartTrading().scrollTo();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (mainPage.getButtonCookieRejectAll().isDisplayed()){
            mainPage.getButtonCookieRejectAll().click();
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
    @DisplayName("Открытие формы после нажатия на кнопку 'Sell'" +
            " виджета 'Live Forex prices' заголовка 'Markets' раздела 'Indices'")
    public void checkButtonSellOnTheWidgetLiveIndicesForMenuMarketsForexTest(){
        mainPage.openMenu();
        menu.indicesPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        SelenideElement buttonSell = choseRandomButton(indicesPage.getListButtonSell());

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
    @DisplayName("Открытие формы после нажатия на кнопку 'Buy'" +
            " виджета 'Live Forex prices' заголовка 'Markets' раздела 'Indices'")
    public void checkButtonBuyOnTheWidgetLiveForexForMenuMarketsForexTest(){
        mainPage.openMenu();
        menu.indicesPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        SelenideElement buttonBuy = choseRandomButton(indicesPage.getListButtonBuy());

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

    @Test
    @DisplayName("Открытие правильной страницы торгуемых пар виджета 'Live Forex prices'" +
            " заголовка 'Markets' раздела 'Indices'")
    public void checkOpenPageNamePareOnTheWidgetLiveIndicesForMenuMarketsForexTest(){
        mainPage.openMenu();
        menu.indicesPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
        String urlTradingParePage = buttonNamePare.getAttribute("href");

        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            tradingParePage.getNameTradingPare().shouldHave(text(buttonNamePare.getText()));

            webdriver().shouldHave(urlContaining(urlTradingParePage), Duration.ofSeconds(5));

        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.scrollTo();
            buttonNamePare.click();
            tradingParePage.getNameTradingPare().shouldHave(text(buttonNamePare.getText()));
            webdriver().shouldHave(urlContaining(urlTradingParePage), Duration.ofSeconds(5));
        }
    }

}
