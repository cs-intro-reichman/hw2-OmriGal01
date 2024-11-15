public class TimeCalc {
    public static void main(String[] args) {
        int givenHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int givenMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        //Parses time given in HH:MM format into two ints.
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (givenHours * 60) + givenMinutes + minutesToAdd;
        int calcHours = totalMinutes / 60;
        int calcMinutes = totalMinutes % 60;
        //System.out.println(calcHours + " " + calcMinutes); //Checking variables
        int displayHours = calcHours % 24;
        System.out.println(((displayHours < 10) ? "0" : "") + displayHours + ":" + ((calcMinutes < 10) ? "0" : "") + (calcMinutes));
    }
}
