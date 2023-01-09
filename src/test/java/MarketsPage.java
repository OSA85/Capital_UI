import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.sleep;

@Data
public class MarketsPage {
    WidgetTradingInstrument widgetTradingInstrument = new WidgetTradingInstrument();
    MainPage mainPage = new MainPage();
    TradeNow tradeNow = new TradeNow();
    LogIn logIn = new LogIn();


    public void checkButtonSell(){
        for ( SelenideElement el : widgetTradingInstrument.getButtonsSell()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            el.click();
            sleep(2000);
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else {
                logIn.getFormLogin().isDisplayed();
                logIn.getButtonCloseFormLogin().click();
            }
        };
    }

    public void checkButtonBuy(){
        for ( SelenideElement el : widgetTradingInstrument.getButtonsBuy()){
            if (mainPage.getButtonCookieRejectAll().isDisplayed()){
                mainPage.getButtonCookieRejectAll().click();
            }
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            }
            if (tradeNow.getFormSignUp2().isDisplayed())  {
                tradeNow.getCloseFormSignUp().click();
            }
            el.click();
            sleep(2000);
            if (tradeNow.getFormSignUp1().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else if (tradeNow.getFormSignUp2().isDisplayed()) {
                tradeNow.getCloseFormSignUp().click();
            } else {
                logIn.getFormLogin().isDisplayed();
                logIn.getButtonCloseFormLogin().click();
            }
        };
    }


}
