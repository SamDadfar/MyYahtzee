package com.yahtzee.classes;

import static com.yahtzee.Yahtzee.rollingValue;


public class Die {
	private byte value;
	private boolean pulled;

	public Die() {
		value = (byte) ((rollingValue.nextInt(6)) + 1);
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

	public void pullDie(byte value) {
		if (this.value == value)
			pulled = true;
	}
}
