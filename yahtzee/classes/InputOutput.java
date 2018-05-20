package com.yahtzee.classes;


import static com.yahtzee.Yahtzee.*;

public class InputOutput {

	public byte input;
	public byte pulledValue;
	public static byte inputCounter = 0;

	public static void setInput() {

	}

	public static void show() {
		System.out.println("please enter a valid number according of menu");
	}

	public byte getInput() {
		while (scan.hasNextByte()) {
			input = scan.nextByte();
			inputCounter++;
			return input;
		}
		return 0;
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
