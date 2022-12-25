import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главные баннеры главной страницы и кнопоки на них
 */
@Data
public class MainBanner {

    private final SelenideElement bannerGetInvolved = $x("//div //button [@data-type='topbanner_trade_cfds_slider']");
    private final SelenideElement bannerIndustryLeading = $x("//div//button [@data-type='topbanner_best_platform_22_slider']");
    private final SelenideElement bannerWantToTake = $x("//button [@data-type='topbanner_edu_slider']");
    private final SelenideElement bannerFindUs = $x("//button [@data-type='banner-tradingview_slider']");
    private final SelenideElement buttonTradeNowOnTheGetInvolvedBanner = $x("//a [@data-type='topbanner_trade_cfds']");
    private final SelenideElement buttonPractiseForFreeOnTheGetInvolvedBanner = $x("//a [@data-type='topbanner_trade_cfds_demo']");
    private final SelenideElement buttonStartTradingOnTheIndustryLeadingBanner = $x("//a [@data-type='topbanner_best_platform_22']");
    private final SelenideElement buttonPractiseForFreeOnTheIndustryLeadingBanner = $x("//a [@data-type='topbanner_best_platform_22_demo']");
    private final SelenideElement buttonExploreFeaturesOnTheFindUsBanner = $x("//div [@class='bannersHome__buttons']//a [@href='https://www.tradingview.com/broker/Capitalcom/']");

}
