package com.yahtzee.classes;


import static com.yahtzee.Yahtzee.*;

import com.yahtzee.ItemOfTable;

public class InputOutput {

	public byte input;
	public byte pulledValue;
	public static byte inputCounter = 0;

	public static void setInput() {

	}

	public static void showInputMenu() {
		String str="";
		for(int i=0;i<ItemOfTable.values().length-3;i++) {
			
				str+=String.format("Press %1$-2d >> %2$-15s \n",ItemOfTable.values()[i].getCode(),ItemOfTable.values()[i].toString());
		}
				System.out.println(str);
	}

	public byte getInput() {
		while (scan.hasNextByte()) {
			input = scan.nextByte();
			inputCounter++;
			return input;
		}
		return 0;
	}
	public void showResult() {
		System.out.print("Rolling Dice : \n");
		for(Die d:Player.cup.getDiceArray())
			System.out.print(d.getValue()+" ");
		System.out.println("pulled Dice: ");
	}

	public void selectDie(Die die) {
		pulledValue = die.getValue();
	}

	public byte getPulledValue() {
		return pulledValue;
	}
	public static byte getInputCounter() {
		return inputCounter;
	}

}
