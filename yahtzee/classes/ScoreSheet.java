package com.yahtzee.classes;
import static com.yahtzee.Yahtzee.*;


public class ScoreSheet {

	public static final byte YAHTZEE = 50;
	private short totalScore;
	public static Score lScores[] = new Score[lowerArray.length];
	public static Score uScores[] = new Score[upperArray.length];
	private static Upper upper;
	private static Lower lower;
	public static byte counter=0;
	
	public ScoreSheet() {
		upper=new Upper();
		lower=new Lower();
	}
	public short getTotalScore() {
		return totalScore;
	}
	
	
	private class Upper extends Score {
		Upper() {
			for (int i = 0; i < upperArray.length; i++) 
				uScores[i] = new Score(upperArray[i]);	
		}
		
	}
	private class Lower extends Score{
		Lower() {
			for (int i = 0; i < lowerArray.length; i++) 
				lScores[i] = new Score(lowerArray[i]);
		}
		
	}

	class Score {
		String name;
		byte value;
		Score(){}
		Score(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public byte getValue() {
			return value;
		}

		public void setValue(byte value) {
			if(counter==0) {
			this.value = value;
			counter++;}
		}

	}
}
