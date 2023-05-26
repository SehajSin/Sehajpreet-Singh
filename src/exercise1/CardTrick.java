package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 
 // @author Sehajpreet Singht May 26, 2023 
 
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
             card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
    }
  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of your card (1-4): ");
        int suit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit - 1]);

        boolean matchFound = false;

        for (Card card : hand) {
            if (card.equals(userCard)) {
                matchFound = true;
                break;
            }
        }

        if (matchFound) {
            printInfo();
        } else {
            System.out.println("Sorry, no match found.");
        }
    }
   
     //Sehajpreet singh May 26 2023
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Sehajpreet Singh, but you can call me , Sehaj ");
        System.out.println();
        
        System.out.println("My aims in life:");
        System.out.println("-- To become a good proframmer");
        System.out.println("-- Develop some impressive Games on my own");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Gaming");
        System.out.println("-- Paragliding");
        System.out.println("-- Watching Webseries");
        System.out.println("-- Riding Vintage cars");

        System.out.println();
        
    
    }

}
