package steps;
import implementation.MainPageImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
public class MainPageSteps {
    MainPageImplementation mainPageImplementation = new MainPageImplementation();

    @Given("I navigate to Project website")
    public void iNavigateToProjectWebsite() {
        mainPageImplementation.navigateToPage();
    }

    @Then("I should see the {string} page")
    public void iShouldSeeThePage(String pageName) {
        mainPageImplementation.validateCurrentPage(pageName);
    }

    @Then("I verify the following dashboards are displayed:")
    public void iVerifyTheFollowingDashboardsAreDisplayed(List<String> dashboardButtons) {
        mainPageImplementation.verifyDashboards(dashboardButtons);
    }
}
