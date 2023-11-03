// a deck is a collection of cards
//use list or set? - depend on what you want to do with the card eg. what game you want to play
// set features - no duplicates (limited to not playing the card game gin rummy)
// list is ordered - best to use in this case 
// what type of list? usually draw from the top when playing - stack 
// arraylist, linkedlist etc is not type, is implementation 

// Value object - record - all final 

public record Card (String suit, String name, Integer value) {

    public String display() {
        return "Suit: %s, Name: %s, Value: %d".formatted(suit(), name(), value()); 
    }
}

// public class CardDeck {
        
//         private final String suit;
//         private final String name;
//         private final Integer value;

//         public CardDeck (String suit, String name, Integer value) {
//             this.suit = suit;
//             this.name = name;
//             this.value = value;
//         }

//         public String getSuit() {
//             return suit;
//         }

//         public String getName() {
//             return name;
//         }

//         public Integer getValue() {
//             return value;
//         }

        
// }

