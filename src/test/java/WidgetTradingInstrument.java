import com.codeborne.selenide.ElementsCollection;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$$x;

@Data
public class WidgetTradingInstrument {
    private final ElementsCollection buttonsSell = $$x("//td [@class='sell text-right']");
    private final ElementsCollection buttonsBuy = $$x("//td [@class='buy text-right']//a");

}
