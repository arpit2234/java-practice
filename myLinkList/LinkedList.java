package myLinkList;




public class LinkedList {
	Node head;
	public void insert(int inserted) {
		Node node=new Node();
		node.data=inserted;
		node.next=null;
		
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		}
	public void show() {
		Node node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data
				
				
				);
	}

}
