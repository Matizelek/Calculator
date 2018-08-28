import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class LoginDataCheck extends Users{

	public Boolean ChceckCorrectData(Text username, Text password, Shell shell){
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[pl|com]{1,}");
		Matcher matcher = pattern.matcher(username.getText());
		if(matcher.matches()==false){ 
		  MessageBox messageBox = new MessageBox(shell, SWT.OK |
		  SWT.ICON_WARNING |SWT.CANCEL);
		  messageBox.setMessage("Invalid User Name");
		  messageBox.open();
		  return false;
		  }
		if(password.getText()==""){
		  MessageBox messageBox = new MessageBox(shell, SWT.OK |
		   SWT.ICON_WARNING |SWT.CANCEL);
		  messageBox.setMessage("Invalid Password");
		  messageBox.open();
		  return false;
		  }

		return true;
	}
	
	public Boolean CheckOnly(Text username, Text password, Shell shell){
		if(SearchUser(username.getText(), password.getText())){
			  MessageBox messageBox = new MessageBox(shell, SWT.OK |
					   SWT.ICON_WARNING |SWT.CANCEL);
					  messageBox.setMessage("User "+username.getText() +" already exist");
					  messageBox.open();
					  return false;
		}
		return true;
	}
	
	public Boolean CheckAlreadyExist(Text username, Text password, Shell shell){
		if(SearchUser(username.getText(), password.getText())){
			  MessageBox messageBox = new MessageBox(shell, SWT.OK |
					   SWT.ICON_WARNING |SWT.CANCEL);
					  messageBox.setMessage("User "+username.getText() +" not exist");
					  messageBox.open();
					  return false;
		}
		return true;
	}
	
	
	public Boolean CheckToLogin(Text username, Text password, Shell shell){
		if(SearchUserToLogin(username.getText(), password.getText())) return true;
			 
		else{
			MessageBox messageBox = new MessageBox(shell, SWT.OK |
					   SWT.ICON_WARNING |SWT.CANCEL);
					  messageBox.setMessage("Incoreect password");
					  messageBox.open();
					  return false;
			
		}

	}
}
