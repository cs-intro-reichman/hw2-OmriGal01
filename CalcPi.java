// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		int count = 0;
		double sum = 0;
		double denominator = 1;
		boolean isPlus = true;
		
		while (count < n) {
			sum = sum + (((isPlus) ? (1) : (-1)) * (1 / denominator));
			denominator += 2;
			isPlus = !isPlus;
			count++;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);
	}
}
