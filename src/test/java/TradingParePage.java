import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;
@Data
public class TradingParePage {
    private final SelenideElement nameTradingPare = $x("//div [@class='cc-box grey brick marketMainTitle']//h1");
    private final SelenideElement buttonAddToFavourite = $x("//a[@data-type='add_fav']");
    private final SelenideElement buttonBell = $x("//a [@data-type='market_alerts']");
    private final SelenideElement buttonViewDetailedChart = $x("//a [@data-type='detailed_chart']");
    private final SelenideElement buttonSell = $x("//a [@data-type='market_sell']");
    private final SelenideElement buttonBuy = $x("//a [@data-type='market_buy']");
    private final SelenideElement peopleAlsoWatch = $x("//h2[text()='People also watch']");
    private final SelenideElement longPositionOvernightFee = $x("//* [text()[contains(., ' Long ')]]");
    private final SelenideElement shortPositionOvernightFee = $x("//div [@class='toolInfo']");
    private final SelenideElement longPositionOvernightFeeGoToPlatform = $x("//div [@class='toolInfo']//a");
    private final SelenideElement shortPositionOvernightFeeGoToPlatform = $x("//div [@class='toolInfo']//a");


}
