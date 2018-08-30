

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;



public class LoginForm {
	BoxMessage boxMessage = new BoxMessage();
	MemoryUserRepository MemUserRepository = new MemoryUserRepository(); 

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
					boxMessage.showOkMessage("Welcome","Welcome: " + username.getText(), shell); 
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
				  MemUserRepository.addUser(user);
				  boxMessage.showOkMessage("Login Form", "Register Success", shell);
				 // username.setText("");
				  //password.setText("");
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


