// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		// getting one argument that will determent how many terms will be added
	    int numTerms = Integer.parseInt(args[0]);
		// initialize the sum to be 0
		double sum = 0;
		// creating a variable that would form the next term each time
		double denominator = 1;
		for (int i = 0; i < numTerms; i++) {
			if (i%2==0){
				sum += 1/denominator;
			}
			else {
				sum -= 1/denominator;
			}
			// prepering the demo to the next term
			denominator += 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + sum*4);
	}
}
