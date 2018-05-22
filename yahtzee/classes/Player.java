package com.yahtzee.classes;

import java.util.Arrays;
import java.util.*;

import com.yahtzee.Yahtzee;
import com.yahtzee.classes.*;

public class Player implements Yahtzee {

	boolean tempArrayfull = false;
	private String name;
	private Cup playerCup;
	private List<Die> tempList = new ArrayList<>();
	private byte tempArrayPointer = 0;
	private ScoreSheet scoreSheet;
	private byte numOfRolling = 0;
	private byte sum = 0;
	private String nameOfScore = "";

	public Player() {
		this(DEFAULT_NAME);
	}

	public Player(String name) {
		this.name = name;
		scoreSheet = new ScoreSheet();
		playerCup = new Cup();
	}

	public String getName() {
		return name;
	}

	public Cup getCup() {
		return playerCup;
	}
/*//fill upper section of scoresheet (ones,twoos,threes,...)*///
	
	public void fillUpperSection(byte[] countByValue) {
		if(countByValue!=null) {
		for(int i=0;i<countByValue.length;i++) {
		switch(countByValue[i]) {
		case 0:
			scoreSheet.getScoreSheetItems()[i].setValue((byte)0);
			break;
		case 1:
			scoreSheet.getScoreSheetItems()[i].setValue((byte)(i+1));
			break;
		case 2:
			scoreSheet.getScoreSheetItems()[i].setValue((byte)((i+1)*2));
			break;
		case 3:
			scoreSheet.getScoreSheetItems()[i].setValue((byte)((i+1)*3));
			break;
		case 4:
			scoreSheet.getScoreSheetItems()[i].setValue((byte)((i+1)*4));
			break;
		case 5:
			scoreSheet.getScoreSheetItems()[i].setValue((byte)((i+1)*5));
			break;
		}
		}
		}
	}
	public static void main(String[] arg) {
		/*Player p=new Player();
		p.fillUpperSection(p.getCup().numOfDieInCup());
		for(Die d:p.getCup().getDiceArray())
		System.out.println(d.getValue());
		for(byte b:p.getCup().numOfDieInCup())
			System.out.println(b);
		System.out.println(p.getCup().threeOfKind(p.getCup().numOfDieInCup()));*/
		Player p1=new Player("p");Player p2=new Player("p2");
		for(Die d:p1.getCup().getDiceArray())
			System.out.println(d.getValue());
		for(Die dd:p2.getCup().getDiceArray())
			System.out.println(dd.getValue());
		}

	public void rollDice() {
		if (numOfRolling < MAX_Roll) {
			for (Die d : playerCup.getDiceArray()) {
				if (!d.isPulled())
					d.roll();
			}
			numOfRolling++;
		}
	}

	public Die[] getTempArrayDice() {
		return playerCup.getDiceArray();
	}

	public boolean isTempArrayFull() {
		return tempArrayfull;
	}

	/*
	 * @Override public void pullDie(byte dieValue, int index) {
	 * if(tempArrayPointer<4) { for (int i = 0; i < playerCup.getDiceArray().length;
	 * i++) { if (!playerCup.getDiceArray()[i].isPulled() && i == index &&
	 * playerCup.getDiceArray()[i].getValue() == dieValue) {
	 * playerCup.getDiceArray()[i].pull();
	 * tempList[tempArrayPointer]=playerCup.getDiceArray()[i];
	 * playerCup.getDiceArray()[i]=null; tempArrayPointer++; } } } }
	 * 
	 * public void pushDie(byte dieValue, int index) { for (int i = 0; i <
	 * playerCup.getDiceArray().length; i++) { if
	 * (playerCup.getDiceArray()[i].isPulled() && i == index &&
	 * playerCup.getDiceArray()[i].getValue() == dieValue)
	 * playerCup.getDiceArray()[i].push(); } }
	 */
	public Die[] sortCup() {
		Arrays.sort(playerCup.getDiceArray());
		return playerCup.getDiceArray();
	}

	public ScoreSheet getScoreSheet() {
		return scoreSheet;
	}

	@Override
	public byte ones() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte twos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte threes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte fours() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte fives() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte sixes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short totalScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void pullDie(byte dieValue, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public short getScore() {
		// TODO Auto-generated method stub
		return 0;
	}

}
