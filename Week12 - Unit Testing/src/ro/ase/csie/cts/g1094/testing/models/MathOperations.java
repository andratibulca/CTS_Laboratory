package ro.ase.csie.cts.g1094.testing.models;

import ro.ase.csie.cts.g1094.testing.exeptions.DivisionZeroException;

public class MathOperations {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double divide(int a, int b) throws DivisionZeroException{
		if(b == 0) {
			throw new DivisionZeroException();
		}
		return a / b;
	}

}
