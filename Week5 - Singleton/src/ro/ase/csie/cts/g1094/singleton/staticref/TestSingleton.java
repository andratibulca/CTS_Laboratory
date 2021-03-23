package ro.ase.csie.cts.g1094.singleton.staticref;

public class TestSingleton {

	public static void main(String[] args) {
		
		dbConnection con1 = dbConnection.connection;
		dbConnection con2 = dbConnection.connection;
		
		if(con1 == con2 ) {
			System.out.println("They are the same");
		}
		
	}

}
