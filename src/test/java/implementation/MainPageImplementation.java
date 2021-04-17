package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import utils.*;

import java.util.List;

public class MainPageImplementation {

    private MainPage mainPage;

    private MainPage getPage() {
        if (mainPage == null) {
            mainPage = new MainPage(WebDriverUtils.getDriver());
        }
        return mainPage;
    }

    public void navigateToPage() {
        String url = ConfigReaderUtils.getProperty("url");
        WebDriverUtils.getDriver().get(url);

        СucumberLogUtils.logPass("Successfully navigated to the url", false);
    }

    public void validateCurrentPage(String pageName) {
        boolean pageIsDisplayed = false;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pageIsDisplayed = WebDriverUtils.getDriver().getTitle().equals("PlanIT");

        if (pageIsDisplayed) {
            СucumberLogUtils.logPass(pageName + " page is displayed", true);
        } else {
            СucumberLogUtils.logFail(pageName + " page is NOT displayed", true);
        }

    }

    public void verifyDashboards(List<String> dashboardList) {

        for (String eachDashboardNavElement : dashboardList) {

            try {
                WebElement webElement = WebDriverUtils.getDriver().findElement(By.id(eachDashboardNavElement));

                if (webElement.isDisplayed()) {
                    СucumberLogUtils.logPass(eachDashboardNavElement + " dashboard is displayed as expected", false);
                }

            } catch (Exception e) {
                СucumberLogUtils.logFail(eachDashboardNavElement + " dashboard is NOT displayed", false);
            }

        }
        СucumberLogUtils.logPass("All the dashboards are displayed as expected: " + dashboardList, true);

    }
}