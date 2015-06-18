import java.util.Scanner;
public class Restaurant{

    final static String COLOR_ITEM = "\u001B[100m";
    final static String COLOR_PRICE = "\u001B[40m";
    final static String COLOR_ALLOWANCE = "\u001B[40m";
    final static String COLOR_FAILURE = "\u001B[41m";
    final static String COLOR_RESET = "\u001B[0m";

    public static void printMenu(){
        int i = 1;
        String amt;
        for(Menu item: Menu.values()){
            amt = String.format("%.2f",item.price());
            System.out.print(COLOR_ITEM + i + ") " + item + ":\t " + amt + COLOR_RESET + "\n");
            ++i;
        }

        System.out.print(COLOR_ITEM + i + ") EXIT" + COLOR_RESET + "\n");
    }

    public static void printAllowance(double allowance){
        String amt = String.format("%.2f", allowance);
        System.out.print(COLOR_ALLOWANCE + "You have $" + amt + " remaining." + COLOR_RESET + "\n");
    }

    public static void printFailure(String item){
        System.out.print(COLOR_FAILURE + "You do not have enough money" + COLOR_RESET +"\n" + COLOR_FAILURE + "remaining to purchase " + item + COLOR_RESET + "\n");
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        double allowance = 10.00;
        double pizzaPrice = 2.50;
        double iceCreamPrice = 2.00;
        double sodaPrice = 1.50;

        while(allowance >= 0){ /* FIX WHILE CONDITION */
            printAllowance(allowance);
            printMenu();

            input = scan.nextInt();
		if (input == 1){
			if(allowance < pizzaPrice){
				printFailure("pizza");
			}
			else{
				allowance = allowance - pizzaPrice;
			}
		}
	    	else if (input == 2){
			if(allowance < iceCreamPrice) {
				printFailure("ice cream");
			}
			else{ 
				allowance = allowance - iceCreamPrice;
			}
		}
		else if (input == 3){
			if(allowance < sodaPrice) {
				printFailure("soda");
				}
			else{
				allowance = allowance - sodaPrice;
			}
		}
		else if (input == 7){
			pizzaPrice = pizzaPrice + 1;
			iceCreamPrice = iceCreamPrice + 1;
			sodaPrice = sodaPrice + 1;
			System.out.println("Inflation has happened");
			}
		else if (input == 6){
			pizzaPrice = pizzaPrice - 2;
			iceCreamPrice = iceCreamPrice - 2;
			sodaPrice = sodaPrice - 2;
			System.out.println("The fastfood market crashed!");
			}
		else{
			System.out.println("Goodbye!");
			break;
		}
	    /**
             *
             * ENTER YOUR CODE HERE
             *
             * HINTS:
             * printFailure("Soda"); -- prints "You do not have enough money remaining to purchase Soda"
             * printFailure("Ice Cream"); -- prints "You do not have enough money remaining to purchase Ice Cream"
             * printFailure("Pizza"); -- prints "You do not have enough money remaining to purchase Pizza"
             *
             */
	}
}

}
