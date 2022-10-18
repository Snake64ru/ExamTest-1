import Hooks.WebHooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static PageObject.PageSteps.AutorizeSteps.autorize;
import static PageObject.PageSteps.AutorizeSteps.openUrl;
import static PageObject.PageSteps.MainPageSteps.openProject;
import static PageObject.PageSteps.ProjectPageSteps.*;
import static Utils.Configuration.getConfigurationValue;

public class TestRunner extends WebHooks {
    @Test
    @Tag("JiraTests")
    @DisplayName("Считаем количество задач")
    public void autorization() {
        openUrl(getConfigurationValue("eduUrl"));
        autorize();
        openProject();
        getTasksCount();
    }
    @Test
    @Tag("JiraTests")
    @DisplayName("Проверка создания новых задач и перевода их статуса")
    public void test() throws InterruptedException {
        openUrl(getConfigurationValue("eduUrl"));
        autorize();
        openProject();
        testSeleniumBug();
        testNewBug();
        myTask();
    }
}