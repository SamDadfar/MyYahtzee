package com.yahtzee.classes;

import com.yahtzee.Yahtzee;
import static com.yahtzee.classes.InputOutput.*;
import static com.yahtzee.Iyahtzee.*;
import static com.yahtzee.classes.ScoreSheet.*;

public class Round extends Yahtzee{
	
	protected static byte numOfRund;
	private byte numOfRolling=MAX_Roll;
	private static Die[] sellectionDices=new Die[NUM_DIE];
	
	public Round() {
		if(numOfRund<13) {
		setPlayer();
		setScoreSheet();
		numOfRund++;}
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
