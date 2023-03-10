import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Random;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CapitalMenuMarketsForexTest extends BaseTest {

    @Test
    @DisplayName("Кнопка 'Start Trading Now' в разделе 'Forex'")
    public void checkButtonStartTradingNowMenuMarketsForexTest(){
        mainPage.openMenu().forexPage().getButtonStartTradingNow().click();
//        if (tradeNow.getFormSignUp1().isDisplayed()) {
//            tradeNow.getCloseFormSignUp().click();
//        }
//        if (tradeNow.getFormSignUp2().isDisplayed()) {
//            tradeNow.getCloseFormSignUp().click();
//        }
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
        mainPage.openMenu().forexPage();
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
        if (mainPage.getButtonCookieRejectAll().isDisplayed()){
            mainPage.getButtonCookieRejectAll().click();
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
        mainPage.openMenu().forexPage();
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
        mainPage.openMenu().forexPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        SelenideElement buttonSell = choseRandomButton(forexPage.getListButtonSell());

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
        mainPage.openMenu().forexPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        SelenideElement buttonBuy = choseRandomButton(forexPage.getListButtonBuy());

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
    @DisplayName("Открытие правильной страницы торгуемых пар виджета 'Live Forex prices' заголовка 'Markets' раздела 'Forex'")
    public void checkOpenPageNamePareOnTheWidgetLiveForexForMenuMarketsForexTest(){
        mainPage.openMenu().forexPage();
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        String urlTradingParePage = buttonNamePare.getAttribute("href");
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
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

    @Test
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Add to favourite' торгуемых пар в разделе 'Forex'")
    public void checkButtonAddToFavouriteForSingUpFormMenuMarketsForexTradingPareTest(){
        mainPage.openMenu().forexPage();
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getButtonAddToFavourite().click();
            sleep(1000);
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else {
                logIn.getFormLogin().isDisplayed();
                logIn.getButtonCloseFormLogin().click();
            }
        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.scrollTo();
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getButtonAddToFavourite().click();
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

    @Test
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Bell' торгуемых пар в разделе 'Forex'")
    public void checkButtonBellForSingUpFormMenuMarketsForexTradingPareTest(){
        mainPage.openMenu().forexPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getButtonBell().click();
            sleep(1000);
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else {
                logIn.getFormLogin().isDisplayed();
                logIn.getButtonCloseFormLogin().click();
            }
        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.scrollTo();
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getButtonBell().click();
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
    @Test
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'View detailed chart' торгуемых пар в разделе 'Forex'")
    public void checkButtonViewDetailedChartForSingUpFormMenuMarketsForexTradingPareTest(){
        mainPage.openMenu().forexPage();
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getButtonViewDetailedChart().click();
            sleep(1000);
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else {
                logIn.getFormLogin().isDisplayed();
                logIn.getButtonCloseFormLogin().click();
            }
        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.scrollTo();
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getButtonViewDetailedChart().click();
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

    @Test
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Sell' торгуемых пар в разделе 'Forex'")
    public void checkButtonSellForSingUpFormMenuMarketsForexTradingPareTest(){
        mainPage.openMenu().forexPage();
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getButtonSell().click();
            sleep(1000);
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else {
                logIn.getFormLogin().isDisplayed();
                logIn.getButtonCloseFormLogin().click();
            }
        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.scrollTo();
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getButtonSell().click();
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

    @Test
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Buy' торгуемых пар в разделе 'Forex'")
    public void checkButtonBuyForSingUpFormMenuMarketsForexTradingPareTest(){
        mainPage.openMenu().forexPage();
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getButtonBuy().click();
            sleep(1000);
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else {
                logIn.getFormLogin().isDisplayed();
                logIn.getButtonCloseFormLogin().click();
            }
        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.scrollTo();
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getButtonBuy().click();
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

    @Test
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Try now' торгуемых пар в разделе 'Forex'")
    public void checkButtonTryNowForSingUpFormMenuMarketsForexTradingPareTest(){
        mainPage.openMenu().forexPage();
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            mainPage.getButtonTryNowBlockWhyChoose().click();
            sleep(1000);
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else {
                logIn.getFormLogin().isDisplayed();
                logIn.getButtonCloseFormLogin().click();
            }
        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.scrollTo();
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            mainPage.getButtonTryNowBlockWhyChoose().click();
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
    @Test
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Start trading'" +
            " торгуемых пар в разделе 'Forex'")
    public void checkButtonStartTradingForSingUpFormMenuMarketsForexTradingPareTest(){
        mainPage.openMenu().forexPage();
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            mainPage.getBlockTradingСalculator().scrollTo();
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            mainPage.getButtonStartBlockTradingСalculator().click();
            sleep(1000);
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else {
                logIn.getFormLogin().isDisplayed();
                logIn.getButtonCloseFormLogin().click();
            }
        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.scrollTo();
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            mainPage.getBlockTradingСalculator().scrollTo();
            mainPage.getButtonStartBlockTradingСalculator().click();
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

    @Test
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Trade Now'" +
            " торгуемых пар в разделе 'Forex'")
    public void checkButtonTradeNowForSingUpFormMenuMarketsForexTradingPareTest(){
        mainPage.openMenu().forexPage();
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            mainPage.getButtonStartBlockTradingСalculator().scrollTo();
            mainPage.getButtonTradeNowBlockMarketAnalysis().click();
            sleep(1000);
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else {
                logIn.getFormLogin().isDisplayed();
                logIn.getButtonCloseFormLogin().click();
            }
        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.scrollTo();
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            mainPage.getButtonStartBlockTradingСalculator().scrollTo();
            mainPage.getButtonTradeNowBlockMarketAnalysis().click();
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

    @Test
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Create & verify your account'" +
            " торгуемых пар в разделе 'Forex'")
    public void checkButtonCreateForSingUpFormMenuMarketsForexTradingPareTest(){
        mainPage.openMenu().forexPage();
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            stillLookingFor.getBlockBlackStillLookingFor().scrollTo();
            stillLookingFor.getButtonCreateBlockStillLooking().click();
            sleep(2000);
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else {
                logIn.getFormLogin().isDisplayed();
                logIn.getButtonCloseFormLogin().click();
            }
        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.scrollTo();
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            stillLookingFor.getBlockBlackStillLookingFor().scrollTo();
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
    }

    @Test
    @DisplayName("Открытие платформы через 'Go to platform' в 'Long position overnight fee'" +
            " торгуемых пар в разделе 'Forex'")
    public void checkButtonGoToPlatformLongFormMenuMarketsForexTradingPareTest(){
        mainPage.openMenu().forexPage();
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getLongPositionOvernightFee().click();
            tradingParePage.getLongPositionOvernightFeeGoToPlatform().click();
            webdriver().shouldHave(urlContaining("https://capital.com/trading/platform"), Duration.ofSeconds(5));
        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getLongPositionOvernightFee().click();
            tradingParePage.getLongPositionOvernightFeeGoToPlatform().click();
            webdriver().shouldHave(urlContaining("https://capital.com/trading/platform"), Duration.ofSeconds(5));
        }
    }

    @Test
    @DisplayName("Открытие платформы через 'Go to platform' в 'Short position overnight fee'" +
            " торгуемых пар в разделе 'Forex'")
    public void checkButtonGoToPlatformShortFormMenuMarketsForexTradingPareTest(){
        mainPage.openMenu().forexPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        SelenideElement buttonNamePare = choseRandomButton(forexPage.getListButtonNamePare());
        if (buttonNamePare.isDisplayed()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getShortPositionOvernightFee().click();
            tradingParePage.getShortPositionOvernightFeeGoToPlatform().click();
            webdriver().shouldHave(urlContaining("https://capital.com/trading/platform"), Duration.ofSeconds(5));
        } else {
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            buttonNamePare.click();
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            tradingParePage.getShortPositionOvernightFee().click();
            tradingParePage.getShortPositionOvernightFeeGoToPlatform().click();
            webdriver().shouldHave(urlContaining("https://capital.com/trading/platform"), Duration.ofSeconds(5));
        }
    }
}
