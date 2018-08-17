import org.eclipse.swt.widgets.Text;

public class DivideCheck extends App{

	
	public DivideCheck(Text operationT, Text informationT, Text insertT, Double a, Double b)throws DivideByZeroException{
		if(currentOperation.getOperatorAsString().equals("/")){
		if(b == 0){
			throw new DivideByZeroException("It is not divisible by zero ");
		}}
		else{
			informationT.append(operationT.getText() + insertT.getText());
			operationT.setText("");
			insertT.setText(Double.toString(clickedResultButton(a, b)));
			}
		
	}
}
