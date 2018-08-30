import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class BoxMessage {

	public void showOkWarning(String text, Shell shell){
		  MessageBox messageBox = new MessageBox(shell, SWT.OK |
		SWT.ICON_WARNING |SWT.CANCEL);
		  messageBox.setMessage(text);
		  messageBox.open();
	
	}
	
	public void showOkMessage(String title, String text, Shell shell){
		  MessageBox messageBox=new MessageBox(shell,SWT.OK);
		  messageBox.setText(title);
		  messageBox.setMessage(text);
		  messageBox.open();
	}
}
