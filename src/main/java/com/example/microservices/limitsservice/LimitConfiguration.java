package com.example.microservices.limitsservice;

public class LimitConfiguration {

	private int minimum;

	private int maximum;

	public LimitConfiguration(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}

}
