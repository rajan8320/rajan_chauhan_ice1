/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rajan_chauhan_1;

/**
 *
 * @author Rajan chauhan
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        Random magicHandRandom = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(magicHandRandom.nextInt(13) + 1);
            c.setSuit(Card.SUITS[magicHandRandom.nextInt(4)]);
            magicHand[i] = c;
        }

        Card luckyCard = new Card();

        luckyCard.setValue(7);

        Random luckyCardRandom = new Random();
        luckyCard.setSuit(Card.SUITS[luckyCardRandom.nextInt(3)]); 

        magicHand[magicHand.length - 1] = luckyCard;    

           Scanner a = new Scanner(System.in);
           System.out.print("Enter the digit of your card from 1 to 13: ");
           int userValue = a.nextInt();
           System.out.print("Enter the number of suit from 0 to 3: ");
           int userSuit = a.nextInt();

           Card yourcard = new Card();
           yourcard.setValue(userValue);
           yourcard.setSuit(Card.SUITS[userSuit]);

           boolean found = false;
        for (Card magicHand1 : magicHand) {
            if (yourcard.equals(magicHand1)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card matches a card in the magic hand!");
        } else {
            System.out.println("Sorry! Your card does not matches in the magic hand.");
        }
    }
    
}
