// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int seed;
		boolean isV = (mode.equals("v") ? true : false);
		boolean reachOne = false;
		int count = 1;

		for (int i = 1; i <= n; i++) {
			//The outer loop, that runs the given number of times.
			seed = i;

			while (!reachOne) {
				//The nested loop, that runs the Collatz sequence for every i.
				System.out.print((isV) ? (seed + " ") : "");		
				if (seed % 2 == 0) {
					seed = seed / 2;
					count++;
				}
				else {
					seed = (seed * 3) + 1;
					count++;
				}
				if (seed == 1) {
					reachOne = true;
					System.out.print((isV) ? (seed + " (" + count + ")\n") : "");
				}
			}
			count = 1;
			reachOne = false;
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
			//If the loop ended, it means all the sequences have reached 1, so no need to check.
	}
}