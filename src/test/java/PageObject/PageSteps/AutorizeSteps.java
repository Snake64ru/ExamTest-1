package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import static Utils.Configuration.getConfigurationValue;
import io.qameta.allure.Step;
import static PageObject.PageElements.AutorizePage.*;
import static com.codeborne.selenide.Selenide.open;

public class AutorizeSteps {
    @Step("Проведем авторизацию {eduUrl}")
    public static void openUrl(String eduUrl) {
        open(eduUrl);
    }
    @Step("Пользователь авторизовывается")
    public static void autorize(){
        loginLane.shouldBe(Condition.visible).sendKeys(getConfigurationValue("login"));
        passwordLane.sendKeys(getConfigurationValue("password"));
        loginButton.click();
    }
}