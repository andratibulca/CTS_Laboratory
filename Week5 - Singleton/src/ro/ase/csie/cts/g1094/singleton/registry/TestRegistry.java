package ro.ase.csie.cts.g1094.singleton.registry;

public class TestRegistry {

	public static void main(String[] args) {
		
		dbConnection con1= dbConnection.getdbConnection("127.0.0.1", "devDB");
		dbConnection con2= dbConnection.getdbConnection("127.0.0.1", "devDB");
		
		if(con1==con2) {
			System.out.println("They are the same");
			
		}
		
		dbConnection con3= dbConnection.getdbConnection("10.0.0.1", "proudDb");
		
		if(con1!=con2) {
			System.out.println("They are different");
			
		}
		

	}

}
