package WebElementmethods;

public abstract class Remotecalculator implements Calculator {
	//@override
	public static void main(String[] args) {
	public int add(int...arr) {
		int sum=0;
		for(int a:arr) {
			sum=sum+a;
		}
		
		return sum;
		
	}
}
