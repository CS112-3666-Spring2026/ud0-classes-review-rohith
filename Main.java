/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author Rohith Mekala
 * @version 1.0
 */

public class Main {

	/* ALGORITHM
	*
	1. Generate 52 card deck into Card array
	- Create a Card array of size 52
	- Create an array of the four valid suits using the constant variables from Card.java
	- Use nested loops to iterate through each suits and values 1-13
	- Create a new card for each combination of suit and value.
	- Use deckIndex to insert Card into the deck array. 
	2. Print deck (simple)
	- Loop through the 52-card array.
    - Print out the string representation of each card.
    - Break to a new row after every 13 cards printed.
	*
	*/
	public static void main(String[] args) {
		/*** RUNNING TESTER ***/
		//uncomment line below to run CardTester:
		//CardTester.main(null);

		/*** DRIVER PROGRAM ***/
		//1. Generate 52 card deck into Card array
		char[] suits = {Card.HEART, Card.DIAMOND, Card.CLUB, Card.SPADE};
        Card[] deck = new Card[52];
        int deckIndex = 0;

        for (char suit : suits) {
            for (int value = 1; value <= 13; value++) {
                deck[deckIndex] = new Card(value, suit);
                deckIndex++;
            }
        }
        
        System.out.println("\n==============================================");
        System.out.println("FINAL DRIVER: GENERATING 52 CARD DECK\n");

        //2. Print deck
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck[i].toString() + "  ");
            
            //Adds a line break every 13 cards, after card index 12, 25, 38, and 51.
            if ((i + 1) % 13 == 0) {
                System.out.println();
            }
        }
	}
}