package com.stack.bl;



public class LL {
	// for stack
		 Node head;
		 static int size;
			  public class Node {
				  int data;
				  Node next;
				  
				  public Node(int d) {
					   data = d;
					   next = null;
				  }
			  }
			  
			  public void push(int data) {
				  addFirst(data);
				 } 
			  
			  public boolean isEmpty() {
				  if(head  == null) {
					  return true;
				  }
				  return false;
			  }
			  
			  public void addFirst(int data) {
				  Node newNode = new Node(data);
				  
				  if(isEmpty()) {
					  head = newNode;
					  return;
					 }
				  newNode.next = head;
				  head = newNode;
				 }
			  
			  void peek() {
				  if(isEmpty()) {
					  return ;
				  }
					  System.out.println(head.data);
				  }
			  
		//1: add element at the front of linked list
			  public void add(int data) {
				 
				  Node newNode = new Node(data);   
				  
				  newNode.next = head;
				  head = newNode;
			  }
		//2 : add element at the end
			  public void append(int newdata) {
					Node newNode = new Node(newdata);
				if(head == null) {
					head = new Node(newdata);
					return;
				}	
				newNode.next = null;
				Node last = head;
				while(last.next != null)
					last = last.next;
				}
			  
		//3 :add a node after given node 
			  public void insertAfter(Node prevNode, int data) {
					
				  if(prevNode == null) {
					  System.out.println("prev node cant be null");
					  return;
				  }
				  
				  Node newNode = new Node(data);
				  newNode.next = prevNode.next;
				  prevNode.next = newNode;
				}
			  
			 //
			  
			  public int pop() {
					
					if(head==null) {
						System.out.println("List is empty");
					}
					Node temp = head;
					head = temp.next;
					
					return temp.data;
				}

			  public int popLast() {
					if(head==null) {
						System.out.println("List is empty");
					}
					
					Node temp = head;
					
					while(temp.next.next != null) {
						temp=temp.next;
					}
					
					int popLastKey=temp.next.data;
					temp.next=null;
					return popLastKey;
				}
			  
			  public boolean search(int elememt) {
					
					if(head == null) {
						System.out.println("List is empty");
						return false;
					}
					Node temp = head;
					boolean isFound = false;
					while(temp != null) {
						
						if(temp.data == elememt) {
							isFound = true;
							break;
						}
						temp = temp.next;
					}
					System.out.println(isFound);
					return isFound;
				}
			  
			  public void insertNextToElement(int elememt, int data) {
					
					Node node = new Node(data);
					if(head == null) {
						System.out.println("List is empty");
					}
					Node temp = head;
					while(temp != null) {
						
						if(temp.data == elememt) {
							Node newNode = temp.next;
							temp.next = node;
							node.next = newNode;
							break;
						}
						temp = temp.next;
					}
				}
			  
			  public void remove(int element) {
					if(search(element)) {
						System.out.println("Data not present");
						return ;
					}
					Node temp = head;
					Node prev = null;
					if(temp != null && temp.data == element) {
						head = temp.next;
						return ;
					}
						
					while(temp != null) {
						if(temp.data == element ) {
							prev.next = temp.next;
							return ;
						}
						prev = temp;
						temp = temp.next;
					}
					
					return ;
					
				}

				public void enqueue(int data) {
					addLast(data);
				}

				protected void addLast(int data) {
					Node newNode = new Node(data);
					if (isEmpty()) {
						head = newNode;
						return;
					}

					Node currNode = head;
					while (currNode.next != null) {
						currNode = currNode.next;
					}
					currNode.next = newNode;
				}
				

				public void dequeue() {
					deleteFirst();
				}
				
				protected void deleteFirst() {
					if (isEmpty()) {
						return;
					}
					head = head.next;
					size--;
				}
				
				protected void deleteLast() {
					if (isEmpty()) {
						return;
					}
					size--;
					if (head.next == null) {
						head = null;
						return;
					}
					Node currNode = head;
					while (currNode.next.next != null) {
						currNode = currNode.next;
					}
					currNode.next = null;
				}
			  
			  
			  
				public void print() {
					if(head==null) {
						System.out.println("linkedList is empty");
					}else {
						Node temp =head;
						System.out.println("LinkedList is : ");
						while(temp!=null) {
							System.out.print(temp.data + "->");
							temp=temp.next;
						}
					}
					System.out.println();	
			}	
		}

