package com.blz.cards;

import java.util.Arrays;
import java.util.Collections;

public class DeckOfCards {
    //#region Declare variables
    static final int NUMBER_OF_PLAYERS=4;
    static final int CARDS_TO_BE_ASSIGNED=9;
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};
    String cards[][] = new String[4][13];
    String index[] = new String[53];
    int position = 0;
    //#endregion Declare variables

    //Create Card Deck
    public void createDeck(){
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<13;j++)
            {
                index[position] = suits[i]+" of "+ranks[j];
                System.out.println("Before shuffle: "+index[position]);
                position++;
            }
        }
        System.out.println();
    }

    //Shuffle Cards and Display
    public void shuffleCards(){
        Collections.shuffle(Arrays.asList(index));
        for (int a=0;a<index.length;a++){
            System.out.println("After Shuffle: "+index[a]);
        }
        System.out.println();
    }

    //Assign Cards to Players
    public void assignCards(){
        for (int p=0;p<NUMBER_OF_PLAYERS;p++) {
            for (int c = 0; c < CARDS_TO_BE_ASSIGNED; c++) {
                cards[p][c] = index[c];
                System.out.println("Cards assigned to player"+(p+1)+": "+cards[p][c]);
            }
        }
    }
    //Main method
    public static void main(String[] args) {
        DeckOfCards deckOfCards=new DeckOfCards();
        deckOfCards.createDeck();
        deckOfCards.shuffleCards();
        deckOfCards.assignCards();
    }
}
