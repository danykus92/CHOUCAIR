package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<Map<String, String>> academyChoucairData) throws Exception {
        OnStage.theActorCalled( "Brandon").wasAbleTo(OpenUp.thePage(),Login.onThePage(academyChoucairData.get(0).get("strUser"), academyChoucairData.get(0).get("strPassword")));

    }

    @When("^he search for course on the choucair academy platform$")
    public void heSearchForCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<Map<String, String>> academyChoucairData) throws Exception {

        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).get("strCourse")));


    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<Map<String, String>> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).get("strCourse"))));
    }
}

















