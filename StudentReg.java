package student;
import java.util.Scanner;

public class StudentReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome to the Student Registration application");
			
			
			System.out.print("Enter first name: ");
			String firstname = scanner.nextLine();
			
			System.out.print("Enter last name: ");
			String lastname = scanner.nextLine();
			
			System.out.print("Enter your birth year: ");
			String birthyear = scanner.nextLine();
			
			String password = firstname + birthyear;
			
			System.out.print("Welcome," + firstname + lastname);
			System.out.println("Registration is complete");
			System.out.print("Your temporary password is: " + password);
			
	}

}
