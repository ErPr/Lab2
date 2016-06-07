import java.util.Scanner;

public class Adventure {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Are you ready to play? ");
		String confirm = input.nextLine();
		System.out.print("What is your age? ");
		String age = input.nextInt();
		if (age < 13) {
			System.out.println("Let's start the adventure!");
		}else{
			System.out.println("Sorry. Not old enough to play!");
		}
		System.out.print("What is your name? ");
		String name = input.nextLine();
		
	}
}
