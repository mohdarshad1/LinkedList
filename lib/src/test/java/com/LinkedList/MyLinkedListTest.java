package com.LinkedList;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void given3Numbers_WhenAdded_ShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myThirdNode) && 
						 myLinkedList.head.getNext().equals(mySecondNode) && 
						 myLinkedList.tail.equals(myFirstNode);
		assertTrue(result);
	}

	@Test
	public void given3Numbers_WhenAppended_ShouldBeAddedToLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) && 
						 myLinkedList.head.getNext().equals(mySecondNode) && 
						 myLinkedList.tail.equals(myThirdNode);
		assertTrue(result);
	}
	
	@Test
	public void given3Numbers_InsertSecondInBetween_ShouldPassTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		System.out.println("Adding element between 2 nodes: ");
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) && 
				 		 myLinkedList.head.getNext().equals(mySecondNode) && 	 	 
				 		 myLinkedList.tail.equals(myThirdNode);
		assertTrue(result);
	}
	
	@Test
	public void givenFirstElement_WhenDeleted_ShouldPassTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode deletedNode = myLinkedList.pop();
		System.out.println("Deleting first element: ");
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(mySecondNode) && 
						 myLinkedList.head.getNext().equals(myThirdNode) && 
						 myLinkedList.tail.equals(myThirdNode);
		assertTrue(result);
	}
	
	@Test
	public void givenThirdElement_WhenDeleted_ShouldPassTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.popLast();
		System.out.println("Deleting last element: ");
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) && 
						 myLinkedList.head.getNext().equals(mySecondNode) && 
						 myLinkedList.tail.equals(mySecondNode);
		assertTrue(result);
	}
	
	@Test
	public void givenElement_WhenSearch_ShouldPassTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode found = myLinkedList.search(mySecondNode.getKey());
		boolean result = myLinkedList.head.equals(found) || 
						 myLinkedList.head.getNext().equals(found) || 
						 myLinkedList.tail.equals(found);
		assertTrue(result);
	}
}