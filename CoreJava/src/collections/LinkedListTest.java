package collections;

import java.util.Scanner;

public class LinkedListTest {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void printList() {
		Node temp = this.head;
		if (temp != null) {
			while (temp != null) {
				System.out.print(temp.data + "  ");
				temp = temp.next;
			}
		}
		System.out.println();
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {

			head = newNode;
		} else {
			Node curr;
			Node temp = this.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}
	
	public void insertAtBegining(int data) {
		
		Node node=new Node(data);
		
		node.next=head;
		head=node;
		
	}
	
	public void deleteData(int data) {
		Node temp = head;
		Node prev = null ;
		while(temp.data!=data) {
			prev=temp;
			temp=temp.next;			
		}
		prev.next=temp.next;
	}
	
	public void deleteFirst() {
		head=head.next;
	}
	
	public void deleteLast() {
		Node temp =head;
		Node prv=null;
		while(temp.next !=null) {
			prv=temp;
			temp=temp.next;		
		}
		prv.next=null;
	}
	
	public int size() {
		int size = 0;
		
		if(head==null) {
			return size;
		}
		Node temp = head;
		while(temp !=null) {
			size++;
			temp=temp.next;
		}
		
		return size;
	}
	
	public void swapFirstTwo() {
		Node temp=head;
		
		head=head.next;
		temp.next=head.next;
		head.next=temp;
		
	}
	
	
	public void swapTwoelement(int a , int b) {
		Node curA=head,prevA=null;
		Node curB=head,prevB=null;
		
		while(curA.data!=a ) {
			prevA=curA;
			curA=curA.next;
		}
		
		while(curB.data!=b ) {
			prevB=curB;
			curB=curB.next;
		}
		prevA.next=curB;
		prevB.next=curA;
		
		Node temp=curA.next;
		curA.next=curB.next;
		curB.next=temp;
		
	}
	
	
	
	

	public static void main(String[] args) {

		LinkedListTest ls = new LinkedListTest();
		ls.push(2);
		ls.push(3);
		ls.push(4);
		ls.push(5);

		System.out.println("Raw Data is    ");
		ls.printList();
		
		System.out.println("Data inserted at begining  ");
		ls.insertAtBegining(1);
		ls.printList();
		
		/*System.out.println("Please enter the Element You want to delete ");
		Scanner s=new Scanner(System.in);
		int data = s.nextInt();
		ls.deleteData(data);
		ls.printList();*/
		
		/*System.out.println("Deleted First Element  ");
		ls.deleteFirst();
		ls.printList();*/
		
		/*System.out.println("Last Element deleted");
		ls.deleteLast();
		ls.printList();
		System.out.println("Size is   "+ls.size());*/
		
		System.out.println("First Two Swapped ");
		ls.swapTwoelement(2, 3);
		ls.printList();
	}
}
