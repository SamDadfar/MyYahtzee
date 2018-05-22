package com.yahtzee.classes;

import static com.yahtzee.Yahtzee.*;


import com.yahtzee.ItemOfTable;
public class ScoreSheet {

	private short totalScore;
	private Score[] scoreSheetItems=new Score[16];
	public ScoreSheet() {
		
		for(int i=0;i<scoreSheetItems.length;i++)
			scoreSheetItems[i]=new Score(ItemOfTable.values()[i].name().toString());
		
		}
	
	public Score[] getScoreSheetItems() {
		return scoreSheetItems;
	}
	public short getTotalScore() {
		return totalScore;
	}

	public class Score {
		String name;
		byte value;
		boolean checked;

		Score(String name){
			this.name=name;
		}

		public String getName() {
			return name;
		}

		public boolean isChecked() {
			return checked;
		}

		public byte getValue() {
			return value;
		}

		public void setValue(byte value) {
			if (!isChecked()) {
				this.value = value;
				checked=true;
			}
			 
		}
		public short sumOfScores() {
			short count=0;
			for(int i=0;i<14;i++) {
				count+=scoreSheetItems[i].getValue();
			}
			return count;
		}

	}
}
