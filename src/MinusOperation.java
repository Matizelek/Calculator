
public class MinusOperation implements Operation{
    public double execute(double a, double b) throws DivideByZeroException{
        return a-b;
        }
    
    public String  getOperatorAsString(){
    	return "-";
    }
}
