import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class ButtonNumber extends DefaultButton{

	Button createDefaultButtonNumber(Shell shell, String text, Text insert){
	Button btnNewButton = new Button(shell, SWT.NONE);
	btnNewButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseDown(MouseEvent e) {
			 insert.append(text);
		}
	});
	btnNewButton.setText(text);
	btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
	return btnNewButton;
}
}
