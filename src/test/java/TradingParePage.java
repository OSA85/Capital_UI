import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;
@Data
public class TradingParePage {
    private final SelenideElement nameTradingPare = $x("//div [@class='cc-box grey brick marketMainTitle']//h1");
}
