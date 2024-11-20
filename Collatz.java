// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String vOc = args[1];
		
if (vOc.equals("v")){
	for (int i = 0; i < seed; i++) {
			int N = i + 1;
			int counter = 1;
			boolean madeIOne = true;
			String sequence = "" + N;
				while(madeIOne)
				{
					if (N%2==0){
						N= N/2;
						sequence += " " + N;
					}
					else {
						N = N*3 +1;
						sequence += " " + N;
					}
					counter++;
					if (N==1){
					System.out.println(sequence + " (" + counter + ")");
					madeIOne = false;
					}
				}
			}
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}


		