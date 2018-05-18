package com.yahtzee.classes;

import java.util.Random;

import static com.yahtzee.Iyahtzee.*;
public class Die{

	private byte value;
	private boolean pulled;
	
	public Die() {
		value=(byte)((rollingValue.nextInt(6))+1);
	}
	/*private Die(byte value) {
		this.value=value;
	}
	public static Die getDice(byte value) {
		return new Die(value);
	}*/
	public byte getValue() {
		return value;
	}
	public void roll() {
		value=(byte)((rollingValue.nextInt(6))+1);
	}
	public void setPulled(boolean bool) {
		pulled=bool;
	}
	public boolean isPulled() {
		return pulled;
	}
	public static void main(String[] args) {
		
		/*Die[] dArray=new Die[3];
		for(Die d: dArray)
			d=new Die();
		dArray[2]=null;
		if(dArray[2])
			System.out.println("this one is null");
		else 
			System.out.println("this is not null");*/
	}
	
}
