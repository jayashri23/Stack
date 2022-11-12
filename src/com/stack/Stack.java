package com.stack;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {
    //Declaring linked list
    private LinkedList list =new LinkedList();

    //creating stack method
    public void push (Object data){
        list.addFirst(data);
    }
    //printing top element
    public Object peek(){
        return list.getFirst();
    }
    //printing the values of stack
    public  void printStack(){
        System.out.println("Stack values printed below");
        if (!list.isEmpty()){
        Iterator it =list.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+ "");
            }
        }
        System.out.println();
    }
    public static void main(String [] args){
        System.out.println("Welcome to stack Problems");
        Stack st =new Stack();

        //adding values in stack
        st.push(70);
        st.push(30);
        st.push(56);
        System.out.println("Top Element of stack: "  +st.peek());
            //total stack element
        st.printStack();
    }
}
