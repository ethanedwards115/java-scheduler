import java.util.ArrayList;

public class HistoryStack {

	private StackNode<ArrayList<HealthProfessional>> head;
	
	public HistoryStack() {
		head = null;
	}
	
	public StackNode<ArrayList<HealthProfessional>> getHead() {
		return head;
	}
	
	public void setHead(StackNode<ArrayList<HealthProfessional>> newHead) {
		this.head = newHead;
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public void push(ArrayList<HealthProfessional> newList) {
		
		// TODO copy the list's contents to another ArrayList and save that list
		
		ArrayList<HealthProfessional> copyList = new ArrayList<HealthProfessional>();
		
		for(HealthProfessional hp : newList) {
			
		}
	}
	
	public ArrayList<HealthProfessional> pop() {
		
		return null;
	}
}