package ro.ase.csie.g1094.dp.command;

public class BackUpModule implements GameModuleInterface {
	
	

	@Override
	public void doTask(String taskName) {
		System.out.println("Backing up data: "+ taskName);
		
	}

}
