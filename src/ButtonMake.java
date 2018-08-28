import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class ButtonMake extends DefaultButton{
	Button createDefaultButtonMake(Shell shell, String text, Text insert, Text operation, Text info){
	Button btnNewButton = new Button(shell, SWT.NONE);
	btnNewButton.addMouseListener(new MouseAdapter() {
		
		@Override
		public void mouseDown(MouseEvent e) {
			argument1 = Double.parseDouble(info.getText());
			argument2 = Double.parseDouble(insert.getText());
			Double solution = null;
			try {
				solution = clickedResultButton(argument1, argument2);
			} catch (DivideByZeroException ex) {
					MessageBox messageBox = new MessageBox(shell, SWT.ICON_WARNING );
					messageBox.setText("Warning");
			        messageBox.setMessage(ex.getMessage());
		    		messageBox.open();
			}
			if(solution != null){
				info.append(operation.getText() + insert.getText());
				operation.setText("");
				insert.setText(Double.toString(solution));
			}
		}
	});
	btnNewButton.setText(text);
	btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
	return btnNewButton;
	}
}
