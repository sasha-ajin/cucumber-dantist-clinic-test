package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class AvailableHour {

	private String Time;
    private User owner;
    private Reservation reservation;
    
    public AvailableHour(final String time) {
    	this.Time = time;
    }

    public String getTime() {
        return Time;
    }
    public void setTime(String time) {
        this.Time = time;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }
    public User getOwner() {
        return owner;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

}