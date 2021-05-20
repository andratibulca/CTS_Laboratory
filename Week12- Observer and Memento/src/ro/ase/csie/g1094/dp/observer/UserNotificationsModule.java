package ro.ase.csie.g1094.dp.observer;

public class UserNotificationsModule implements ConnectionStatusInterface {
	
	public void connectionUp() {
		System.out.println("Popup:Connection is active");
	}
	
	public void connectionDown() {
		System.out.println("Popup:Connection to the server is lost");
	}

}
