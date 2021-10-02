/*
* @author  Mitchell Nguyen, Tyler Fuentes, Whit Huntley, Justin Laing,
* ITSC-1212:153, Mazumder
* @version 1.0
* @since   2021-09-21
* Lab 4 ITSC 1212
* This is a program that simulates a rock paper scissors game that allows the 
*user to input what choice they want.
*/



import java.util.Scanner;

public class RPSGame {

    // 1 is Rock
    // 2 is Paper
    // 3 is Scissors
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter your name\n> ");
        String name = scnr.nextLine();
        System.out.println("Welcome to ITSC 1212 " + name);
        System.out.println("Please select 1 for rock, 2 for paper, or 3 for scissor");
        // Add print statement to welcome User to the game
        // Add print statement prompting User to enter 1, 2, or 3 (explain which each number represents)
        // User scnr.nextInt() to collect user input, save it as an int variable called choice
        int choice = scnr.nextInt();
	    int computerChoice = (int) (Math.random() * 3.0 + 1.0); // Complete this line using Math.Random() to generate a int
            // In the range 1-3
        playGame(choice, computerChoice);
    }

    public static void playGame(int choice, int computerChoice) {
	    //Print statements for User choice
        if (choice == 1) {
            System.out.println("User chose Rock");
        } else if (choice == 2) {
            System.out.println("User chose Paper");
        } else {
            System.out.println("User chose Scissors");
        }
	    //Print statements for Computer choice
	    if (computerChoice == 1) {
            System.out.println("Computer chose Rock.");
        } else if (computerChoice == 2) {
            System.out.println("Computer chose Paper.");
        } else if (computerChoice == 3) {
            System.out.println("Computer chose Scissors.");
        } else {
            System.out.println("You really shouldn't see this.");
        }
	    // Determining the Winner 	
        if (computerChoice == choice) {
            System.out.println("It's a tie!");
        } else if (computerChoice == 1 && choice == 2) {
            System.out.println("Paper beats rock, Player wins!");
        } else if (computerChoice == 2 && choice == 1) {
            System.out.println("Paper beats rock, Player loses!");
        } else if (computerChoice == 2 && choice == 3) {
            System.out.println("Scissors beats rock, Player wins!");
        } else if (computerChoice == 3 && choice == 2) {
            System.out.println("Scissors beats rock, Player loses!");
        } else if (computerChoice == 1 && choice == 3) {
            System.out.println("Rock beats Scissors, Player loses!");
        } else if (computerChoice == 3 && choice == 1) {
            System.out.println("Rock beats Scissors, Player wins!");
        } else {
            System.out.println("You shouldn't see this.");
        }
    }
}
