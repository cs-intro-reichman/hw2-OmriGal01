// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheer = args[0];
                cheer = cheer.toUpperCase();
                int times = Integer.parseInt(args[1]);
                int count = 0;
                boolean isVowel;
                char char1;
                while (count < cheer.length()) {
                        char1 = cheer.charAt(count);
                        isVowel = false;
                        if ((char1 == 'A') || (char1 == 'E') || (char1 == 'F') || (char1 == 'H')
                         || (char1 == 'I') || (char1 == 'L') || (char1 == 'M') || (char1 == 'N') 
                         || (char1 == 'O') || (char1 == 'R') || (char1 == 'S') || (char1 == 'X')) {
                                isVowel = true;
                         }
                        System.out.println("Give me " + ((isVowel) ? "an" : "a") + " " + char1 + ": " + char1 + "!");
                        count = count + 1;
                }
                System.out.println("What does that spell?");
                count = 0;
                while (count < times) {
                        System.out.println(cheer + "!!!");
                        count = count + 1;
                }
        }
}
