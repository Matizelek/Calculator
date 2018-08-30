
public class User {
	String mail, password;

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean verifyPassword(String password){
		if(this.password.equals(password))return true;
		return false;
	}
	
}
