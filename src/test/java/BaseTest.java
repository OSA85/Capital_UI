import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.Random;

abstract class BaseTest {
    private final static String BASE_URL = "https://capital.com/";
    TradingParePage tradingParePage = new TradingParePage();
    MainPage mainPage = new MainPage();
    LangPage langPage = new LangPage();
    StillLookingFor stillLookingFor = new StillLookingFor();
    MenuLicense menuLicense = new MenuLicense();
    MainBanner mainBanner = new MainBanner();
    LogIn logIn = new LogIn();
    TradeNow tradeNow = new TradeNow();
    Menu menu = new Menu();
    ForexPage forexPage = new ForexPage();
    IndicesPage indicesPage = new IndicesPage();

    CryptocurrenciesPage cryptocurrenciesPage = new CryptocurrenciesPage();


    public MainPage setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        Configuration.holdBrowserOpen = false;
        Configuration.pageLoadTimeout = 45000;
        MainPage mainPage = new MainPage(BASE_URL);

        mainPage.openLangPage().choseLanguageOnMainPage(langPage.getEnglish());
        mainPage.openMenuLicense().choseLicenseOnMainPage(menuLicense.getLicenseFSA());
        return new MainPage();
    }

    public SelenideElement choseRandomButton(ElementsCollection elementsCollection){
        int i = new Random().nextInt(elementsCollection.size());
        return  elementsCollection.get(i);
    }
    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }
        @BeforeEach
        public void init(){
            setUp();
        }

        @AfterEach
        public void tearDown(){
            Selenide.closeWebDriver();
        }

}
