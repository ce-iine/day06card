import java.util.LinkedList;
import java.util.List;

// create blackjack (banluck)
public class Deck {

    private List<Card> deck; //declare interface instead of class(arraylist/linkedlist) for more flexibility in implementation

    public Deck() {
        // create using for loop - for each suit, create A-10
        // 2 forloops, loop through the suit and for that suit, loop through A-10

        // create the deck

        deck = new LinkedList<>(); // why select linkedlsit - List is a class, ArrayList and LinkedList are implementation of List
        // diff btwm interface and class: when class implement interface, it has to implement all the methods 
        // linkedlist > arraylist because data addition and deletion occurs more frequently than reading the data 
        // when need to add to an arraylist, a brand new array must be created

        for (String suit : Constants.SUITS) { // go through all the suits listed in Deck
            for (int i = 0; i<Constants.NAMES.length; i++) { //use index loops because better to access to return name and value 
                //suit, name, value
                Card card = new Card(suit, Constants.NAMES[i], Constants.VALUES[i]); // card created in each loop 
                // how is a map similar to an array: both use key to access a value (for array, use indexing [], map use key)
                // how is a map different to an array: array key is integer, map key is string (like dictionary in python) 
                // map and array use is the same, just the key types are different 
                deck.add(card);
            }
        }
    }

        //shuffling
        // 1) break list randomly and place the splits infront of one another 
        // 2) pick 2 random indexes and swap positions - chance of a shuffle - 1/52 x 51/52 - pick one probability and probability of it being placed at a place it was not drawn from
        // 3) random pick from one list and put it into another 52x - time taken is deterministic eg if one pick and place is 1 sec, take 52 secs
        // 4) intentioanlly pick one and place it at another random place - 1(probability of picking one) x 51/52 (probability of it being placed at a place it was not drawn from)
        
    public void shuffle() {

    }

    public Card take () { // taking one from deck 
        List<Card> cards = take(1);
        return cards.get(0);
    }

    public List<Card> take (int count) {
        List<Card> toReturn = new LinkedList<>();
        // int i = 0;
        while (!deck.isEmpty() && (i<count)){ //need 4 card but only left 2 - take 2 alr, aft trying to take 3rd, it will try to take again but aft checking and it is empty, exit loop 
            for (int i=0; i< count; i++){
                toReturn.add(deck.remove(i));
                i++;
            }
        }
        return toReturn;
    }
}
    
