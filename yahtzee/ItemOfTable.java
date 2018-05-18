package com.yahtzee;

public enum ItemOfTable {
	ONES(1),
	TWOS(2),
	THREES(3),
	FOURS(4),
	FIVES(5),
	SIXES(6),
	THREE_OF_KIND(7),
	FOUR_OF_KIND(8),
	FULL_HOUSE(9),
	SMALL_STRAIGHT(10),
	LARGE_STRAIGHT(11),
	CHANCE(12),
	BONUS(13),
	SUM(14),
	YAHTZEE(15),
	TOTAL_SCORES(16),
	
	;
	
	private int code;
	private ItemOfTable(int code) {
		this.code=code;
	}
}
