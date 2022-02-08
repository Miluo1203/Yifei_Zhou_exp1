package cardgame;


import java.util.Scanner;

/**
 * This class models a simple card guessing game
 * 
 * @author Yifei ZHou
 * 02/07
 */
public class CardGame {
    
    
    private static void checknumber(int[] numbers, int yournumber)
    {
    boolean match = false;
    for (int element :numbers){
    if (element == yournumber){
        match = true;
        break;
    }
    String response1 = match ? "Right guess number" : "No match number";

        System.out.println(response1);
    }
    }
    
    private static void checksuit(String[] suits, String yoursuit)
    {
    boolean test = false;
    for (String element :suits){
    if (element.equalsIgnoreCase(yoursuit)){
        test = true;
        break;
    }
    String response2 = test ? "Right guess suit" : "No match suit";

        System.out.println(response2);
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

    
        int[] hand= new int[52];
        int[] numbers =new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] suits = new String[]{"HEARTS", "CLUBS", "SPADES", "DIAMONDS"};
        
        
        for(int i = 0; i < hand.length; i++)
             hand [i] = i;

       for (int i = 0; i < hand.length; i++) {
            int value = (int)(Math.random()*hand.length);
            int pick = hand[i];
            hand[i] = hand[value];
            hand[value] = pick;
       }

       for (int i=0; i<7; i++){
           int number = numbers [hand[i] % 13];
           String suit = suits [hand[i] / 13];
           System.out.println("your cardnumber is  " + number + " " + suit);
       }
    

      System.out.println("Pick a number 1-13 for your card");
        int yournumber = input.nextInt();
        
        System.out.println("Pick a suit for your card");
        String yoursuit = input.next();

 checknumber (numbers,yournumber);
 checksuit (suits,yoursuit);


}
}