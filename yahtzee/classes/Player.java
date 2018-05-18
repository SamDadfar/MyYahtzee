package com.yahtzee.classes;

import static com.yahtzee.Yahtzee.*;

import com.yahtzee.*;

public class Player extends Yahtzee implements Iyahtzee{
	
	private static Cup cup;
	boolean fulled = false;
	private Round[] playerRounds;
	private String name;
	private Die[] tempArrayDice=new Die[NUM_DIE];
	
	public Player() {
		this(DEFAULT_NAME);
	}

	public Player(String name) {
		this.name = name;
		cup = new Cup();
		playerRounds=new Round[MAX_ROUND];
	}
	public String getName() {
		return name;
	}
	public Cup getDiceArray() {
		return cup;
	}
	public boolean isFull() {
		return fulled;
	}
	
	@Override
	public void pullDie(D) {
		if (!isFull()) {
			for (Die d : tempArrayDice) {
				if (d==null)
					d = die;
			}
		}
		else 
			full=true;
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
}
