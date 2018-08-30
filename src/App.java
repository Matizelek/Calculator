import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

public class App {
	

	static Display display = Display.getDefault();
	static Shell shell = new Shell(); 
	static Text insertText;
	static Text operationText;
	static Text informationText;
	
	public static void main(String[] args) {
	
		LoginForm loginF = new LoginForm(display, shell);
		if(loginF.getCheck() == true)new App();
	   

		
	}
	
	App(){
		
		DefaultButton dButtonN = new ButtonNumber();
		DefaultButton dButton = new DefaultButton();
		DefaultButton dButtonPlus = new ButtonPlusOperation();
		DefaultButton dButtonMinus = new ButtonMinusOperation();
		DefaultButton dButtonMultiply = new ButtonMultiplyOperation();
		DefaultButton dButtonDivide = new ButtonDivideOperation();
		DefaultButton dButtonCR = new ButtonClear();
		DefaultButton dButtonMake = new ButtonMake();
		DefaultButton dButtonC = new ButtonCorrect();
		DefaultText dText = new DefaultText();
		
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
		display = Display.getDefault();
		shell = new Shell(Display.getCurrent());
	
		
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
		
		informationText = dText.createDefaultText(shell,206,28,5,1);
		
		operationText = dText.createDefaultText(shell,33,27,2,1);

		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		insertText = dText.createDefaultText(shell,10,27,7,1);
		
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		button_1 = dButtonN.createDefaultButtonNumber(shell,"1",insertText);

		button_2 = dButtonN.createDefaultButtonNumber(shell,"2",insertText);
		
		button_3 = dButtonN.createDefaultButtonNumber(shell,"3",insertText);
	
		new Label(shell, SWT.NONE);
		
		button_add = dButtonPlus.createDefaultButtonOperation(shell,"+",insertText,operationText, informationText);
		
		button_subtract = dButtonMinus.createDefaultButtonOperation(shell,"-",insertText,operationText, informationText);
		
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		button_4 = dButtonN.createDefaultButtonNumber(shell,"4",insertText);

		button_5 = dButtonN.createDefaultButtonNumber(shell,"5",insertText);

		button_6 = dButtonN.createDefaultButtonNumber(shell,"6",insertText);

		new Label(shell, SWT.NONE);
		
		button_multiply = dButtonMultiply.createDefaultButtonOperation(shell,"*",insertText,operationText, informationText);

		button_divide = dButtonDivide.createDefaultButtonOperation(shell,"/",insertText,operationText, informationText);
		
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		button_7 = dButtonN.createDefaultButtonNumber(shell,"7",insertText);

		button_8 = dButtonN.createDefaultButtonNumber(shell,"8",insertText);

		button_9 = dButtonN.createDefaultButtonNumber(shell,"9",insertText);

		new Label(shell, SWT.NONE);
		
		button_CR = dButtonCR.createDefaultButtonCR(shell,"CR",insertText,operationText, informationText);
		
		button_C = dButtonC.createDefaultButtonC(shell,"C",insertText,operationText, informationText);

		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		button_0 = dButtonN.createDefaultButtonNumber(shell,"0",insertText);
		
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		button_equals = dButtonMake.createDefaultButtonMake(shell,"=",insertText,operationText, informationText);

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

	
}
