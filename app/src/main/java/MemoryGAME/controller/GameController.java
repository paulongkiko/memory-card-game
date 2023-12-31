/*package MemoryGame.controller;

import javax.swing.JOptionPane;

import MemoryGame.ControllerInterface;
import MemoryGame.view.MemoryGameGUI;
import MemoryGame.view.Card;
import MemoryGame.model.CardBoard;

public class GameController implements ControllerInterface 
{
    private MemoryGameGUI view;
    private CardBoard board;
    private Card previousCardPressed;
    private Card currentCardPressed;
    private int disabledCards;
    
    public GameController(CardBoard board) {
        this.board = board;
        this.view = new MemoryGameGUI(this, board);
        this.disabledCards = 0;
    }

    public void cardPressed(Card card) {
        card.revealCardContent();

        if (this.previousCardPressed == null) {
            this.previousCardPressed = card;
            return;
        } 

        if (this.currentCardPressed == null) {
            this.currentCardPressed = card;
        }

        boolean result = this.board.checkMatch(previousCardPressed, currentCardPressed);

        if (result == false) {
            this.previousCardPressed.hideCardContent();
            this.currentCardPressed.hideCardContent();
        } else {
            this.previousCardPressed.setEnabled(false);
            this.currentCardPressed.setEnabled(false);

            this.disabledCards += 2;
        }

        if (this.disabledCards == 16) {
            JOptionPane.showMessageDialog(null, "Game Over!");
        }

        this.previousCardPressed = null;
        this.currentCardPressed = null;
    }
}*/
package MemoryGame.controller;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.lang.Thread;


import MemoryGame.ControllerInterface;
import MemoryGame.view.MemoryGameGUI;
import MemoryGame.view.Card;
import MemoryGame.model.CardBoard;

public class GameController implements ControllerInterface 
{
    private MemoryGameGUI view;
    private CardBoard board;
    private Card previousCardPressed;
    private Card currentCardPressed;
    private int disabledCards;
    
    public GameController(CardBoard board) {
        this.board = board;
        this.view = new MemoryGameGUI(this, board);
        this.disabledCards = 0;
    }

    public void cardPressed(Card card) {
/* 
        if(card.revealCardContent()){

            if (this.previousCardPressed == null) {
                this.previousCardPressed = card;
                return;
            } 

            if (this.currentCardPressed == null) {
                this.currentCardPressed = card;
            }

            boolean result = this.board.checkMatch(previousCardPressed, currentCardPressed);
            System.out.println("Strrunz: "+result);
            if (result == false) {
                //this.previousCardPressed.hideCardContent();
                //this.currentCardPressed.hideCardContent();
            } else {
                System.out.println("ueueueu");
                this.previousCardPressed.setEnabled(false);
                this.currentCardPressed.setEnabled(false);

                this.disabledCards += 2;
            }

            if (this.disabledCards == 16) {
                JOptionPane.showMessageDialog(null, "Game Over!");
            }

            this.previousCardPressed = null;
            this.currentCardPressed = null;
        }else{
            card.hideCardContent();  //add green
            this.currentCardPressed = null;
            this.previousCardPressed = null;
            //card.setEnabled(false);
        }
*/
    }
}