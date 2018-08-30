import java.util.HashMap;
import java.util.Map;

public class MemoryUserRepository implements UserRepository{

	Map<Integer, User> map = new HashMap<Integer, User>();
	Admin admin = new Admin();
	
	Integer search;
	
	public Integer getUser(User user){
		for(Map.Entry<Integer, User> entry : map.entrySet()){
			 if(entry.getValue().getMail().equals(user.getMail())){
				 return entry.getKey()  ;
			 }
		}
		return null;
	};
	public Integer getUser(String username){
		for(Map.Entry<Integer, User> entry : map.entrySet()){
			 if(entry.getValue().getMail().equals(username)){
				 return entry.getKey()  ;
			 }
		}
		return null;
	};
	
	public void addUser(User user){
		map.put(map.size()+1, user);
	};
	
	public void removeUser(){
		
	};
	
	
public boolean SearchUser(User user){
	search = getUser(user);
		if(search != null){
	 if(map.get(search).getPassword().equals(user.getPassword())) return true;
		}
		 	return false;
	}
	
public boolean SearchUser(String username){
		search = getUser(username);
		if(search != null){			if(map.get(search).getMail().equals(username)) return true;
		}
		return false;
	}

public boolean SearchUserToLogin(String username, String password){
				search = getUser(username);
			if(search != null){
			 if(map.get(search).verifyPassword(password)){
				// if(admin.verifyPassword(password))System.out.println("Hello Admin");
				 return true;
			 }
				 
				
			}
			 return false;
}
}
