package com.yahtzee.classes;


import java.util.Arrays;
import java.util.List;

import com.yahtzee.Yahtzee;
import com.yahtzee.classes.*;

public class Player implements Yahtzee {
	
	boolean tempArrayfull = false;
	private String name;
	private byte[] tempArrayDice=new byte[NUM_DIE];
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
		tempArrayDice=cup.getDiceArray();
	}
	public String getName() {
		return name;
	}
	public Cup getCup() {
		return cup;
	}
	public void setCup(byte[] diceOfcup) {
		this.cup.setCup(diceOfcup);
	}
	public byte[] getTempArrayDice() {
		return tempArrayDice;
	}
	public boolean isTempArrayFull() {
		return tempArrayfull;
	}
	
	
	public void pullDie(byte die) {
		if (!isTempArrayFull()) {
			for (byte d : tempArrayDice) {
				if (d==0)
					d = die;
			}
		}
		else 
			tempArrayfull=true;
	}
	
	public byte[] sortCup(){
		Arrays.sort(cup.getDiceArray());
		return cup.getDiceArray();
	}


	@Override
	public void setPlayerList(List<Player> playersList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isThreeOfKind() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFourOfKind() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFullHouse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSmallStraight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLargeStraight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChance() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isYahtzee() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBonus() {
		// TODO Auto-generated method stub
		return false;
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
	public short getScore() {
		// TODO Auto-generated method stub
		return 0;
	}
}
