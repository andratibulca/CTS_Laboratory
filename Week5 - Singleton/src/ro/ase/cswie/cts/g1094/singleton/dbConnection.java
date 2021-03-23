package ro.ase.cswie.cts.g1094.singleton;

public class dbConnection {
	
	String connString;
	String schema;
	
	private static dbConnection connection = null;
	
	
	private dbConnection() {
		System.out.println("Creating a connection object");
		System.out.println("Loading configuration....");
		this.connString= "127.0.0.1:1443";
		this.schema="cts";
		}

	private dbConnection(String connString, String schema) {
		super();
		this.connString = connString;
		this.schema = schema;
	}
	
	
	 public static dbConnection getConnection() {
		 if(dbConnection.connection == null) {
			 connection = new dbConnection();
		 }
		 return dbConnection.connection;
	 }
	//it's not clean
	//it's misleading - others will think they have multiple connections
	//public static dbConnection getConnection(String connString, String schema) {
		//if(dbConnection.connection == null) 
		//{
			//we create the object
			///connection = new dbConnection(connString, schema);
		//}
		//return dbConnection.connection;
	//}
	

}
