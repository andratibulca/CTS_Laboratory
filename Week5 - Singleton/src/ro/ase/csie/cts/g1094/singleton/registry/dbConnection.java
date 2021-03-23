package ro.ase.csie.cts.g1094.singleton.registry;

import java.util.Hashtable;

public class dbConnection {
		
		String connString;
		String schema;
		
		private static Hashtable<String, dbConnection> connections = new Hashtable<>();
		
		
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
		
		public static dbConnection getdbConnection(String connString, String schema) {
			dbConnection connection = connections.get(connString);
			if(connection == null) {
				connection = new dbConnection(connString, schema);
				connections.put(connString, connection);
				
			}
			return connection;
		}

}
