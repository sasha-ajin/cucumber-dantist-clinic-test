package uni.fmi.reservation.service;

import java.util.List;
import java.util.Collections;

import uni.fmi.models.User;
import uni.fmi.models.AvailableHour;

public class ReservationService {

	
	private static List<User> userDB = Collections.singletonList(new User("Alex"));
	private static List<AvailableHour> av_hrDB = Collections.singletonList(new AvailableHour("2022/30/10"));
	public static String reserve(String email, String time) {
		if ( null==time || null==email) {
			return "Enter email and time";
		}
		final boolean isUser=userDB.stream().anyMatch(u->email.equals(u.getEmail())) ;
		final boolean isTimeFree = av_hrDB.stream().anyMatch(ah->time.equals(ah.getTime()));
		if (!isUser){
			return "Invalid email";
		}
		final boolean isExist = ((isUser)&&  (isTimeFree));
		return isExist?"Success reservation": null;
	}
}
