package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class Email {

    private String Link;
    private Reservation reservation;

    public Email() {
    }

  
    public Reservation getReservation() {
        // TODO implement here
        return reservation;
    }


    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public String getLink() {
        return Link;
    }
    public void setLink(String link) {
    	this.Link = link;
    }

}