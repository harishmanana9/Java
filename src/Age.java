import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		System.out.println("Enter the age :");
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		in.close();
		if (age > 0 && age < 18) {
			System.out.println("Minor");
		} else if (age >= 18 && age < 65) {
			System.out.println("Major");
		} else if (age >= 65 && age < 110) {
			System.out.println("Senior Citizen");
		} else {
			System.out.println("Invalid Input");
		}

	}
}
