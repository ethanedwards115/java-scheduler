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
			
			copyList.add(hp.clone());
		}
		
		if(isEmpty()) {
			head = new StackNode<ArrayList<HealthProfessional>>(copyList);
		
		} else {
			
			StackNode<ArrayList<HealthProfessional>> current = head;
			
			do {
				current.getNext();
				
			} while (current != null);
			
			current = new StackNode<ArrayList<HealthProfessional>>(copyList);
		}
	}
	
	public ArrayList<HealthProfessional> pop() {
		
		return null;
	}
}