import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;

/**
 *  Страница языков
 */
@Data
public class LangPage {

    private final SelenideElement english = $x("//i[@class='iconMd flagMin flagMin--gb']/..");
    private final SelenideElement arab = $x("//i[@class='iconMd flagMin flagMin--ab']/..");
    private final SelenideElement id = $x("//i[@class='iconMd flagMin flagMin--id']/..");
    private final SelenideElement bg = $x("//i[@class='iconMd flagMin flagMin--bg']/..");
    private final SelenideElement cz = $x("//i[@class='iconMd flagMin flagMin--cz']/..");
    private final SelenideElement dk = $x("//i[@class='iconMd flagMin flagMin--dk']/..");
    private final SelenideElement de = $x("//i[@class='iconMd flagMin flagMin--de']/..");
    private final SelenideElement ee = $x("//i[@class='iconMd flagMin flagMin--ee']/..");
    private final SelenideElement gr = $x("//i[@class='iconMd flagMin flagMin--gr']/..");
    private final SelenideElement es = $x("//i[@class='iconMd flagMin flagMin--es']/..");
    private final SelenideElement fr = $x("//i[@class='iconMd flagMin flagMin--fr']/..");
    private final SelenideElement hr = $x("//i[@class='iconMd flagMin flagMin--hr']/..");
    private final SelenideElement it = $x("//i[@class='iconMd flagMin flagMin--it']/..");
    private final SelenideElement lv = $x("//i[@class='iconMd flagMin flagMin--lv']/..");
    private final SelenideElement lt = $x("//i[@class='iconMd flagMin flagMin--lt']/..");
    private final SelenideElement hu = $x("//i[@class='iconMd flagMin flagMin--hu']/..");
    private final SelenideElement nl = $x("//i[@class='iconMd flagMin flagMin--nl']/..");
    private final SelenideElement pl = $x("//i[@class='iconMd flagMin flagMin--pl']/..");
    private final SelenideElement pt = $x("//i[@class='iconMd flagMin flagMin--pt']/..");
    private final SelenideElement ro = $x("//i[@class='iconMd flagMin flagMin--ro']/..");
    private final SelenideElement ru = $x("//i[@class='iconMd flagMin flagMin--ru']/..");
    private final SelenideElement sk = $x("//i[@class='iconMd flagMin flagMin--sk']/..");
    private final SelenideElement si = $x("//i[@class='iconMd flagMin flagMin--si']/..");
    private final SelenideElement fi = $x("//i[@class='iconMd flagMin flagMin--fi']/..");
    private final SelenideElement se = $x("//i[@class='iconMd flagMin flagMin--se']/..");
    private final SelenideElement vn = $x("//i[@class='iconMd flagMin flagMin--vn']/..");
    private final SelenideElement th = $x("//i[@class='iconMd flagMin flagMin--th']/..");
    private final SelenideElement zn = $x("//i[@class='iconMd flagMin flagMin--zn']/..");
    private final SelenideElement cn = $x("//i[@class='iconMd flagMin flagMin--cn']/..");
    public void choseLanguage(SelenideElement language){
        language.click();
    }
    public MainPage choseLanguageOnMainPage(SelenideElement language){
        language.click();
        return new MainPage();
    }



}
