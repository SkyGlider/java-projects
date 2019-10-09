package CardGames;

import java.util.ArrayList;

/**
 * Created by shuxford
 */
public class DoingIt {
    Window myWindow;

    public void doIt(Window win){
        myWindow = win;

        //cardDriverTest();
        //deckDriverTest();
        //handDriverTest();
        gameDriverTest();
    }

    private void cardDriverTest(){
        Card c;

        myWindow.clearOut();

        for (int suit = 1; suit <= 4; suit++){
            for (int value = 1; value <= 13; value++){
                c = new Card(value, suit);
                myWindow.writeOutLine(c); //implied toString
            }
        }
    }

    private void deckDriverTest(){
        Deck d = new Deck();

        myWindow.clearOut();

        d.shuffle();

        for (int i = 1; i <= 52; i++)
            myWindow.writeOutLine(d.deal().toString());
    }

    private void handDriverTest(){
        Deck d = new Deck();
        Hand h = new Hand(5);

        myWindow.clearOut();

        d.fill(); d.shuffle();

        myWindow.writeOutLine("deal OK: " + h.acceptCard(d.deal()));
        myWindow.writeOutLine(h); //implicit toString

        myWindow.writeOutLine("deal OK: " + h.acceptCard(d.deal()));
        myWindow.writeOutLine(h);

        myWindow.writeOutLine("deal OK: " + h.acceptCard(d.deal()));
        myWindow.writeOutLine(h);

        myWindow.writeOutLine("deal OK: " + h.acceptCard(d.deal()));
        myWindow.writeOutLine(h);

        myWindow.writeOutLine("deal OK: " + h.acceptCard(d.deal()));
        myWindow.writeOutLine(h);

        myWindow.writeOutLine("deal OK: " + h.acceptCard(d.deal()));
        myWindow.writeOutLine(h);
    }

    private void gameDriverTest(){
        Game aGame = new Game(4, 5);

        myWindow.clearOut();

        aGame.play();

        ArrayList<Hand> swappableHands = aGame.getHandsLessThan7();
        ArrayList<Card> swappableCards = aGame.getCardslessThan7();
        ArrayList<Integer> handIndices = aGame.getHandIndices();
        ArrayList<Integer> cardIndices = aGame.getCardIndices();

        for(int swappable = 0; swappable < swappableCards.size();swappable++ ){

            if ( getRandomInt() > 0){
                Card newCard = aGame.getD().deal();
                int scoreChange = newCard.getValue() - swappableCards.get(swappable).getValue();
                Hand theHand = swappableHands.get(swappable);
                theHand.acceptCardAt(newCard,cardIndices.get(swappable));
                myWindow.writeOutLine("Hand " + handIndices.get(swappable) + " : Swapped " + swappableCards.get(swappable).toString() + " with " + newCard.toString() + " (score chg: " + scoreChange + ")");
            }else{
                myWindow.writeOutLine("Hand " + handIndices.get(swappable) + " : Swap Declined");
            }



            /*
            String answer;
            do{
                myWindow.writeOutLine("Hand "+ handIndices.get(swappable) + " ,Swap " + swappableCards.get(swappable).toString() + " for new card?");
                answer = system.readIn().toLowerCase();
            }
            while( !answer.equals("y") || !answer.equals("n"));

            if (answer.equals("y")) {
                int currentVal = swappableCards.get(swappable).getValue();
                int smallerCount = 0;
                int biggerCount = 0;
                int count =0;
                Card[] myCardArray = new Card[4];

                while(count<4){

                    if (newCard.getValue() > currentVal && biggerCount < 3){
                        myCardArray[count] = newCard;
                        biggerCount++;
                    }
                    else if(newCard.getValue() < currentVal && smallerCount < 1){
                        myCardArray[count] = newCard;
                        smallerCount++;
                    }
                    count++;
                }

                int randomIndex = getRandomInt();
                Card theChosenCard = myCardArray[randomIndex];

            }
             */


        }
        aGame.updateScores();
        myWindow.writeOutLine(aGame); //implicit toString
    }

    private int getRandomInt(){
        return 0 +(int)(Math.random()*((4-0)+0));
    }
}
