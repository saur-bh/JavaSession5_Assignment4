package com.acadglid.sessiomn;

public class Assignment4 {

	public static void main(String[] args) {


		// Create object of fixedStack. Stack

		Stack fStack = new FixedStack(5);

		//1. Perform the push operation now stack will be having value 1 

		fStack.push(1);

		//2. perform the pop operation which will return last inserted value i.e. 1

		System.out.println(fStack.pop());

		//3. perform the pop again: It will throw error "Stack is empty"

		System.out.println(fStack.pop());

		//4. Try to push item more then define in stack i.e. 5

		fStack.push(3);
		fStack.push(20);
		fStack.push(7);
		fStack.push(90);
		fStack.push(100);

		//5. Since the size of the stack is 5 now pushing other element will throw error "Stack overflow"
		fStack.push(1);


		//ShowCase th size of stack growing

		Stack vStack = new VariableStack(2);

		// After insert of 1, 2 size of stack will be increased.

		vStack.push(1);
		vStack.push(2);
		vStack.push(4);
		vStack.push(56);
		vStack.push(23);

		// pop operation 
		System.out.println(vStack.pop());
		System.out.println(vStack.pop());




	}

}
