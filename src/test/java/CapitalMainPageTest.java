import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalMainPageTest extends BaseTest{
    private final String email = "ob1din.ser@yandex.ru";
    private final String password = "Qwerty123!";

    @Test
    @DisplayName("Проверка установки лицензий и что в футере их описание")
    public void changeLicenseTest(){
        menuLicense.choseLicense(menuLicense.getLicenseASIC());
        webdriver().shouldHave(url("https://capital.com/?license=ASIC"));
        mainPage.getFooterDescription().shouldHave(text("ASIC"),Duration.ofSeconds(2));
        menuLicense.choseLicense(menuLicense.getLicenseFCA());
        webdriver().shouldHave(url("https://capital.com/?license=FCA"));
        mainPage.getFooterDescription().shouldHave(text("FCA"),Duration.ofSeconds(2));
        menuLicense.choseLicense(menuLicense.getLicenseCYSEC());
        webdriver().shouldHave(url("https://capital.com/?license=CYSEC"));
        mainPage.getFooterDescription().shouldHave(text("CySEC"),Duration.ofSeconds(2));
        menuLicense.choseLicense(menuLicense.getLicenseNBRB());
        webdriver().shouldHave(url("https://capital.com/?license=NBRB"));
        mainPage.getFooterDescription().shouldHave(text("NBRB"),Duration.ofSeconds(2));
        menuLicense.choseLicense(menuLicense.getLicenseLLC());
        webdriver().shouldHave(url("https://capital.com/?license=CCSTV"));
        mainPage.getFooterDescription().shouldHave(text("LLC"),Duration.ofSeconds(2));
        menuLicense.choseLicense(menuLicense.getLicenseFSA());
        webdriver().shouldHave(url("https://capital.com/?license=SEY"));
        mainPage.getFooterDescription().shouldHave(text("FSA"),Duration.ofSeconds(2));
        menuLicense.choseLicense(menuLicense.getOurGlobalOffices());
        webdriver().shouldHave(url("https://capital.com/international-offices"));
    }

    @Test
    @DisplayName("Проверка соответветствия названия языков на странице")
    public void checkNameLanguage(){
        mainPage.openLangPage();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        assertEquals ("English", langPage.getEnglish().getText());
        assertEquals ("العَرَبِيَّة", langPage.getArab().getText());
        assertEquals ("Bahasa Indonesia", langPage.getId().getText());
        assertEquals ("Български", langPage.getBg().getText());
        assertEquals ("Čeština", langPage.getCz().getText());
        assertEquals ("Dansk", langPage.getDk().getText());
        assertEquals ("Deutsch", langPage.getDe().getText());
        assertEquals ("Eesti", langPage.getEe().getText());
        assertEquals ("ελληνικά", langPage.getGr().getText());
        assertEquals ("Español", langPage.getEs().getText());
        assertEquals ("Français", langPage.getFr().getText());
        assertEquals ("Hrvatski", langPage.getHr().getText());
        assertEquals ("Italiano", langPage.getIt().getText());
        assertEquals ("Latviešu", langPage.getLv().getText());
        assertEquals ("Lietuvių", langPage.getLt().getText());
        assertEquals ("Magyar", langPage.getHu().getText());
        assertEquals ("Nederlands", langPage.getNl().getText());
        assertEquals ("Polski", langPage.getPl().getText());
        assertEquals ("Português", langPage.getPt().getText());
        assertEquals ("Română", langPage.getRo().getText());
        assertEquals ("Русский", langPage.getRu().getText());
        assertEquals ("Slovenčina", langPage.getSk().getText());
        assertEquals ("Slovenščina", langPage.getSi().getText());
        assertEquals ("Suomi", langPage.getFi().getText());
        assertEquals ("Svenska", langPage.getSe().getText());
        assertEquals ("Tiếng Việt", langPage.getVn().getText());
        assertEquals ("ไทย", langPage.getTh().getText());
        assertEquals ("简体中文", langPage.getZn().getText());
        assertEquals ("繁體中文", langPage.getCn().getText());
    }

    @Test
    @DisplayName("Проверка открытия нужных форм при кликах по кнопкам на  главных баннерах главной страницы")
    public void checkBanner(){
        //GetInvolved баннер
        mainBanner.getBannerGetInvolved().click();
        mainBanner.getButtonTradeNowOnTheGetInvolvedBanner().click();
        if (tradeNow.getFormSignUp1().isDisplayed()){
            tradeNow.getCloseFormSignUp().click();
        } else {
            tradeNow.getFormSignUp2().isDisplayed();
            tradeNow.getCloseFormSignUp().click();
        }
        mainBanner.getBannerGetInvolved().click();
        mainBanner.getButtonPractiseForFreeOnTheGetInvolvedBanner().click();
        if (tradeNow.getFormSignUp1().isDisplayed()){
            tradeNow.getCloseFormSignUp().click();
        } else {
            tradeNow.getFormSignUp2().isDisplayed();
            tradeNow.getCloseFormSignUp().click();
        }

        //IndustryLeading баннер
        mainBanner.getBannerIndustryLeading().click();
        mainBanner.getButtonStartTradingOnTheIndustryLeadingBanner().click();
        if (tradeNow.getFormSignUp1().isDisplayed()){
            tradeNow.getCloseFormSignUp().click();
        } else {
            tradeNow.getFormSignUp2().isDisplayed();
            tradeNow.getCloseFormSignUp().click();
        }
        mainBanner.getBannerIndustryLeading().click();
        mainBanner.getButtonPractiseForFreeOnTheIndustryLeadingBanner().click();
        if (tradeNow.getFormSignUp1().isDisplayed()){
            tradeNow.getCloseFormSignUp().click();
        } else {
            tradeNow.getFormSignUp2().isDisplayed();
            tradeNow.getCloseFormSignUp().click();
        }
        // FindUs баннер
        mainBanner.getBannerFindUs().click();
        mainBanner.getButtonExploreFeaturesOnTheFindUsBanner().click();
        webdriver().shouldHave(url("https://www.tradingview.com/broker/Capitalcom/"), Duration.ofSeconds(5));
    }

    @Test
    @DisplayName("Вход на сайт через форму 'Log In'")
    public void loginCheckFullForm(){
    mainPage.openLogIn();
    logIn.getFormLogin().isDisplayed();
    logIn.setValueLogInEmail(email);
    logIn.setValueLogInPassword(password);
    logIn.getButtonContinueFormLogin().click();
    webdriver().shouldHave(urlContaining("https://capital.com/trading/platform"), Duration.ofSeconds(5));
    }

    @Test
    @DisplayName("Вход на сайт через форму 'Trade Now'")
    public void tradeNowCheckFullForm(){
        mainPage.openTradeNow();
        tradeNow.getFormSignUp1().isDisplayed();
        tradeNow.setValueTradeNowEmail(email);
        tradeNow.setValueTradeNowPassword(password);
        tradeNow.getButtonContinueFormTradeNow().click();
        webdriver().shouldHave(urlContaining("https://capital.com/trading/platform"), Duration.ofSeconds(5));
    }

    @Test
    @DisplayName("Проверка открытия нужных форм при клике по кнопке [Trade] виджета 'Trading instrument'")
    public void checkButtonTradeOnTheWidgetTradingInstrument(){
        if ( mainPage.getTradeInstrumentFormOld().isDisplayed()) {
//            через цикл for
            for (int i = 0; i < mainPage.getButtonsTradeInTradingInstrumentFormOld().size(); i++) {
                mainPage.getTradeInstrumentGraph().scrollTo();
                mainPage.getButtonsTradeInTradingInstrumentFormOld().get(i).click();
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
        } else {
            for (SelenideElement el : mainPage.getButtonsTradeInTradingInstrumentFormNew()){
                      mainPage.getTradeInstrumentGraph().scrollTo();
                      el.click();
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
    }

    @Test
    @DisplayName("Открытие формы блока 'Still looking for a broker you can trust?'")
    public void checkButtonInBlockStillLooking(){
        mainPage.getBlockWhiteStillLooking().scrollTo();
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
    @DisplayName("Открытие формы блока 'Market analysis'")
    public void checkButtonInBlockMarketAnalysis(){
        mainPage.getBlockMarketAnalysis().scrollTo();
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
    @Test
    @DisplayName("Открытие формы блока 'Explore our platform'")
    public void checkButtonInBlockExploreOurPlatform(){
        mainPage.getBlockExploreOurPlatform().scrollTo();
        mainPage.getButtonTryNowBlockExploreOurPlatform().click();
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
    @DisplayName("Переход на новую вкладку из блока 'Trade CFD'")
    public void checkButtonInBlockTradeCFD(){
        mainPage.getBlockTradeCFD().scrollTo();
        mainPage.getButtonExploreBlockTradeCFD().click();
        switchTo().window(1);
        webdriver().shouldHave(urlContaining("https://www.tradingview.com/broker/Capitalcom"), Duration.ofSeconds(5));
    }

    @Test
    @DisplayName("Открытие формы блока 'New to trading'")
    public void checkButtonInBlockNewToTrading(){
        mainPage.getBlockNewToTrading().scrollTo();
        mainPage.getButtonPractiseBlockNewToTrading().click();
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
    @DisplayName("Открытие формы блока 'Trading calculator'")
    public void checkButtonInBlockTradingСalculator(){
        mainPage.getBlockTradingСalculator().scrollTo();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
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
    }

    @Test
    @DisplayName("Открытие формы блока 'Trader's Dashboard'")
    public void checkButtonInBlockTraderDashboard(){
        mainPage.getButtonStartBlockTradingСalculator().scrollTo();
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        for (SelenideElement el : mainPage.getButtonTradeBlockTraderDashboard()){
            el.click();
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
    @DisplayName("Открытие формы блока 'Why choose Capital.com?'")
    public void checkButtonInBlockWhyChoose(){
        mainPage.getBlockWhyChoose().scrollTo();
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
    @Test
    @DisplayName("Открытие страницы 'Regulations'")
    public void checkButtonRegulations(){
        mainPage.getBody().sendKeys(Keys.CONTROL, Keys.END);
        if (mainPage.getButtonCookieRejectAll().isDisplayed()){
            mainPage.getButtonCookieRejectAll().click();
        }
        mainPage.getButtonRegulations().click();
        webdriver().shouldHave(urlContaining("https://capital.com/regulations"), Duration.ofSeconds(5));
    }

    @Test
    @DisplayName("Открытие страницы 'Terms and Policies'")
    public void checkButtonTermsAndPolicies(){
        mainPage.getBody().sendKeys(Keys.CONTROL, Keys.END);
        if (mainPage.getButtonCookieRejectAll().isDisplayed()){
            mainPage.getButtonCookieRejectAll().click();
        }
        if (tradeNow.getFormSignUp1().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        if (tradeNow.getFormSignUp2().isDisplayed()) {
            tradeNow.getCloseFormSignUp().click();
        }
        mainPage.getButtonTermsAndPolicies().click();
        webdriver().shouldHave(urlContaining("https://capital.com/terms-and-policies"), Duration.ofSeconds(5));
    }
}
