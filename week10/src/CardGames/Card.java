package CardGames;


public class Card {
    private int value;
    private int suit;   //1= clubs, 2 = diamonds, 3 = hearts, 4 = spades

    private static String[] valueTranslator = {"", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static String[] suitTranslator = {"","Clubs", "Diamonds", "Hearts", "Spades"};


    //CONSTRUCTORS
    public Card(int initValue, int initSuit){
        setValue(initValue);
        setSuit(initSuit);
    }

    //ACCESSORS
    public int getValue(){
        return value;
    }

    public int getSuit(){
        return suit;
    }

    //quasi-accessors
    public String getValueAsString(){
        return valueTranslator[value] ;
    }

    public String getSuitAsString(){
        return suitTranslator[suit];
    }


    //MUTATORS
    public boolean setValue(int newValue){
        boolean success = false;

        if (newValue >= 1 && newValue <= 13){
            value = newValue;
            success = true;
        }
        else
            success = false;

        return success;
    }

    public boolean setSuit(int newSuit){
        boolean success = false;

        if (newSuit >= 1 && newSuit <= 4){
            suit = newSuit;
            success = true;
        }
        else
            success = false;

        return success;
    }

    //OTHER METHODS
    public String toString(){
        String state ="";

        state += "The " + getValueAsString() + " of " + getSuitAsString(); //could use accessors but less human-friendly

        return state;
    }

}
