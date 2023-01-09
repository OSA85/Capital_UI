import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;

/**
 *  Страница языков
 */
@Data
public class LangPage {

    private final SelenideElement english = $x("//i[@class='cc-flags cc-flags--gb']/..");
    private final SelenideElement arab = $x("//i[@class='cc-flags cc-flags--ab']/..");
    private final SelenideElement id = $x("//i[@class='cc-flags cc-flags--id']/..");
    private final SelenideElement bg = $x("//i[@class='cc-flags cc-flags--bg']/..");
    private final SelenideElement cz = $x("//i[@class='cc-flags cc-flags--cz']/..");
    private final SelenideElement dk = $x("//i[@class='cc-flags cc-flags--dk']/..");
    private final SelenideElement de = $x("//i[@class='cc-flags cc-flags--de']/..");
    private final SelenideElement ee = $x("//i[@class='cc-flags cc-flags--ee']/..");
    private final SelenideElement gr = $x("//i[@class='cc-flags cc-flags--gr']/..");
    private final SelenideElement es = $x("//i[@class='cc-flags cc-flags--es']/..");
    private final SelenideElement fr = $x("//i[@class='cc-flags cc-flags--fr']/..");
    private final SelenideElement hr = $x("//i[@class='cc-flags cc-flags--hr']/..");
    private final SelenideElement it = $x("//i[@class='cc-flags cc-flags--it']/..");
    private final SelenideElement lv = $x("//i[@class='cc-flags cc-flags--lv']/..");
    private final SelenideElement lt = $x("//i[@class='cc-flags cc-flags--lt']/..");
    private final SelenideElement hu = $x("//i[@class='cc-flags cc-flags--hu']/..");
    private final SelenideElement nl = $x("//i[@class='cc-flags cc-flags--nl']/..");
    private final SelenideElement pl = $x("//i[@class='cc-flags cc-flags--pl']/..");
    private final SelenideElement pt = $x("//i[@class='cc-flags cc-flags--pt']/..");
    private final SelenideElement ro = $x("//i[@class='cc-flags cc-flags--ro']/..");
    private final SelenideElement ru = $x("//i[@class='cc-flags cc-flags--ru']/..");
    private final SelenideElement sk = $x("//i[@class='cc-flags cc-flags--sk']/..");
    private final SelenideElement si = $x("//i[@class='cc-flags cc-flags--si']/..");
    private final SelenideElement fi = $x("//i[@class='cc-flags cc-flags--fi']/..");
    private final SelenideElement se = $x("//i[@class='cc-flags cc-flags--se']/..");
    private final SelenideElement vn = $x("//i[@class='cc-flags cc-flags--vn']/..");
    private final SelenideElement th = $x("//i[@class='cc-flags cc-flags--th']/..");
    private final SelenideElement zn = $x("//i[@class='cc-flags cc-flags--zn']/..");
    private final SelenideElement cn = $x("//i[@class='cc-flags cc-flags--cn']/..");
    public void choseLanguage(SelenideElement language){
        language.click();
    }
    public MainPage choseLanguageOnMainPage(SelenideElement language){
        language.click();
        return new MainPage();
    }



}
