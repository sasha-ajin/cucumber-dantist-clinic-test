package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class Reservation {

	private String ReservationNumber;

	   
    private String Date;

    private String Hour;

	private Email email;
	private AvailableHour available_hour;
	 private User owner;



	
    public Reservation() {
    }
    public String getReservationNumber() {
        return ReservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.ReservationNumber = reservationNumber;
    }
    public String getDate() {
        return Date;
    }
    public String getHour() {
        return Hour;
    }
    public void setDate(String date) {
    	this.Date = date;
    }
    public void setHour(String hour) {
    	this.Hour = hour;
    }
    public AvailableHour getAvailableHour() {
		return available_hour;
	}
	public void setAvailableHour(AvailableHour availableHour) {
		this.available_hour = availableHour;
	}
   
	public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getOwner() {
        return owner;
    }
    
    public Email getEmail() {
        // TODO implement here
        return email;
    }
    public void setEmail(Email email) {
        this.email = email;
    }

}