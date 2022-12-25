import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 *  Главная страница сайта capital.com
 */
@Data
public class MainPage {
    TradeNow tradeNow = new TradeNow();
    private final SelenideElement buttonLogIn = $x("//a [@id='wg_loginBtn']");
    private final SelenideElement buttonTradeNow = $x("//a [@data-type='btn_header']");
    private final SelenideElement buttonLangSwitch = $x("//button [@data-target='langSwitch']");
    private final SelenideElement tradeInstrumentFormOld = $x("//div [@class='tools tools--light js-tools_cc_ab_63_5']");
    private final SelenideElement tradeInstrumentFormNew = $x("//tbody [@class='tabs__pane active']");
    private final SelenideElement tradeInstrumentGraph = $x(" //canvas[@id='chartWrap']");
    //div [@class='tabs tabs--type1-sm js-tabs marketWidget js-analyticsVisible js-tools_cc_ab_63_5']
    private final ElementsCollection buttonsTradeInTradingInstrumentFormOld = $$x("//div [@class='tools__list ihome-Most']//a[@data-type='wdg_markets']");
    private final ElementsCollection buttonsTradeInTradingInstrumentFormNew = $$x("//tbody[@class='tabs__pane active']//a[@data-type='wdg_markets']");

    private final SelenideElement blockStillLooking = $x("//section [@class='regSteps cc-boxLg mainConstuctor__item mainConstuctor__item--fullwidth grey']");
    private final SelenideElement buttonCreateBlockStillLooking = $x("// i [@class='regSteps__item js_signup']");
    private final SelenideElement blockMarketAnalysis = $x("//div [@class='flex flex-wrap']//h3 [text()='Market analysis']");
    private final SelenideElement buttonTradeNowBlockMarketAnalysis = $x("//div [@class='cc-sliderFade__item active']//div[text()='Trade Now']");
    private final SelenideElement blockExploreOurPlatform = $x("//section [@class='brick cc-boxLg grey']");
    private final SelenideElement buttonTryNowBlockExploreOurPlatform = $x("//div [@class='alignCenterToLeft js-analyticsVisible']//a [text()='Try now']");
    private final SelenideElement blockTradeCFD = $x("//div [@data-type='tradingview']");
    private final SelenideElement buttonExploreBlockTradeCFD = $x("//div [@data-type='tradingview']//a[@data-type='tradingview']");
    private final SelenideElement blockNewToTrading = $x("//section[@class='cc-boxXl newToTrading grey']");
    private final SelenideElement buttonPractiseBlockNewToTrading = $x("//section[@class='cc-boxXl newToTrading grey']//a [@data-type='btn_new_to_trading']");
    private final SelenideElement blockTradingСalculator = $x("//div[@id='calcWrap']");
    private final SelenideElement buttonStartBlockTradingСalculator = $x("//div[@id='calcWrap']//div [@data-type='btn_calculator']");
    private final ElementsCollection buttonTradeBlockTraderDashboard = $$x("//div[@class='c-lg-6']//button");
    private final SelenideElement blockWhyChoose = $x("//div[@class='cc-boxXl cc-counter js-counter dark']");
    private final SelenideElement buttonTryNowBlockWhyChoose = $x("//div[@class='cc-boxXl cc-counter js-counter dark']//a");
    private final SelenideElement buttonRegulations = $x("//div[@class='footer__links']//a [text()='Regulations']");
    private final SelenideElement buttonTermsAndPolicies = $x("//div[@class='footer__links']//a [text()='Terms and Policies']");
    private final SelenideElement body = $x("//body");
    private final SelenideElement buttonCookieRejectAll = $x("//button[@id='onetrust-reject-all-handler']");
    private final SelenideElement footerDescription = $x("//div [@class='footer__info cc-boxLg dark']");



    public MainPage(String url){
        Selenide.open(url);
    }

    public MainPage(){}
    public LangPage openLangPage(){
        buttonLangSwitch.click();
        return new LangPage();
    }

    public LogIn openLogIn(){
        buttonLogIn.click();
        return new LogIn();
    }
    public TradeNow openTradeNow(){
        buttonTradeNow.click();
        return new TradeNow();
    }



}
