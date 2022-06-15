package test;

import org.junit.jupiter.api.*;

public class StepTesting extends TestBase {
    @Test
    public void logInToStepTest(){
        homeScreenPage.checkLoginCorrect();
    }

    @Test
    public void checkAdminTab() {
        homeScreenPage.adminTabCheck();
    }

    @Test
    public void checkGridTab() {
        homeScreenPage.gridTabCheck();
    }

    @Test
    public void checkSchedulerTab() {
        homeScreenPage.schedulerTabCheck();
    }

    @Test
    public void checkExecutionsTab() {
        homeScreenPage.executionsTabCheck();
    }

    @Test
    public void checkParametersTab() {
        homeScreenPage.parametersTabCheck();
    }

    @Test
    public void checkKeywordsTab() {
        homeScreenPage.keywordsTabCheck();
    }

    @Test
    public void checkPlansTab() {
        homeScreenPage.plansTabCheck();
    }
}