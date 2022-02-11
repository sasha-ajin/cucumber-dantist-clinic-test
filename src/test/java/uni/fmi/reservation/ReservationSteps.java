package uni.fmi.reservation;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.reservation.model.ReservationScreenModel;

public class ReservationSteps {
	
	private ReservationScreenModel reservationModel;

	@Given("^Open window for reserving time$")
	public void open_window_for_reserving_time() throws Throwable {
	    reservationModel = new ReservationScreenModel();
	}

	@When("^Enter valid user email$")
	public void enter_valid_user_email() throws Throwable {
		reservationModel.setEmail("Alex");
	}
	@When("^Enter invalid user email$")
	public void enter_invalid_user_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reservationModel.setEmail("inval");
	}
	@When("^Enter valid time$")
	public void enter_valid_time() throws Throwable {
		reservationModel.setTime("2022/30/10");

	}
	@When("^click reserve button$")
	public void click_reserve_button() throws Throwable {
		reservationModel.click_reserve_button();
	}
	
	@Then("^see message success$")
	public void see_message_success() throws Throwable {
		assertEquals("Success reservation", reservationModel.getMessage() );
	}

	@Then("^see message missing some field$")
	public void see_message_missing_some_field() throws Throwable {
		assertEquals("Enter email and time", reservationModel.getMessage() );
	}
	@Then("^see message invalid email$")
	public void see_message_invalid_email() throws Throwable {
		assertEquals("Invalid email", reservationModel.getMessage() );
	}

}
