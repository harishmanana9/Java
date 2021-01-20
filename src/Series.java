
public class Series {

	public static void main(String[] args) {

		// Print A. 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		int num = 0;
		System.out.print("A. ");
		for (num = 1; num <= 10; num++) {
			num = num++;
			String msg = (num == 10) ? " " : ",";
			System.out.print(num + msg);
		}

		// Print B. 1, 3, 5, 7, 9, 11
		int num1 = 12;
		System.out.println(" ");
		System.out.print("B. ");
		for (int i = 1; i <= num1; i++) {
			if (i % 2 != 0) {
				String msg = (i == 11) ? " " : ",";
				System.out.print(i + msg);
			}
		}

		// Print C. 3, 6, 9, 12, 15, 18, 21, 24, 27, 30
		int num2 = 30;
		System.out.println(" ");
		System.out.print("C. ");
		for (int i = 1; i <= num2; i++) {
			if (i % 3 == 0) {
				String msg = (i == 30) ? " " : ",";
				System.out.print(i + msg);
			}
		}

		// Print D. 1, 1, 2, 3, 5, 8, 13, 21, 34
		int n1 = 0, n2 = 1, sum, count = 9;
		System.out.println(" ");
		System.out.print("D. " + n2 + ",");
		for (int i = 2; i <= count; i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			String msg = (i == 9) ? " " : ",";
			System.out.print(sum + msg);

		}

		// Print E. 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14
		int num3 = 14;
		System.out.println(" ");
		System.out.print("E. ");
		for (int i = 1; i <= num3; i++) {
			if (i % 5 != 0) {
				String msg = (i == 14) ? " " : ",";
				System.out.print(i + msg);
			}
		}
	}
}
