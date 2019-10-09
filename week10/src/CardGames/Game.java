package CardGames;

import java.util.ArrayList;

/**
 * Created by shuxford
 */
public class Game {


    private Deck d;
    private Hand[] hands;



    private ArrayList<Hand> handsLessThan7 = new ArrayList<Hand>();
    private ArrayList<Integer> handIndices = new ArrayList<Integer>();
    private ArrayList<Card> cardslessThan7 = new ArrayList<Card>();
    private ArrayList<Integer> cardIndices = new ArrayList<Integer>();

    private int scores[];

    private final int NUMBER_OF_HANDS, CARDS_IN_A_HAND;
    private int maxScore;

    //CONSTRUCTORS
    public Game(int initNumberOfHands, int initCardsInAHand){
        NUMBER_OF_HANDS = initNumberOfHands; //input parameter required in multiple methods
        CARDS_IN_A_HAND = initCardsInAHand; //input parameter required in multiple methods

        d = new Deck();
        d.fill(); d.shuffle();

        if (NUMBER_OF_HANDS * CARDS_IN_A_HAND <= d.getCardsLeft()) {
            hands = new Hand[NUMBER_OF_HANDS];

            for (int i = 0; i < NUMBER_OF_HANDS; i++) {
                hands[i] = new Hand(CARDS_IN_A_HAND);
            }
        }
    }

    //ACCESSORS
    public ArrayList<Hand> getHandsLessThan7() {
        return handsLessThan7;
    }

    public ArrayList<Card> getCardslessThan7() {
        return cardslessThan7;
    }
    public ArrayList<Integer> getHandIndices() {
        return handIndices;
    }

    public ArrayList<Integer> getCardIndices() {
        return cardIndices;
    }

    public Deck getD() {
        return d;
    }



    //MUTATORS

    public void updateScores(){

        scores = new int[NUMBER_OF_HANDS]; //elements are auto=init to 0

        //GAME LOGIC
        //sum card values for each hand
        for (int i = 0; i < NUMBER_OF_HANDS; i++){

            for (int j = 0; j < CARDS_IN_A_HAND; j++){

                scores[i] += hands[i].getCard(j).getValue();
            }
        }

        //find max score
        maxScore = scores[0];
        for (int i = 1; i < scores.length; i++){
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
    }
    //not required

    //OTHER METHODS
    public void play(){


        dealCards();

        updateScores();
    }

    private void dealCards(){
        for (int i = 0; i < NUMBER_OF_HANDS; i++){
            for (int j = 0; j < CARDS_IN_A_HAND; j++){
                Card inHand = d.deal();
                if (inHand.getValue() <= 7){
                    handIndices.add(i);
                    handsLessThan7.add(hands[i]);
                    cardIndices.add(j);
                    cardslessThan7.add(inHand);
                }
                hands[i].acceptCard(inHand);
            }
        }
    }

    public String toString(){
        String state = "";

        for (int i = 0; i < NUMBER_OF_HANDS; i++){
            state += "\nHand #" + i + ", Score:" + scores[i] + "\n";
            state += hands[i].toString();
        }

        state += "\n\n";
        //allow for ties
        for (int i = 0; i < NUMBER_OF_HANDS; i++) {
            if (scores[i] == maxScore)
                state += "Hand #" + i + " wins with a score of " + maxScore + "\n";
        }

        return state;
    }
}
