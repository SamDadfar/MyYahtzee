package com.test;

import com.yahtzee.classes.*;
import static com.yahtzee.Yahtzee.*;

public class Demo {
	public static void main(String[] args) {
		/*
		 * Player player1=new Player(); Player player2=new Player("Sam"); for(Die
		 * dd:player2.getDiceArray()) System.out.println(dd.getValue()); player2.
		 * for(Die d:player1.getDiceArray()) { System.out.println(d.getValue()); }
		 
		
		 * Cup cup=new Cup(); Cup cup2=new Cup(); for(Die d:cup.getCup())
		 * System.out.print(d.getValue()); System.out.println("\n"); for(Die
		 * d:cup2.getCup()) System.out.print(d.getValue()); System.out.println("\n");
		 * cup.roll();cup2.roll(); for(Die d:cup.getCup())
		 * System.out.print(d.getValue()); System.out.println("\n"); for(Die
		 * d:cup2.getCup()) System.out.print(d.getValue());
		 
		InputOutput input = new InputOutput();
		byte bInput = 0;
		// InputOutput.show();
		
		 * while(scan.hasNext()&input.getInputCounter()<5) { bInput=input.getInput();
		 * System.out.println(bInput);}
		 */
		Player player = new Player();
		for (byte d : player.getCup().getDiceArray()) 
			System.out.print(d);
		System.out.println("\n");
			player.setCup(player.sortCup());
			for (byte dd : player.getCup().getDiceArray())
				System.out.print(dd);
		ScoreSheet s=new ScoreSheet();
		for(ScoreSheet.Score ss: s.getScoreSheet())
			System.out.println(ss.getName()+ss.getValue());
	}

}
