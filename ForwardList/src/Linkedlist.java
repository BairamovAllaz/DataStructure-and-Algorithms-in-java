
public class Linkedlist<T> {
	
	public class Node{ 
		public T data; 
		Node pNext;		
		
		public Node(T data) {
			this.data = data;
			this.pNext = null;
		}
	}
	private Node Head;
	
	
	public Linkedlist(Linkedlist<T> list) {
		Node temNode = list.Head;
		while(temNode != null) { 
			pushBack(temNode.data);
			temNode = temNode.pNext;
		}
	}
	
	public Linkedlist() {
	}
	
	
	public void pushFront(T Data) { 
		Node newnode = new Node(Data); 
		newnode.pNext = Head; 
		Head = newnode;
	}
	
	public void pushBack(T Data) { 
		if(Head == null) { 
			pushFront(Data);
		}
		Node temp = Head;
		Node newnode = new Node(Data); 
		while(temp.pNext != null) { 
			temp = temp.pNext;
		}
		temp.pNext = newnode; 
		newnode = null;
	}
	
	 public void add(int index,T Data) {
		 
		 Node newnNode = new Node(Data); 
		 Node temp = Head; 
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
		Node temNode = list.Head;
		while(temNode != null) { 
			pushBack(temNode.data);
			temNode = temNode.pNext;
		}
	}

	
	public Boolean contains(T Data) { 
		Node temNode = Head;
		while(temNode != null) { 
			if(temNode.data == Data) {
				return true;
			}
			temNode = temNode.pNext;
		}
		return false;
	}
	
	public Node get(int index) { 
		Node temNode = Head;
		for(int i = 0;i < index;i++) { 
			temNode= temNode.pNext;
		}
		return temNode;
	}
	
	public Node getFirst() { 
		return Head;
	}
	
	public Node getLast() { 
		Node temp = Head;
		while(temp != null) {
			temp = temp.pNext;
		}
		return temp;
	}
	
	
	public void pop_front() { 
		if(Head == null) { 
			return;
		}
		Node erasedNode = Head;
		Head = Head.pNext;
		erasedNode = null;
	}
	
	
	public void pop_back() { 
		Node temp = Head;
		while(temp.pNext.pNext != null) {
			temp = temp.pNext;
		}
		temp.pNext = null;
	}
	
	public void erase(int index) { 
		Node temp = Head;
		for (int i = 0; i < index-1; i++) {
			temp = temp.pNext; 
		}
		Node erased = temp.pNext;
		temp.pNext = temp.pNext.pNext;
		erased = null;
	}
	
	
	public int size() { 
		int s = 0; 
		Node temp = Head;
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
}
