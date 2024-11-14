// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheer = args[0];
                cheer = cheer.toUpperCase();
                int times = Integer.parseInt(args[1]);
                int count = 0;
                boolean isVowel;
                char char1;
                String vowels = "REFHILMNORSX";

                while (count < cheer.length()) {
                        char1 = cheer.charAt(count);
                        isVowel = false;
                        if (vowels.indexOf(char1) == -1) {
                                isVowel = true;
                                //Checks if the given letter is pronounced with a vowel first or not.
                         }
                        System.out.println("Give me " + ((isVowel) ? "an" : "a ") + " " + char1 + ": " + char1 + "!");
                        count = count + 1;
                }

                System.out.println("What does that spell?");
                count = 0;
                while (count < times) {
                        System.out.println(cheer + "!!!");
                        count = count + 1;
                }
                //Prints "!!!" the given number of times.
        }
}
