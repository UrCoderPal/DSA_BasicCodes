package LinkedList;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class ReverseSinglyLL {

	public static void main(String[] args) {
		ADT a = new ADT();
		a.insertLeft(10);
		a.insertLeft(30);
		a.insertLeft(40);
		a.insertLeft(50);
		a.insertLeft(60);
		a.insertLeft(90);
		a.insertLeft(100);
		a.printList();
		a.revUsingRec();
		System.out.println();
		a.printList();
		System.out.println();
		a.revUsingAdt();
		a.printList();
		System.out.println();
		System.out.println("elm at mid");
		System.out.println(a.findMid());
	}
}

class ADT {
	private Node root;

	public int findMid() {
		Node fast, slow;
		fast = slow = root;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;
	}

	void revUsingAdt() {
		Node oldHead = root;
		root = null;
		while (oldHead != null) {
			Node temp = oldHead;
			oldHead = oldHead.next;
			temp.next = root; // for first node its next wud be null
			root = temp; // for first root will be node1 n on subsequent become root itself n prev root
							// at its next
		}

	}

	private Node revUsingRec(Node h) {
		if (h.next == null) {
			root = h;
			return h;
		}

		Node t = revUsingRec(h.next);
		h.next = t.next;
		t.next = h;
		return h;
	}

	public void revUsingRec() {
		// this is a wrapper method to not give user access to head/root node
		revUsingRec(root);
	}

	public void printList() {
		if (root == null)
			System.out.println("Empty List");
		else {
			Node t = root;
			while (t != null) {
				System.out.print(t.data + "-> ");
				t = t.next;
			}
		}
	}

	public void insertLeft(int data) {
		Node n = new Node(data);
		if (root == null)
			root = n;
		else {
			Node t = n;
			t.next = root;
			root = t;
		}
		System.out.println("One node inserted on left with data " + n.data);
	}

	public void deleteLeft() {
		if (root == null)
			System.out.println("Empty List");
		else {
			Node t = root;
			root = t.next;
//			t = null; // not required cz scope of local variable is block scope
			System.out.println("Deleted Data From Right Node is " + t.data);
		}
	}

}
