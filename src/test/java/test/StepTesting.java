package test;

import org.junit.jupiter.api.*;

public class StepTesting extends TestBase {
    @Test
    public void logInToStepTest(){
        loginPage.goTo().logIn();
        homeScreenPage.checkLoginCorrect();
    }

    @Test
    public void checkTabs() {
        loginPage.goTo().logIn();

        homeScreenPage.adminTabCheck();
        homeScreenPage.gridTabCheck();
        homeScreenPage.schedulerTabCheck();
        homeScreenPage.executionsTabCheck();
        homeScreenPage.parametersTabCheck();
        homeScreenPage.keywordsTabCheck();
        homeScreenPage.plansTabCheck();
    }
}
