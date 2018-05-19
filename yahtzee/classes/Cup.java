package com.yahtzee.classes;

import static com.yahtzee.Yahtzee.*;

public class Cup {
	private byte[] diceArray = new byte[NUM_DIE];
	//private byte[] tempArray;

	public Cup() {
		for (int i = 0; i < diceArray.length; i++) {
			diceArray[i] = new Die().getValue();
		}
		//tempArray=new byte[NUM_DIE];
	}

	public void setCup(byte[] diceArray) {
		this.diceArray = diceArray;
	}

	public void roll() {
		for (int i = 0; i < diceArray.length; i++) {
			diceArray[i] = new Die().roll();
		}

	}

	public byte[] getDiceArray() {
		return diceArray;
	}

	public byte sumOfDice() {
		int sum = 0;
		for (byte d : diceArray) {
			sum += d;
		}
		return (byte) sum;
	}

	
}
