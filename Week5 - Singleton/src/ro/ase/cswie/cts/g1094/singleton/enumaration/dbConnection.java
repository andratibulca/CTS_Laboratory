package ro.ase.cswie.cts.g1094.singleton.enumaration;

public enum dbConnection {
	
	
	//enum are classes
	
	//the unique object
	//u cant create more symbols because the constructor is private
	//
	DEV_DB;
	
	String connString;
	String schema;
	
	
	
	private dbConnection() {
		System.out.println("Loading settings from the conf file");
	}
	
	

}
