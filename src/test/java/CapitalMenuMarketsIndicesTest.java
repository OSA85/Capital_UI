import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

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
}
