package com.yahtzee.classes;

import com.yahtzee.Yahtzee;
import static com.yahtzee.classes.InputOutput.*;
import static com.yahtzee.Iyahtzee.*;
import static com.yahtzee.classes.ScoreSheet.*;

import java.util.ArrayList;
import java.util.List;

public class Round{
	
	private byte numOfRund;
	private boolean lastRound;
	private List<Player> playersList=new ArrayList<>();
	
	public Round() {
		if(!isLastRound()) {
		setScoreSheet();
		numOfRund++;
		if(numOfRund==13)
			lastRound=true;
		
		}
	}
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
