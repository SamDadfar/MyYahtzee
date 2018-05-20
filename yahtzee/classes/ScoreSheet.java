package com.yahtzee.classes;

import static com.yahtzee.Yahtzee.*;
import com.yahtzee.ItemOfTable;
public class ScoreSheet {

	private short totalScore;
	private Score[] scoreSheet=new Score[16];
	//private byte counter=0;

	public ScoreSheet() {
		for(int i=0;i<scoreSheet.length;i++)
			scoreSheet[i]=new Score();
		for(int i=0;i<scoreSheet.length;i++) {
			scoreSheet[i].name=ItemOfTable.values()[i].name().toString();
		}
	}
	public Score[] getScoreSheet() {
		return scoreSheet;
	}
	public short getTotalScore() {
		return totalScore;
	}

	public class Score {
		String name;
		byte value;
		boolean checked;

		

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

	}
}
