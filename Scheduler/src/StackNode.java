
public class StackNode<T> {

	private StackNode<T> next;
	private T data;
	
	public StackNode(T e) {
		set(e);
	}
	
	public StackNode<T> getNext() {
		return next;
	}
	
	public void setNext(StackNode<T> next) {
		this.next = next;
	}
	
	public T get() {
		return data;
	}
	
	public void set(T data) {
		this.data = data;
	}
}
