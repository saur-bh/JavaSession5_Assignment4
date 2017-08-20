/*
class VariableStack that can accept numbers more than its size. The size of the Stack will be
specified in the constructor. If the number of integers exceeds the size, the stack should
automatically grow to accommodate the new element.
 */


package com.acadglid.sessiomn;

public class VariableStack implements Stack {

	// Two variable top and array 

	private int top = -1;
	private int[] varStack;

	//constructor 
	VariableStack(int size){

		varStack = new int[size];   //Initializing the size of the array

	}


	@Override
	public void push(int i) {


		// insert item to stack till stack is not full, increment the top by one
		if(top!=varStack.length -1) {

			varStack[++top]=i;
		}

		else {

			System.out.println("Stack size to be increased");
			varStack = increaseSizeofArray(varStack);
			varStack[++top]=i;
		}


		System.out.println("The Last item is satck is-->"+varStack[top]);
		System.out.println("--------------------------------------------");


	}

	private int[] increaseSizeofArray(int[] stack) {

		int [] tempStack = new int[stack.length+1];  //Increased the size by one and copy all item to new array

		for( int i =0 ; i<stack.length;i++) {

			tempStack[i]=stack[i];
		}


		return tempStack;

	}


	@Override
	public int pop() {

		// Check for the top not be empty  if not return the item and decrement the top by one.
		if(top==-1) {

			System.out.println("The Stack is empty insert element using push(int value)");
			return -1;

		}

		return varStack[top--];

	}

}
