import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class DefaultButton{
	static Operation currentOperation;
	double argument1;
	double argument2;
	
	Button createDefaultButton(Shell shell, String text, String operation){
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setText(text);
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		return btnNewButton;
	}
	Button createDefaultButtonNumber(Shell shell, String text, Text insert){
		return null;}
	
	Button createDefaultButtonOperation(Shell shell, String text, Text insert, Text operation, Text info){
			return null;}
			
	Button createDefaultButtonCR(Shell shell, String text, Text insert, Text operation, Text info){
				return null;}
	
	Button createDefaultButtonC(Shell shell, String text, Text insert, Text operation, Text info){
		return null;}
	
	Button createDefaultButtonMake(Shell shell, String text, Text insert, Text operation, Text info){
		return null;}
	
    void clickedPlusButton()
    {
        currentOperation = new PlusOperation();
    }
    void clickedMinusButton()
    {
        currentOperation = new MinusOperation();
    }
    void clickedMultiplyButton()
    {
        currentOperation = new MultiplyOperation();
    }
   
    void clickedDivideButton()
    {
        currentOperation = new DivideOperation();
        
    }
    double clickedResultButton(double firstValue, double secondValue) throws DivideByZeroException{

        return currentOperation.execute(firstValue,secondValue);
    }
    
}
