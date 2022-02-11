package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class User {

    private String Name;
    private String Email;
    private String Phone;
    private Set<AvailableHour> available_hours;
    private Set<Reservation> reservations;
	private Set<Role> roles;

    public User(final String email) {
    	this.Email = email;
    }
    
    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
    public String getPhone() {
        return Phone;
    }
    public void setName(String name) {
    	this.Name = name;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public void setPhone(String phone) {
    	this.Phone = phone;
    }
    public Set<Reservation> getReservations() {
        return reservations;
    }
    public void setReservation(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
    public Set<AvailableHour> getAvailableHours() {
        return available_hours;
    }

    public void setAvailableHour(Set<AvailableHour> available_hours) {
        this.available_hours = available_hours;
    }
    
    public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}