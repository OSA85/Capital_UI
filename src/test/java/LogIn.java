import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;
@Data
public class LogIn {

    private final SelenideElement formLogin = $x("//div [@class='form-container-white form-container-small modal']");
    private final SelenideElement buttonCloseFormLogin = $x("//button [@class='button-cleared small l_cancel']");
    private final SelenideElement fieldEmailFormLogin = $x("//label [@id='l_f_email']//input");
    private final SelenideElement fieldPasswordFormLogin = $x("//label [@id='l_f_pass']//input");
    private final SelenideElement buttonContinueFormLogin = $x("//div [@class='form-container-small-content']//button [@class='btn btn--md btn--wide l_btn']");




    public void setValueLogInEmail(String string){
        fieldEmailFormLogin.setValue(string);
    }

    public void setValueLogInPassword(String string){
        fieldPasswordFormLogin.setValue(string);
    }


//    public SelenideElement getButtonContinueFormLogin() {
//        return buttonContinueFormLogin;
//    }
//    public SelenideElement getFormLogin() {
//        return formLogin;
//    }

//    public SelenideElement getButtonCloseFormLogin() {
//        return buttonCloseFormLogin;
//    }


}
