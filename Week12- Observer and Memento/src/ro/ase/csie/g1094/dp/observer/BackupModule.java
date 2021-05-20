package ro.ase.csie.g1094.dp.observer;

public class BackupModule implements ConnectionStatusInterface {

	@Override
	public void connectionUp() {
		System.out.println("Display restore points");
		
	}

	@Override
	public void connectionDown() {
		System.out.println("Create restore point");
		
	}
	
	

}
