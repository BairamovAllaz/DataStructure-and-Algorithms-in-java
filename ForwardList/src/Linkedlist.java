import java.util.Iterator;
public class Linkedlist<T> implements Iterable<Node<T>> {
	
	public class ListIterator implements Iterator<Node<T>>{ 
		private Node<T> tempNode;
		public ListIterator(Node<T> tempNode) {
			this.tempNode = tempNode;
		}
		public boolean hasNext() {
			return tempNode != null;
		}
		public Node<T> next() {
				if(!(hasNext())) { 
					return tempNode;
				}
				Node<T> data = tempNode;
				tempNode = tempNode.pNext;
				return data;
		}
		public void remove() {
            throw new UnsupportedOperationException("Remove not implemented.");
       }
		
	}
	private Node<T> Head;
	
	public Linkedlist(Linkedlist<T> list) {
		Node<T> temNode = list.Head;
		while(temNode != null) { 
			pushBack(temNode.data);
			temNode = temNode.pNext;
		}
	}
	
	public Linkedlist() {
	}
	
	@SafeVarargs
	public Linkedlist(T...arg) { 
		for(T i : arg) { 
			pushBack(i);
		}
	}
	
	public void createLinkedlist(@SuppressWarnings("unchecked") T...arg) { 
		for(T i : arg) { 
			pushBack(i);
		}
	}
	
	public void pushFront(T Data) { 
		Node<T> newnode = new Node<T>(Data); 
		newnode.pNext = Head; 
		Head = newnode;
	}
	
	public void pushBack(T Data) { 
		if(Head == null) { 
			pushFront(Data);
		}
		Node<T> temp = Head;
		Node<T> newnode = new Node<T>(Data); 
		while(temp.pNext != null) { 
			temp = temp.pNext;
		}
		temp.pNext = newnode; 
		newnode = null;
	}
	
	 public void add(int index,T Data) {
		 
		 Node<T> newnNode = new Node(Data); 
		 Node<T> temp = Head; 
		 for(int i = 0; i < index - 1;i++) {
			temp = temp.pNext; 
		 }
		 
		 newnNode.pNext = temp.pNext;
		 temp.pNext = newnNode; 
	}
	 
	public void clear() { 
		this.Head = null;
	}
	
	public void clone(Linkedlist<T> list) {  
		Node<T> temNode = list.Head;
		while(temNode != null) { 
			pushBack(temNode.data);
			temNode = temNode.pNext;
		}
	}
	
	public Boolean contains(T Data) { 
		Node<T> temNode = Head;
		while(temNode != null) { 
			if(temNode.data == Data) {
				return true;
			}
			temNode = temNode.pNext;
		}
		return false;
	}
	
	public T get(int index) { 
		Node<T> temNode = Head;
		T data;
		for(int i = 0;i < index;i++) { 
			temNode= temNode.pNext;
		}
		data = temNode.data;
		return data;
	}
	
	public Node<T> getFirst() { 
		return Head;
	}
	
	public Node<T> getLast() { 
		Node<T> temp = Head;
		while(temp != null) {
			temp = temp.pNext;
		}
		return temp;
	}
	
	
	public void pop_front() { 
		if(Head == null) { 
			return;
		}
		Node<T> erasedNode = Head;
		Head = Head.pNext;
		erasedNode = null;
	}
	
	
	public void pop_back() { 
		Node<T> temp = Head;
		while(temp.pNext.pNext != null) {
			temp = temp.pNext;
		}
		temp.pNext = null;
	}
	
	public void erase(int index) { 
		Node<T> temp = Head;
		for (int i = 0; i < index-1; i++) {
			temp = temp.pNext; 
		}
		Node<T> erased = temp.pNext;
		temp.pNext = temp.pNext.pNext;
		erased = null;
	}
	
	
	public int size() { 
		int s = 0; 
		Node<T> temp = Head;
		while(temp != null) {
			s++;
			temp = temp.pNext;
		}
		return s;
	}
	
	public void print(){
		Node temp = Head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.pNext;
		}	
	}

	@Override
	public Iterator<Node<T>> iterator() {
		return null;
	}
}
