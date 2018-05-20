package com.yahtzee.classes;

import static com.yahtzee.Yahtzee.random;


public class Die {
	private byte value;
	private boolean pulled;

	public Die() {
		value = (byte) ((random.nextInt(6)) + 1);
	}

	public byte getValue() {
		return value;
	}

	public byte roll() {
		return new Die().getValue();
	}

	public boolean isPulled() {
		return pulled;
	}
	public void push() {
		pulled=false;
	}
	public void pull() {
			pulled = true;
	}
}
