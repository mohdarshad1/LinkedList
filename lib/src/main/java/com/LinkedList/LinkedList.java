package com.LinkedList;

public class LinkedList {
	Node head; 					// head of list 
	static class Node { 
        int data; 
        Node next; 
        Node(int d) { 
        	data = d; 
            next = null; 
        } 						// Constructor 
    } 
    public static void main(String[] args) { 
        LinkedList listObj = new LinkedList(); 
        listObj.head = new Node(56); 
        Node second = new Node(30); 
        Node third = new Node(70); 
        listObj.head.next = second;  
        second.next = third; 
    } 
}
