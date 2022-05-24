package utils;

import pages.DashboardPage;
import pages.LanguagesPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static LanguagesPage languagesPage;

    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        languagesPage = new LanguagesPage();

    }
}
