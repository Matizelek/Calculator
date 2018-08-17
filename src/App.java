import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class App{
	private static Text insertText;
	static Operation currentOperation;

	static Shell shell = new Shell(); 
	private static Text operationText;
	private static Text informationText;
	static double argument1;
	static double argument2;
	double solution;
	
	public static void main(String[] args) {
		Display display = Display.getDefault();
		//Shell shell = new Shell();
		Button button_1;
		Button button_2;
		Button button_3;
		Button button_4;
		Button button_5;
		Button button_6;
		Button button_7;
		Button button_8;
		Button button_9;
		Button button_0;
		Button button_add;
		Button button_subtract;
		Button button_multiply;
		Button button_divide;
		Button button_equals;
		Button button_C;
		Button button_CR;
		
		shell.setSize(258, 384);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(10, false));
		
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		informationText = createDefaultText(206,28,5,1);
		
		operationText = createDefaultText(33,27,2,1);

		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		insertText = createDefaultText(10,27,7,1);
		
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		button_1 = createDefaultButton("1","null");

		button_2 = createDefaultButton("2","null");
		
		button_3 = createDefaultButton("3","null");
	
		new Label(shell, SWT.NONE);
		
		button_add = createDefaultButton("+","math");
		
		button_subtract = createDefaultButton("-","math");
		
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		button_4 = createDefaultButton("4","null");

		button_5 = createDefaultButton("5","null");

		button_6 = createDefaultButton("6","null");

		new Label(shell, SWT.NONE);
		
		button_multiply = createDefaultButton("*","math");

		button_divide = createDefaultButton("/","math");
		
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		button_7 = createDefaultButton("7","null");

		button_8 = createDefaultButton("8","null");

		button_9 = createDefaultButton("9","null");

		new Label(shell, SWT.NONE);
		
		button_CR = createDefaultButton("CR","CR");
		
		button_C = createDefaultButton("C","C");

		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		button_0 = createDefaultButton("0","null");
		
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		button_equals = createDefaultButton("=","make");

		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	

	static Button createDefaultButton(String text, String operation){
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if(operation.equals("null")) insertText.append(text);
				
				else if (operation.equals("math")){
					operationText.setText(text);
					informationText.append(insertText.getText());
					insertText.setText("");
					if(text.equals("+"))clickedPlusButton();
					if(text.equals("-"))clickedMinusButton();
					if(text.equals("*"))clickedMultiplyButton();
					if(text.equals("/"))clickedDivideButton();
					}
				else if (operation.equals("CR")){
					operationText.setText("");
					informationText.setText("");
					insertText.setText("");
				}
				else if(operation.equals("C")){
					insertText.setText("");
				}
				else if(operation.equals("make")){
					argument1 = Double.parseDouble(informationText.getText());
					argument2 = Double.parseDouble(insertText.getText());
					try {
						DivideCheck devidecheck = new DivideCheck(operationText, informationText, insertText, argument1, argument2);
					}
					catch (DivideByZeroException ex){
						MessageBox messageBox = new MessageBox(shell, SWT.ICON_WARNING );
						messageBox.setText("Warning");
				        messageBox.setMessage(ex.getMessage());
		        		messageBox.open();
					}
					
				}
				
			}
		});
		btnNewButton.setText(text);
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		return btnNewButton;
	}
	
	static Text createDefaultText(int width, int height, int horizontal, int vertical){
		Text text = new Text(shell, SWT.BORDER);
		GridData gd_Text = new GridData(SWT.FILL, SWT.CENTER, true, false, horizontal, vertical);
		gd_Text.widthHint = width;
		gd_Text.heightHint = height;
		text.setLayoutData(gd_Text);
		return text;
	}
	
    static void clickedPlusButton()
    {
        currentOperation = new PlusOperation();
    }
    static void clickedMinusButton()
    {
        currentOperation = new MinusOperation();
    }
   static void clickedMultiplyButton()
    {
        currentOperation = new MultiplyOperation();
    }
   
    static void clickedDivideButton()
    {
        currentOperation = new DivideOperation();
        
    }
    static double clickedResultButton(double firstValue, double secondValue){

        return currentOperation.execute(firstValue,secondValue);
    }
}
