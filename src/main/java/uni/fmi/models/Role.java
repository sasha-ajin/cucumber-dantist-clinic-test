package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Role {

    private String roleCode;
	private Set<User> users;


    public Role() {
    }

    
    public String getRoleCode() {
		return roleCode;
	}

	
	public void setRoleCode(String code) {
		this.roleCode = code;
	}

    public Set<User> getUsers() {
        // TODO implement here
        return users;
    }

    public void setUsers(Set<User> users) {
		this.users = users;
	}

}