package com.yahtzee.classes;

import static com.yahtzee.Yahtzee.*;

import java.util.Arrays;
import java.util.Comparator;

public class Cup {

	private Die[] diceArray = new Die[NUM_DIE];
	private byte[] countByDie=new byte[6];
	
	
	public Cup() {
		for (int i = 0; i < diceArray.length; i++) {
			diceArray[i] = new Die();
		}
		sortByValue();
	}

	public void setCup(Die[] diceArray) {
		this.diceArray = diceArray;
	}

	public Die[] roll() {
		for (int i = 0; i < diceArray.length; i++) {
			diceArray[i].roll();
		}
		return diceArray;
	}

	public Die[] getDiceArray() {
		return diceArray;
	}

	public byte sumOfDice() {
		int sum = 0;
		for (Die d : diceArray) {
			sum += d.getValue();
		}
		return (byte) sum;
	}
	
	// return a array of number of each die :index0=Die1,index1=Die2,...,index5=Die6
	public void setCountByDie() {
		byte[] countByValue = new byte[6];
		for (int i = 0; i < countByValue.length; i++) {
			switch (i + 1) {
			case 1:
				for (int j = 0; j < diceArray.length; j++) {
					if (diceArray[j].getValue() == 1)
						countByValue[i]++;
				}
				break;
			case 2:
				for (int j = 0; j < diceArray.length; j++) {
					if (diceArray[j].getValue() == 2)
						countByValue[i]++;
				}
				break;
			case 3:
				for (int j = 0; j < diceArray.length; j++) {
					if (diceArray[j].getValue() == 3)
						countByValue[i]++;
				}
				break;
			case 4:
				for (int j = 0; j < diceArray.length; j++) {
					if (diceArray[j].getValue() == 4)
						countByValue[i]++;
				}
				break;
			case 5:
				for (int j = 0; j < diceArray.length; j++) {
					if (diceArray[j].getValue() == 5)
						countByValue[i]++;
				}
				break;
			case 6:
				for (int j = 0; j < diceArray.length; j++) {
					if (diceArray[j].getValue() == 6)
						countByValue[i]++;
				}
				break;

			}
		}

		countByDie=countByValue;
	}
	public byte[] getValueByDie() {
		return countByDie;
	}
	public boolean isThreeOfKind() {
		for(int i=0;i<countByDie.length;i++) {
			if(countByDie[i]==3)
				return true;
		}
		return false;
	}
	public boolean isFourOfKind() {
		for(int i=0;i<countByDie.length;i++) {
			if(countByDie[i]==4)
				return true;
		}
		return false;
	}
	public boolean isFullHouse() {
		for(int i=0;i<countByDie.length;i++) {
			if(countByDie[i]==3)
				for(byte b:countByDie) {
					if(b==2)
						return true;
				}
		}
		return false;
	}
	public boolean isSmallStraight() {
		byte count=0;
		for(int i=0;i<getValueByDie().length;i++) {
			if(getValueByDie()[i]>=1) {
				count++;
			}}
			if(count==4)
				return true;
			else
				return false;
		
			
	}
	public boolean isYahtzee() {
		for(int i=0;i<countByDie.length;i++) {
			if(countByDie[i]==1)
				break;
			else if(countByDie[i]==5)
				return true;
		}
				return false;
	}
	public boolean isLargeStraight() {
		byte count=0;
		for(int i=0;i<getValueByDie().length;i++) {
			if(getValueByDie()[i]==1) {
				count++;
			}}
			if(count==5)
				return true;
			else
				return false;
		
	}
	public byte sumThreeOfKind() {
		int sum=0;
		for(int i=0;i<countByDie.length;i++) {
			if(countByDie[i]==3) 
				sum+=countByDie[i]*(i+1);
			else
				sum+=countByDie[i]*(i+1);
		}
		return (byte)sum;
	}
	
	public byte sumFourOfKind() {
		int sum=0;
		for(int i=0;i<countByDie.length;i++) {
			if(countByDie[i]==4) 
				sum+=countByDie[i]*(i+1);
			else
				sum+=countByDie[i]*(i+1);
		}
		return (byte)sum;
	}
	public byte sumOfCup() {
		byte sum=0;
		for(int i=0;i<countByDie.length;i++) {
			sum+=(countByDie[i]*(i+1));
		}
		return sum;
	}
	public static void main(String[] arg) {
		Cup cup=new Cup();
		//cup.sortByValue();
		/*for(int i=0,j=3;i<cup.getDiceArray().length;i++)
			cup.getDiceArray()[i].setValue((byte)j);*/
		cup.sortByValue();
		for(Die d:cup.diceArray)
			System.out.print(d.getValue()+"\t");
		cup.setCountByDie();
		for(byte d:cup.countByDie)
			System.out.print(d);
		//System.out.println("\nfourOfKind"+cup.isFourOfKind()+"\nthreeOfKind"+cup.isThreeOfKind()+"\nsmallStraight "+cup.isFullHouse()+"\nlargeStraight"+cup.isSmallStraight()+""+cup.isLargeStraight());
		System.out.println("\n"+cup.sumOfCup());
	}
	class SortByRoll implements Comparator<Die> {

		@Override
		public int compare(Die o1, Die o2) {
			return o1.getValue() - o2.getValue();
		}

	}

	public void sortByValue() {
		Arrays.sort(diceArray, new SortByRoll());
	}
}
