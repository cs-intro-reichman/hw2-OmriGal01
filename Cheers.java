// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheer = args[0];
                int times = Integer.parseInt(args[1]);
                //cheer = cheer.toUpperCase(); //Not sure if this is allowed
                String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String vowels = "AEFHILMNORSX";
                int count = 0;
                boolean isVowel;
                char char1;
                String upperCheer = "";

                for (int i =0; i < cheer.length(); i++) {
                        char1 = cheer.charAt(i);
                        upperCheer += (char) (upperCaseLetters.indexOf(char1) != -1 ?
                                                (cheer.charAt(i)) : (cheer.charAt(i)) - 32);    
                }
                //Converts the given string to all upper case.

                while (count < upperCheer.length()) {
                        char1 = upperCheer.charAt(count);
                        isVowel = false;
                        if (vowels.indexOf(char1) != -1) {
                                isVowel = true;
                                //Checks if the given letter is pronounced with a vowel first or not.
                         }
                        System.out.println("Give me " + ((isVowel) ? "an" : "a ") + " " + char1 + ": " + char1 + "!");
                        count = count + 1;
                }

                System.out.println("What does that spell?");
                count = 0;
                while (count < times) {
                        System.out.println(upperCheer + "!!!");
                        count = count + 1;
                }
                //Prints "!!!" the given number of times.
        }
}
