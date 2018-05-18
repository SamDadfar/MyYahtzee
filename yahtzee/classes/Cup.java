package com.yahtzee.classes;

import static com.yahtzee.Iyahtzee.*;


public class Cup extends Die{
	private static Die[] diceArray = new Die[NUM_DIE];

	public Cup() {
		for(int i=0;i<diceArray.length;i++) {
		diceArray[i]=new Die();
		}
	}
	@Override
	public void roll() {
		for(int i=0;i<diceArray.length;i++) 
			diceArray[i]=new Die();
	}
	
	public Die[] getCup() {
		return diceArray;
	}
	public byte sumOfDice() {
		int sum=0;
		for(Die d:diceArray) {
			sum+=d.getValue();
		}
		return (byte)sum;
	}

}
