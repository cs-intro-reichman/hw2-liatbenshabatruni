// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // getting a string and the number of times to cheer
            String cheerSubject = (args[0]);
            int numOfCheers = Integer.parseInt(args[1]);
            // casting a string that contains letters which needs 'an'
            String letter ="AEFHILMNORSX";
            //turning the input to upper letters 
            cheerSubject = cheerSubject.toUpperCase();
            //runing on every letter of the input and checking if the letter needs 'an'
            for (int j = 0; j < cheerSubject.length(); j++) {
                if (letter.indexOf(cheerSubject.charAt(j))==-1) {
                System.out.println("Give me a  " + cheerSubject.charAt(j) + ": " + cheerSubject.charAt(j) + "!");}
                else System.out.println("Give me an " + cheerSubject.charAt(j) + ": " + cheerSubject.charAt(j) + "!");
            }
            //printing the cheers subject spell
            System.out.println("What does that spell?");
            for (int f = 0; f < numOfCheers; f++) {
                System.out.println(cheerSubject + "!!!");
            }
        
        }
        
}
