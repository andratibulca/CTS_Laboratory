package ro.ase.cswie.cts.g1094.singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
		//dbConnection con1= new DbConnection();
		//...
		//dbConnection con2= new DbConnection();
		
		//dbConnection con1 = new dbConnection("127.0.0.1:3306", "cts");
		//dbConnection con2 = new dbConnection("197.0.0.1:3306", "cts");
		
		dbConnection con1 = dbConnection.getConnection();
		dbConnection con2 = dbConnection.getConnection();
		
		//dbConnection con1= dbConnection.getConnecction();
		
		//dbConnection con1 = dbConnection.getConnection("127.0.0.1:1443", "cts");
		//dbConnection con2 = dbConnection.getConnection("127.0.0.1:1443", "cts");
		
		//dbConnection con3= dbConnection.getConnection("10.0.0.1:1443", "productionDB");
		
		
		if (con1 == con2) {
			System.out.println("They are pointing to the same database");
		}
		
		
	}

}
