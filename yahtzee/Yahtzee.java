package com.yahtzee;

import java.util.*;
import java.util.Random;

import com.yahtzee.classes.Cup;
import com.yahtzee.classes.Player;


public interface Yahtzee{
	
		byte MAX_Roll=3;
		byte NUM_DIE = 5;
		byte MAX_ROUND = 13;
		String DEFAULT_NAME = "You";
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		byte MAX_COUNTER_SCORE=12;
		/*boolean isThreeOfKind();
		boolean isFourOfKind();
		boolean isFullHouse();
		boolean isSmallStraight();
		boolean isLargeStraight();
		boolean isChance();
		boolean isYahtzee();
		boolean isBonus();*/
		byte ones();
		byte twos();
		byte threes();
		byte fours();
		byte fives();
		byte sixes();
		short totalScore();
		short sum();
		void pullDie(byte dieValue, int index);
		short getScore();
}
