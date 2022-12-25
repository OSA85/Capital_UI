import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;
@Data
public class TradeNow {

    private final SelenideElement formSignUp1 = $x("//div [@class='form-container-white form-container-small modal cc_ab67_4 cc_ab_67_modal_2 ']");
    private final SelenideElement formSignUp2 = $x("//div [@class='form-container-white form-container-small form-container-columned modal cc_ab67_0 cc_ab67_1 cc_ab67_2 cc_ab67_3 cc_ab_67_modal_1']");
    private final SelenideElement closeFormSignUp = $x("//button [@class='button-cleared small s_cancel']");
    private final SelenideElement fieldEmailFormTradeNow = $x("//label [@id='s_overlay-email']//input");
    private final SelenideElement fieldPasswordFormTradeNow = $x("//label [@id='s_overlay-pass']//input");
    private final SelenideElement buttonContinueFormTradeNow = $x("//div [@class='form-container-small-content']//button [@class='btn btn--md btn--wide s2_btn']");
//    public SelenideElement getFormSignUp2() {
//        return formSignUp2;
//    }
//
//    public SelenideElement getCloseFormSignUp() {
//        return closeFormSignUp;
//    }
//
//    public SelenideElement getFormSignUp1() {
//        return formSignUp1;
//    }
//        public SelenideElement getButtonContinueFormTradeNow() {
//        return buttonContinueFormTradeNow;
//    }

    public void setValueTradeNowEmail(String string){
        fieldEmailFormTradeNow.setValue(string);
    }
    public void setValueTradeNowPassword(String string){
        fieldPasswordFormTradeNow.setValue(string);
    }


}
