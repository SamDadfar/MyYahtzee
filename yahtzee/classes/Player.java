package com.yahtzee.classes;

import java.util.Arrays;
import java.util.List;

import com.yahtzee.Yahtzee;
import com.yahtzee.classes.*;

public class Player implements Yahtzee {

	boolean tempArrayfull = false;
	private String name;
	private Cup playerCup;
	private ScoreSheet scoreSheet;
	private byte numOfRolling = 0;
	private byte sum=0;
	public Player() {
		this(DEFAULT_NAME);
	}

	public Player(String name) {
		this.name = name;
		scoreSheet = new ScoreSheet();
		cup.roll();
		playerCup = cup;	}

	public String getName() {
		return name;
	}

	public Cup getCup() {
		return cup;
	}

	public void rollDice() {
		if(numOfRolling<MAX_Roll) {
			for(Die d:playerCup.getDiceArray()) {
				if(!d.isPulled())
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
	@Override
	public void pullDie(byte dieValue, int index) {
		for (int i = 0; i < playerCup.getDiceArray().length; i++) {
			if (!playerCup.getDiceArray()[i].isPulled() && i == index && playerCup.getDiceArray()[i].getValue() == dieValue)
				playerCup.getDiceArray()[i].pull();
		}
	}

	public void pushDie(byte dieValue,int index) {
		for(int i=0;i<playerCup.getDiceArray().length;i++) {
			if (playerCup.getDiceArray()[i].isPulled() && i == index && playerCup.getDiceArray()[i].getValue() == dieValue)
				playerCup.getDiceArray()[i].push();
		}
	}
	
	public Die[] sortCup() {
		Arrays.sort(cup.getDiceArray());
		return cup.getDiceArray();
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
		sum=0;
		for(Die d:playerCup.getDiceArray())
			if(d.getValue()==1)
				sum+=d.getValue();
		return sum;
	}

	@Override
	public byte twos() {
		sum=0;
		for(Die d:playerCup.getDiceArray())
			if(d.getValue()==2)
				sum+=d.getValue();
		return sum;
	}

	@Override
	public byte threes() {
		sum=0;
		for(Die d:playerCup.getDiceArray())
			if(d.getValue()==3)
				sum+=d.getValue();
		return sum;

	}

	@Override
	public byte fours() {
		sum=0;
		for(Die d:playerCup.getDiceArray())
			if(d.getValue()==4)
				sum+=d.getValue();
		return sum;

	}

	@Override
	public byte fives() {
		sum=0;
		for(Die d:playerCup.getDiceArray())
			if(d.getValue()==5)
				sum+=d.getValue();
		return sum;

	}

	@Override
	public byte sixes() {
		sum=0;
		for(Die d:playerCup.getDiceArray())
			if(d.getValue()==6)
				sum+=d.getValue();
		return sum;

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
	public short getScore() {
		// TODO Auto-generated method stub
		return 0;
	}
}
