package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import entrevistaIntelipost.IntelipostDefinitions;

public class info_steps {

	IntelipostDefinitions service;

	    @Given("^que acesso a API Intelipost$")
	    public void acessar_api_intelipost() throws Throwable {
	        service = new IntelipostDefinitions();
	    }

	    @When("^faço a requisição das informações$")
	    public void requistar_inform() throws Throwable {
	        service.requestInfo();
	    }

	    @Then("^vejo o status OK$")
	    public void status_OK() throws Throwable {
	        service.validateInfoStatusContents();
	    }
}
