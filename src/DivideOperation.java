
public class DivideOperation implements Operation{
    public double execute(double a, double b) {
        return a/b;
    }
    public String getOperatorAsString(){
    	return "/";
    }
}
