
package com.java.collections;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
       Stack<Integer> stack = new Stack<>();
       stack.push(23);
       stack.push(45);
       stack.push(67);
       System.out.println(stack);
       int pops;
       pops = stack.pop();
       System.out.println(pops);
       System.out.println(stack);
    }
}
