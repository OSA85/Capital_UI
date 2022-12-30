import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

@Data
public class Menu {

    private final ElementsCollection buttonsTradeMenuMarketsMainPage = $$x("//tbody[@class='tabs__pane js-tools__list js-type-Most active']//a [@class='widgetBtn notrlink ln-auto js-analyticsClick']");
    private final SelenideElement titleMarkets = $x("//div [@data-nav='Markets']//a [@href='https://capital.com/derivative-financial-instruments']");
    private final SelenideElement titleForex = $x("//div [@class='cc-nav__col gapSm']//a[@data-type='Forex']");
    public MarketsPage marketsPage(){
        titleMarkets.click();
        return new MarketsPage();
    }
    public ForexPage forexPage(){
        titleForex.click();
        return new ForexPage();
    }
}
