package uni.fmi.reservation.model;

import uni.fmi.reservation.service.ReservationService;

public class ReservationScreenModel {
	private String Email;
	private String Time;
	private String message;


	public void setEmail(final String email) {
		this.Email = email;
	}

	public void setTime(final String time) {
		this.Time = time;
		
	}

	public void click_reserve_button() {
		message = ReservationService.reserve(Email, Time);
	}

	public String getMessage() {
		return message;
	}

}
