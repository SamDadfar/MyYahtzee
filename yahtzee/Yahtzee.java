package com.yahtzee;

import java.util.*;
import java.util.Random;

import com.yahtzee.classes.Cup;
import com.yahtzee.classes.Cup.Die;
import com.yahtzee.classes.Player;


public interface Yahtzee{
	
		public static final byte MAX_Roll=3;
		public static final byte NUM_DIE = 5;
		public static final byte MAX_ROUND = 13;
		public static String DEFAULT_NAME = "You";
		public static final Random rollingValue=new Random();
		Scanner scan=new Scanner(System.in);
		
		byte threeOfKind();
		byte fourOfKind();
		byte fullHouse();
		byte smallStraight();
		byte largeStraight();
		byte chance();
		byte yahtzee();
		byte bonus();
		byte ones();
		byte twos();
		byte threes();
		byte fours();
		byte fives();
		byte sixes();
		short totalScore();
		short sum();
		void pullDie();
		void setPlayerList(List<Player> playersList);

}
