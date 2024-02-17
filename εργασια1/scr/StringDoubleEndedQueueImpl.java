import java.io.PrintStream;
import java.util.NoSuchElementException;

public class StringDoubleEndedQueueImpl implements StringDoubleEndedQueue{ 
    private Node head = null;
	private Node tail = null;
	public int size = 0;
	
	class Node { 
        String item; 
        Node next; 
        Node previous; 
        Node(String item) { 
			this.item = item; 
		} 
	
		public String getItem() {
			return item;
		}
		
		public Node getNext() {
			return next;
		}
		
		public Node getPrev() {
			return previous;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public void setPrev(Node previous) {
			this.previous = previous;
		}
    } 
	
	public boolean isEmpty(){
        return size == 0;
	}
	
	public void addFirst(String new_item){
		Node new_Node = new Node(new_item);
		new_Node.setNext(head);
		new_Node.setPrev(null);
		if(isEmpty()){
			tail = new_Node;
		}		
		else{
			new_Node.setNext(head);
			head.setPrev(new_Node);
		}
		head = new_Node;
		size++;
	}
	
	public void addLast(String new_item){
		Node new_Node = new Node(new_item);
		if(isEmpty()){
			head = new_Node;
		}
		else{
			tail.setNext(new_Node);
			new_Node.setPrev(tail);
		}
		tail = new_Node;
		size++;
	}
	
	public String removeFirst() throws NoSuchElementException{
		if(isEmpty()) throw new NoSuchElementException();
		String first = head.getItem();
		if(head == tail){
			head = null;
		}
		else{
			head = head.getNext();
		}
		size--;
		return first;
	}
	
	public String removeLast() throws NoSuchElementException{
		if (isEmpty()) throw new NoSuchElementException();
		String last = tail.getItem();
		if(head == tail){
			tail = null;
		}
		else{
			tail = tail.getPrev();	
		}
		size--;
		return last;
	}
	
	public String getFirst() throws NoSuchElementException{
		if (isEmpty()) throw new NoSuchElementException();
		return head.getItem();
	}
	
	public String getLast() throws NoSuchElementException{
		if(isEmpty()) throw new NoSuchElementException();
		return tail.getItem();
	}
	
	public void printQueue(PrintStream stream){
		Node node = head;
		while(node != null){
			stream.println(node);
			node = node.next;
		}
	}
	
	public int size() {
		return size;
	}
	
}	