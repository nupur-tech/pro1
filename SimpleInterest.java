import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter principal ");
		float pr=s.nextFloat();
		
		
		System.out.println("Enter rate of interest ");
		float ra=s.nextFloat();
		
		
		System.out.println("Enter time ");
		float ti=s.nextFloat();
		
		
		float si;
		si=(pr * ra * ti)/100;
		System.out.println("Simple Interest is " +si);
		
	}

}
