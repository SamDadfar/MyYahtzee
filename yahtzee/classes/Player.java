package com.yahtzee.classes;


import java.util.List;

import com.yahtzee.Yahtzee;

public class Player implements Yahtzee {
	
	boolean tempArrayfull = false;
	private String name;
	private Die[] tempArrayDice=new Die[NUM_DIE];
	private ScoreSheet scoreSheet;
	private byte numOfRolling;
	private Cup cup=new Cup();

	public Player() {
		this(DEFAULT_NAME);
	}

	public Player(String name) {
		this.name = name;
		//scoreSheet=new ScoreSheet();
		cup.roll();
		tempArrayDice=cup.getCup();
	}
	public String getName() {
		return name;
	}
	public Die[] getDiceArray() {
		return tempArrayDice;
	}
	public boolean isTempArrayFull() {
		return tempArrayfull;
	}
	
	
	public void pullDie(Die die) {
		if (!isTempArrayFull()) {
			for (Die d : tempArrayDice) {
				if (d==null)
					d = die;
			}
		}
		else 
			tempArrayfull=true;
	}
	@Override
	public byte threeOfKind() {
		return 0;
	}

	@Override
	public byte fourOfKind() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte fullHouse() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte smallStraight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte largeStraight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte chance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte yahtzee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte bonus() {
		// TODO Auto-generated method stub
		return 0;
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
	public void pullDie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerList(List<Player> playersList) {
		// TODO Auto-generated method stub
		
	}
}
