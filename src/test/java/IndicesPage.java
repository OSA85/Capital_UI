import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Data
public class IndicesPage {
    private final SelenideElement buttonStartTradingNow = $x("//div [@class='banner banner--mid']//a[@class='button-main rounded-lg js_signup']");
    private final SelenideElement listPages = $x("//div [@id='search_results']//ul");
    private final SelenideElement buttonStartTrading = $x("//div [@class='section banner__why-capital '] //a[@class='button-main rounded-lg js_signup']");
    private final ElementsCollection listButtonSell = $$x("//td [@class='sell text-right']// a [@data-type='wdg_markets']");
    private final ElementsCollection listButtonBuy = $$x("//td [@class='buy text-right']// a [@data-type='wdg_markets']");
    private final ElementsCollection listButtonNamePare = $$x("//p [@class='table__info stringEllipsed']//a");
}
