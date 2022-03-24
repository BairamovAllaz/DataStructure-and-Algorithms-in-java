public class Node<T>{ 
	public T data; 
	Node<T> pNext;		
	public Node(T data) {
		this.data = data;
		this.pNext = null;
	}
}