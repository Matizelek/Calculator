
public class DivideOperation implements Operation{
    public double execute(double a, double b)throws DivideByZeroException {
    	
    	if(b == 0){
			throw new DivideByZeroException("It is not divisible by zero ");
		}
    	return a/b;
    }
    public String getOperatorAsString(){
    	return "/";
    }
}
