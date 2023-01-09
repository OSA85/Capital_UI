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
    public void checkButtonStartTradingNowMenuMarketsIndicesTest(){
        mainPage.openMenu().indicesPage();
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
    @DisplayName("Кнопка 'Start trading' в разделе 'Indices'")
    public void checkButtonStartTradingMenuMarketsIndicesTest(){
        mainPage.openMenu().indicesPage();
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
    public void checkButtonCreateAccountOnTheBlockStillLookingForMenuMarketsIndicesTest(){
        mainPage.openMenu().indicesPage();
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
            " виджета 'Live indices prices' заголовка 'Markets' раздела 'Indices'")
    public void checkButtonSellOnTheWidgetLiveIndicesForMenuMarketsIndicesTest(){
        mainPage.openMenu().indicesPage();
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
            " виджета 'Live indices prices' заголовка 'Markets' раздела 'Indices'")
    public void checkButtonBuyOnTheWidgetLiveIndicesForMenuMarketsIndicesTest(){
        mainPage.openMenu().indicesPage();
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
    @DisplayName("Открытие правильной страницы торгуемых пар виджета 'Live indices prices'" +
            " заголовка 'Markets' раздела 'Indices'")
    public void checkOpenPageNamePareOnTheWidgetLiveIndicesForMenuMarketsIndicesTest(){
        mainPage.openMenu().indicesPage();
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Add to favourite'" +
            " торгуемых пар в разделе 'Indices'")
    public void checkButtonAddToFavouriteForSingUpFormMenuMarketsIndicesTradingPareTest(){
        mainPage.openMenu().indicesPage();
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Bell' торгуемых пар в разделе 'Indices'")
    public void checkButtonBellForSingUpFormMenuMarketsIndicesTradingPareTest(){
        mainPage.openMenu().indicesPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'View detailed chart'" +
            " торгуемых пар в разделе 'Indices'")
    public void checkButtonViewDetailedChartForSingUpFormMenuMarketsIndicesTradingPareTest(){
        mainPage.openMenu().indicesPage();
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Sell' торгуемых пар в разделе 'Indices'")
    public void checkButtonSellForSingUpFormMenuMarketsIndicesTradingPareTest(){
        mainPage.openMenu().indicesPage();
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Buy' торгуемых пар в разделе 'Indices'")
    public void checkButtonBuyForSingUpFormMenuMarketsIndicesTradingPareTest(){
        mainPage.openMenu().indicesPage();
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
    @DisplayName("Открытие формы регистрации или авторизации кнопоки 'Try now' торгуемых пар в разделе 'Indices'")
    public void checkButtonTryNowForSingUpFormMenuMarketsIndicesTradingPareTest(){
        mainPage.openMenu().indicesPage();
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
            " торгуемых пар в разделе 'Indices'")
    public void checkButtonStartTradingForSingUpFormMenuMarketsIndicesTradingPareTest(){
        mainPage.openMenu().indicesPage();
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
            " торгуемых пар в разделе 'Indices'")
    public void checkButtonTradeNowForSingUpFormMenuMarketsIndicesTradingPareTest(){
        mainPage.openMenu().indicesPage();
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
            " торгуемых пар в разделе 'Indices'")
    public void checkButtonCreateForSingUpFormMenuMarketsIndicesTradingPareTest(){
        mainPage.openMenu().indicesPage();
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
            " торгуемых пар в разделе 'Indices'")
    public void checkButtonGoToPlatformLongFormMenuMarketsIndicesTradingPareTest(){
        mainPage.openMenu().indicesPage();
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
            " торгуемых пар в разделе 'Indices'")
    public void checkButtonGoToPlatformShortFormMenuMarketsIndicesTradingPareTest(){
        mainPage.openMenu().indicesPage();
        SelenideElement buttonNamePare = choseRandomButton(indicesPage.getListButtonNamePare());
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
