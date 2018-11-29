import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Rps rps = new Rps();
		TicTacToe ttt = new TicTacToe();
		BaseBall baseBall = new BaseBall();
		

		switch (getInputFromUser("Select which game you would like to play\n[1] Rock, Paper,"
				+ " Scissors\n[2] Tic-Tac-Toe\n[3] Baseball\"", 1, 3)) {
		case 1:
			rps.mainRps();
			break;
		case 2:
			ttt.mainTicTacToe();
			break;
		case 3:
			baseBall.selectTeam();
		}
	}

	public static int getInputFromUser(String message, int min, int max) {
		System.out.println(message);
		int userNumber;
		try {
			userNumber = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please enter a number as your input!");	
			input.next();
			userNumber = getInputFromUser (message, min, max);
			return userNumber;
		}
		if (userNumber >= min && userNumber <= max) {
			
			return userNumber;
		}
		System.out.println("No such option exists.");
		
		return getInputFromUser(message, min, max);
	} 
}
