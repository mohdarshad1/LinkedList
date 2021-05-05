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
}
