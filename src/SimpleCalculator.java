
public class SimpleCalculator implements ISimpleCalculator{
	
	
	public  Double add(double a, double b){
	return a+b;	
	}
	
	public Double subtract(double a, double b){
	return a-b;	
	}
	
	public  Double multiply(double a, double b){
	return a*b;	
	}
	
	public  Double divide(double a, double b){
	if(b!=0)return a/b;
	else return a;
	}
}
