

public class TimeCalc {
    public static void main(String[] args) {
        //getting one argument [0] and using charAt to separate hours from minutes
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        //System.out.println("hours: " + hours);
        //System.out.println("minutes " + minutes);
        //System.out.println("minutesToAdd " + minutesToAdd);
        //totalmin - holds the new mins after adding more minutes
        //totalHours - holds the new hours after adding more minutes
        int totalmin =  hours*60 + minutesToAdd + minutes; 
        int totalHours = totalmin/60;
        int newMinutes = totalmin - totalHours*60;
        int newHours = totalHours%24;
        //System.out.println("totalmin " + totalmin);
        //System.out.println("totalHours " + totalHours);
        //System.out.println("newMinutes " + newMinutes);
        //System.out.println("newHours " + newHours);
        if (newMinutes<10 && newHours<10) {
            System.out.println("0" + newHours +":"+ "0" + newMinutes);
        }
        else if (newHours<10) {
            System.out.println("0" + newHours +":"+ newMinutes);
        }
        else if (newMinutes<10) {
            System.out.println(newHours +":"+ "0" + newMinutes);
        }
        else {
            System.out.println(newHours +":"+newMinutes);
        }
        
        
    }
}
