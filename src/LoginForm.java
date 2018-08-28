

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;



public class LoginForm {

		  Label label1,label2;
		  Text username;
		  Text password;
		  Text text;
		  Boolean check = false;
		  
		  public Boolean getCheck() {
			return check;
		}

		public LoginForm(Display display, Shell shell) {
		  shell.setLayout(new GridLayout(2, false));
		  shell.setText("Login form");
		  label1 = new Label(shell, SWT.NONE);
		  label1.setText("User Mail: ");
		  
		  username = new Text(shell, SWT.SINGLE | SWT.BORDER);
		  username.setText("");
		  username.setTextLimit(50);
		  
		  label2=new Label(shell, SWT.NULL);
		  label2.setText("Password: ");
		  
		  password = new Text(shell, SWT.SINGLE | SWT.BORDER);
		  System.out.println(password.getEchoChar());
		  password.setEchoChar('*');
		  password.setTextLimit(30);

		  Button button=new Button(shell,SWT.PUSH);
		  button.setText("Login");
		  button.addListener(SWT.Selection, new Listener() {
		  public void handleEvent(Event event) {

		  LoginDataCheck loginCheck = new LoginDataCheck();
		  
		  if(loginCheck.ChceckCorrectData(username, password, shell) == true){
			  if(loginCheck.CheckToLogin(username, password, shell)){
			   MessageBox messageBox=new MessageBox(shell,SWT.OK|SWT.CANCEL);
			   messageBox.setText("Login Form");
			   messageBox.setMessage("Welcome: " + username.getText());
			   messageBox.open();
			   shell.close();
			  check = true;
		  }
		  }
		  }}
		  )
		 ;
		 
		  
		  Button button2=new Button(shell,SWT.PUSH);
		  button2.setText("Create a new acount");
		  button2.addListener(SWT.Selection, new Listener() {
			  public void handleEvent(Event event) {
				  LoginDataCheck loginCheck = new LoginDataCheck();
				  
				  if(loginCheck.ChceckCorrectData(username, password, shell) == true){
					  if(loginCheck.CheckOnly(username, password, shell)){
						  
					  
					  if(loginCheck.CheckAlreadyExist(username, password, shell)==true){
						  
					  
				  User user = new User();
				  user.setMail(username.getText());
				  user.setPassword(password.getText());
				  Users users = new Users();
				  users.AddUser(user);
				  MessageBox messageBox=new MessageBox(shell,SWT.OK);
				  messageBox.setText("Login Form");
				  messageBox.setMessage("Register Success");
				  messageBox.open();
				  username.setText("");
				  password.setText("");
					  }}
			  }
			  }
			  });
		  
		  username.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		  password.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		  shell.pack();
		  shell.open();
		  
		  
		  while (!shell.isDisposed()) {
		  if (!display.readAndDispatch()) {
		  display.sleep();
		  }
		  }
		  
		 display.dispose();
		  }
		}


