package ro.ase.csie.cts.g1094.singleton.staticref;

public class dbConnection {
		
		String connString;
		String schema;
	
		//eager-instantiation
	public final static dbConnection connection = new dbConnection();
		
	//static class initializer
	static {
		//called only once before the class is loaded by the java virtual machine	
	    System.out.println("Hello. DbConnection is loaded");
	    connection.connString="10.0.01:1443";
	    connection.schema ="tempData";
	}
	
	//constructor initializer
	{
		//called every time before any constructor call
		System.out.println("Building an object...");
	}
	
	//if u dont define it u get the free public version of it
	private dbConnection() {
			System.out.println("Creating a connection object");
			System.out.println("Loading configuration....");
			this.connString= "127.0.0.1:1443";
			this.schema="cts";
		}

		
		
		
}
