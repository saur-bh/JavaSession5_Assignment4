
/*
class FixedStack that can accept a fixed numbers of integers. The size of the Stack will be specified
in the constructor. If the number of integers exceeds the size, “Stack overflow” message should
be displayed.
 */

package com.acadglid.sessiomn;

public class FixedStack implements Stack {

	//Declared two variable as private so that can not be changed from outside class.

	private int[] fixedStack ;  //Declare the array, and initialize the size with constructor
	private int top = -1;		// top will be used to check overflow and underflow of the stack

	//constructor 
	FixedStack(int size){

		fixedStack = new int[size];   //Initializing the size of the array

	}


	@Override
	public void push(int i) {


		// insert item to stack till stack is not full, increment the top by one
		if(top!=fixedStack.length -1) {

			fixedStack[++top]=i;
		}

		else {

			System.out.println("The stack is overflowed..");
		}


		System.out.println("The Last item is satck is-->"+fixedStack[top]);
		System.out.println("--------------------------------------------");


	}

	@Override
	public int pop() {

		// Check for the top not be empty  if not return the item and decrement the top by one.
		if(top==-1) {

			System.out.println("The Stack is empty insert element using push(int value)");
			return -1;

		}

		return fixedStack[top--];



	}

}
