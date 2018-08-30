
public class Admin extends User{

	public boolean verifyPassword(String password){
		if(password.equals("admin"))return true;
		
		return false;
	}
}
