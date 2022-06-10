package com.java.assessment1;

public class InvalidPsswordException extends Exception
{
	String pin;
	public InvalidPsswordException(String pin) {
		this.pin=pin;
	}
	public String show()
	{
		return "invalid pin :"+pin;
	}
}
