package com.yahtzee;

import java.util.ArrayList;
import java.util.List;

import com.yahtzee.classes.*;

public abstract class Yahtzee{
	
	
	private static byte numOfPlayer;
	ArrayList<Player> playersList=new ArrayList<>();

	public abstract void setRound(byte numOfPlayer);
	public abstract void setScoreSheet();
	
	public byte getNumOfPlayer() {
		return numOfPlayer;
	}
	
	public void setNumOfPlayer(byte numOfPlayer) {
		Yahtzee.numOfPlayer=numOfPlayer;
	}

}
