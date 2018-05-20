package com.yahtzee.classes;

import com.yahtzee.Yahtzee;
import static com.yahtzee.classes.InputOutput.*;
import static com.yahtzee.Iyahtzee.*;
import static com.yahtzee.classes.ScoreSheet.*;

import java.util.ArrayList;
import java.util.List;

public class Game{
	private boolean gameOver;
	private byte numOfRund;
	private boolean lastRound;
	private List<Player> playersList=new ArrayList<>();
	
	public Game(String[] playerName) {
		if(!isGameOver()) {
		for(int i=0;i<playerName.length;i++)
			playersList.add(new Player(playerName[i]));
		}
	}
	public boolean isGameOver() {
		return gameOver;
	}
	public void 
	public boolean isLastRound() {
		if(numOfRund<13) 
			return lastRound;
		else 
			return false;
	}
	/*public void collectDice(Die[] dices) {
		byte bInput=0;
		while(scan.hasNext()&&inputCounter<=5) {
		bInput=InputOutput.getInput();
		
		for(int i=0; i<sellectionDices.length;i++) {
			if(sellectionDices[i]==null)
					sellectionDices[i]=dice;
			}
				}
	}*/
	public boolean isFull() {
		if (sellectionDices[sellectionDices.length - 1] != null)
			return true;
		return false;
	}
	public Die[] getLockArray() {
		return sellectionDices;
	}
	public void setLowerScores() {
		for(ScoreSheet.Score s:lScores) {
			
		}
	}
	
	
}
