import java.util.HashMap;
import java.util.Map;

public class Users extends User{

	public void AddUser(User user){
		map.put(map.size()+1, user);
		
	}
	
	public boolean SearchUser(User user){
		
		 for(Map.Entry<Integer, User> entry : map.entrySet()){
			 if(entry.getValue().getMail().equals(user.getMail())){
				 if(entry.getValue().getPassword().equals(user.getPassword())){
					 return true;
				 }
			 }
		 }

		return false;
	}
	
public boolean SearchUser(String username, String password){

		 for(Map.Entry<Integer, User> entry : map.entrySet()){
			 if(entry.getValue().getMail().equals(username)){
					 return true;
				 
			 }
		 }

		return false;
	}
public boolean SearchUserToLogin(String username, String password){

	 for(Map.Entry<Integer, User> entry : map.entrySet()){
		 if(entry.getValue().getMail().equals(username)){
			 if(entry.getValue().getPassword().equals(password))
				 return true;
		 }
	 }

	return false;
}
	
	static Map<Integer, User> map = new HashMap<Integer, User>();
	

}
