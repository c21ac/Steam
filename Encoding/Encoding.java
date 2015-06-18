import java.util.Scanner;
public class Encoding{
	public static void main(String [] args){
		System.out.println("Please enter the string you wish to encode.");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String output = "";
		for(char letter : input.toUpperCase().toCharArray()){
			if(letter == 'E'){
				output += "00000";
			}
			if(letter == 'T'){
				output += "00001";
			}
			if(letter == 'A'){
				output += "00010";
			}
			if(letter == 'O'){
				output += "00100";
			}
			if(letter == 'I'){
				output += "00101";
			}
			if(letter == 'N'){
				output += "00101";
			}
			if(letter == 'S'){
				output += "00110";
			}
			if(letter == 'R'){
				output += "00111";
			}
			if(letter == 'H'){
				output += "01000";
			}
			if(letter == 'D'){
				output += "01001";
			}
			if(letter == 'L'){
				output += "01010";
			}
			if(letter == 'U'){
				output += "01011";
			}
			if(letter == 'C'){
				output += "01100";
			}
			if(letter == 'M'){
				output += "01101";
			}
			if(letter == 'F'){
				output += "01110";
			}
			if(letter == 'Y'){
				output += "01111";
			}
			if(letter == 'W'){
				output += "10000";
			}
			if(letter == 'G'){
				output += "10001";
			}
			if(letter == 'P'){
				output += "10010";
			}
			if(letter == 'B'){
				output += "10011";
			}
			if(letter == 'V'){
				output += "10100";
			}
			if(letter == 'K'){
				output += "10101";
			}
			if(letter == 'X'){
				output += "10110";
			}
			if(letter == 'Q'){
				output += "10111";
			}
			if(letter == 'J'){
				output += "11000";
			}
			if(letter == 'Z'){
				output += "11001";
			}
			if(letter == ' '){
				output += "11010";
			}
		}
			System.out.println("OUTPUT:" + output);
	}
}
