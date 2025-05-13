package ru.proffen;

import java.util.Stack;


public class ImplementQueueUsingStacks {


    public class MyQueue {
        Stack<Integer> inputStack;
        Stack<Integer> outputStack;

        public MyQueue() {
            inputStack = new Stack<>();
            outputStack = new Stack<>();
        }

        public void push(int x) {
            inputStack.push(x);
        }

        public int pop() {
            if (outputStack.isEmpty()) {
                moveElements();
            }
            return outputStack.pop();
        }

        public int peek() {
            if (outputStack.isEmpty()) {
                moveElements();
            }
            return outputStack.peek();
        }

        public boolean empty() {
            return inputStack.isEmpty() && outputStack.isEmpty();
        }

        private void moveElements() {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }


}
