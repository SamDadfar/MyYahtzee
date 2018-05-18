package com.yahtzee.classes;

import java.awt.im.InputContext;
import java.util.Scanner;

public class InputOutput {
	public static Scanner scan = new Scanner(System.in);
	public static String input;
	public Die tempDice;
	public static byte inputCounter=0;
	public static void setInput() {

	}

	public static byte getInput() {
		byte bValue=0;
		while (scan.hasNext()) {
			bValue = scan.nextByte();

		}
		inputCounter++;
		return bValue;
	}

	public void selectDice(byte value) {
		tempDice = Die.getDice(value);
	}

}
