import java.util.Scanner;

public class Tester{

    public static void main(String [] args){
        System.out.println("Made by Alec");
        System.out.println("Enter the word to guess");
        Scanner scan = new Scanner(System.in);
        String inputWord = scan.nextLine();

        String lettersGuessed= "";
        Board board = new Board(inputWord);

        String input;

        boolean correct = false;
        
        while (board.getLives()>0){ //board.getLives() > 0 || board.allLettersFilled()){

			if(board.allLettersFilled()){
				break;

			}
        	int lives = board.getLives();

			if (lives == 6) {
                System.out.println(Hangman.base());
            }
            
            if (lives == 5) {
            	System.out.println(Hangman.strikeOne());
            }

            if (lives == 4) {
            	System.out.println(Hangman.strikeTwo());
            }
            
            if (lives == 3) {
            	System.out.println(Hangman.strikeThree());
            }

            if (lives == 2) {
            	System.out.println(Hangman.strikeFour());
            }
            
            if (lives == 1) {
            	System.out.println(Hangman.strikeFive());
            }

            if(!board.getIncorrectGuesses().equals("\n")){
                System.out.println("Letters Guessed: " + board.getIncorrectGuesses());
            }

            System.out.println(board.toString());
            System.out.println("Enter your guess");

            input = scan.nextLine();
            input = input.substring(0,1);

            correct = board.setMove(input);

            board.updateNumberOfLives(correct);

            if(!correct){
                lettersGuessed += input + " ";
            }
        }
	
        if(correct==false){
            
	    System.out.println(Hangman.strikeSix());
	    System.out.println("HE DIED, YOU MURDERED HIM!");
        }
        else{
            System.out.println(board.toString());
            System.out.println("YOU SAVED HIM!");

        }
       

    }
}
