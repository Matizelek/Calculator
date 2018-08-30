import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class LoginDataCheck{
	
	MemoryUserRepository usersRpository = new MemoryUserRepository();
	BoxMessage boxMessage = new BoxMessage();

	public Boolean ChceckCorrectData(Text username, Text password, Shell shell){
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[pl|com]{1,}");
		Matcher matcher = pattern.matcher(username.getText());
		if(matcher.matches()==false){ 
			boxMessage.showOkWarning("Invalid User Name", shell);
		  	return false;
		  }
		if(password.getText()==""){
			boxMessage.showOkWarning("Invalid Password", shell);
			return false;
		  }

		return true;
	}
	
	public Boolean CheckOnly(Text username, Text password, Shell shell){
		if(usersRpository.SearchUser(username.getText())){
			boxMessage.showOkWarning("User "+username.getText() +" already exist", shell);
			  	return false;
		}
		return true;
	}
	
	public Boolean CheckAlreadyExist(Text username, Text password, Shell shell){
		if(usersRpository.SearchUser(username.getText())){
			boxMessage.showOkWarning("User "+username.getText() +" not exist", shell);
			return false;
		}
		return true;
	}
	
	
	public Boolean CheckToLogin(Text username, Text password, Shell shell){
		if(usersRpository.SearchUserToLogin(username.getText(), password.getText())) return true;
	
			boxMessage.showOkWarning("Incoreect password", shell);
			 return false;
			

	}
}
