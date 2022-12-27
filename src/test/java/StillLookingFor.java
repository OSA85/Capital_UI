import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;

@Data
public class StillLookingFor {
    private final SelenideElement blockBlackStillLookingFor = $x("//section [@class='regSteps cc-boxLg dark']");
    private final SelenideElement buttonCreateBlockStillLooking = $x("// i [@class='regSteps__item js_signup']");
}
