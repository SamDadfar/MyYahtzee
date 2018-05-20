package com.yahtzee.classes;

import static com.yahtzee.Yahtzee.*;

import java.util.Arrays;
import java.util.Comparator;

public class Cup {
	private Die[] diceArray = new Die[NUM_DIE];
	//private byte[] tempArray;
	class SortByRoll implements Comparator<Die>{

		@Override
		public int compare(Die o1, Die o2) {
			return o1.getValue()-o2.getValue();
		}
		
	}
	public void sortByValue() {
		Arrays.sort(diceArray,new SortByRoll());
	}
	public Cup() {
		for (int i = 0; i < diceArray.length; i++) {
			diceArray[i] = new Die();
		}
		//tempArray=new byte[NUM_DIE];
	}

	public void setCup(Die[] diceArray) {
		this.diceArray = diceArray;
	}

	public void roll() {
		for (int i = 0; i < diceArray.length; i++) {
			diceArray[i].roll();
		}

	}

	public Die[] getDiceArray() {
		return diceArray;
	}

	public byte sumOfDice() {
		int sum = 0;
		for (Die d : diceArray) {
			sum += d.getValue();
		}
		return (byte) sum;
	}

	
}
