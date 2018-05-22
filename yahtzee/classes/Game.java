package com.yahtzee.classes;

import static com.yahtzee.Yahtzee.*;
import  com.yahtzee.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Game{
	private byte numOfRund;
	private boolean lastRound;
	private List<Player> playersList=new ArrayList<>();
	
	public Game(String... playerName) {
		
		for(int i=0;i<playerName.length;i++)
			playersList.add(new Player(playerName[i]));
	}
	public Game() {
		this(DEFAULT_NAME);
	}
	
}
