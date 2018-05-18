package com.yahtzee.classes;

import static com.yahtzee.Yahtzee.*;

public class Cup {
	private Die[] diceArray = new Die[NUM_DIE];
	
	public Cup() {
		for (int i = 0; i < diceArray.length; i++) {
			diceArray[i] = new Die();
		}
	}
	public void setCup(Die[] dice) {
		this.diceArray=dice;
	}
	
	public void roll() {
		for (int i = 0; i < diceArray.length; i++) {
			diceArray[i]=diceArray[i].roll();
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
	public class Die{
		byte value;
		boolean pulled;
		public Die(){
			value=(byte)((rollingValue.nextInt(6))+1);
			}
		public byte getValue() {
			return value;
		}
		public Die roll() {
			return new Die();
		}
		public boolean isPulled() {
			return pulled;
		}
		public void pullDie(byte value) {
			if(this.value==value)
				pulled=true;
		}
	}
}
