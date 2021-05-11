package ro.ase.csie.g1094.dp.chain;

public abstract class ChatHandler {
	
	ChatHandler next;
	
	
	public void setNext(ChatHandler next) {
		this.next = next;
	}


	public abstract void processMessage(Message msg);
	

}
