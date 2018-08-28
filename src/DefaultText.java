import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DefaultText {

	Text createDefaultText(Shell shell,int width, int height, int horizontal, int vertical){
		Text text = new Text(shell, SWT.BORDER);
		GridData gd_Text = new GridData(SWT.FILL, SWT.CENTER, true, false, horizontal, vertical);
		gd_Text.widthHint = width;
		gd_Text.heightHint = height;
		text.setLayoutData(gd_Text);
		return text;
	}
	
}
