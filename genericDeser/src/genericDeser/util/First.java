package genericDeser.util;

import genericDeser.fileOperations.Logger;

public class First {
	private int IntValue;
	private String StringValue; 
	private short ShortValue;
	private float FloatValue;
	private byte ByteValue;
	private long LongValue;
	private double DoubleValue;
	private boolean BooleanValue;
	private char CharValue;
	
	public First(){
		Logger.writeMessage("Constructor of First Called",Logger.DebugLevel.CONSTRUCTOR);
	}

	public int getIntValue() {
		return IntValue;
	}

	public void setIntValue(int intValue) {
		IntValue = intValue;
	}

	public String getStringValue() {
		return StringValue;
	}

	public void setStringValue(String stringValue) {
		StringValue = stringValue;
	}

	public short getShortValue() {
		return ShortValue;
	}

	public void setShortValue(short shortValue) {
		ShortValue = shortValue;
	}

	public float getFloatValue() {
		return FloatValue;
	}

	public void setFloatValue(float floatValue) {
		FloatValue = floatValue;
	}

	public byte getByteValue() {
		return ByteValue;
	}

	public void setByteValue(byte byteValue) {
		ByteValue = byteValue;
	}

	public long getLongValue() {
		return LongValue;
	}

	public void setLongValue(long longValue) {
		LongValue = longValue;
	}

	public double getDoubleValue() {
		return DoubleValue;
	}

	public void setDoubleValue(double doubleValue) {
		DoubleValue = doubleValue;
	}

	public boolean isBooleanValue() {
		return BooleanValue;
	}

	public void setBooleanValue(boolean booleanValue) {
		BooleanValue = booleanValue;
	}

	public char getCharValue() {
		return CharValue;
	}

	public void setCharValue(char charValue) {
		CharValue = charValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (BooleanValue ? 1231 : 1237);
		result = prime * result + ByteValue;
		result = prime * result + CharValue;
		long temp;
		temp = Double.doubleToLongBits(DoubleValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Float.floatToIntBits(FloatValue);
		result = prime * result + IntValue;
		result = prime * result + (int) (LongValue ^ (LongValue >>> 32));
		result = prime * result + ShortValue;
		result = prime * result
				+ ((StringValue == null) ? 0 : StringValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		First other = (First) obj;
		if (BooleanValue != other.BooleanValue)
			return false;
		if (ByteValue != other.ByteValue)
			return false;
		if (CharValue != other.CharValue)
			return false;
		if (Double.doubleToLongBits(DoubleValue) != Double
				.doubleToLongBits(other.DoubleValue))
			return false;
		if (Float.floatToIntBits(FloatValue) != Float
				.floatToIntBits(other.FloatValue))
			return false;
		if (IntValue != other.IntValue)
			return false;
		if (LongValue != other.LongValue)
			return false;
		if (ShortValue != other.ShortValue)
			return false;
		if (StringValue == null) {
			if (other.StringValue != null)
				return false;
		} else if (!StringValue.equals(other.StringValue))
			return false;
		return true;
	}

		
	
}
