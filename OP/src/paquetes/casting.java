package paquetes;

public class casting {
	public static void main (String[] args) {
		
		int varInt = 50;
		float varFloat = 100f;
		
		long varLong = varInt;
		
		double varDouble = varFloat;
		
		//varInt = varLong;
		//varFloat = varDouble;
		
		varLong = 50;
		
		byte varByte = (byte) varLong;
		
		varDouble = 6.5;
		varInt = (int) varDouble;
		
		varLong = 325;
		varByte = (byte) varLong;
		
	}
}
