package com.yahtzee;

public enum ItemOfTable {
	ONES(1,0),
	TWOS(2,0),
	THREES(3,0),
	FOURS(4,0),
	FIVES(5,0),
	SIXES(6,0),
	THREE_OF_KIND(7,0),
	FOUR_OF_KIND(8,0),
	FULL_HOUSE(9,25),
	SMALL_STRAIGHT(10,30),
	LARGE_STRAIGHT(11,40),
	CHANCE(12,0),
	YAHTZEE(13,50),
	BONUS(14,100),
	SUM(15,0),
	TOTAL_SCORES(16,375),
	;
	
	private int code;
	private int maxValue;
	private ItemOfTable(int code,int maxValue) {
		this.code=code;
		this.maxValue=maxValue;
	}
	public int getCode() {
		return code;
	}
	public int getMaxValue() {
		return maxValue;
	}
}
