package com.stack;

import java.util.Iterator;
import java.util.LinkedList;

public class PeekAndPop {
    //declaring linked list
    private static LinkedList list= new LinkedList();

    //creating stack method
    public void push (Object data){
        list.addFirst(data);
    }
    //printing top element
    private Object peek(){
        return list.getFirst();
    }
    //removing top element
    public Object pop(){
        return list.removeFirst();
    }
    //printing the value of stack
    public void printStack(){
        System.out.println("Stack value Below:");
        if (!list.isEmpty()){
            Iterator it =list.iterator();
            while (it.hasNext()){
                System.out.println(it.next()+ "");
            }
        }
        else {
            System.out.println("List is empty");
        }
        System.out.println();
    }
    public static void main(String[] args){
        PeekAndPop st = new PeekAndPop();
          //adding values in stack
        st.push(70);
        st.push(30);
        st.push(56);
        //Printing top element and remove it from stack till it is empty
        while (!list.isEmpty()){
            System.out.println("Top element present in stack is:" +st.peek());
            System.out.println("Removing top element from stack : " +st.pop());
            System.out.println("Printing the stack");
            st.printStack();
            System.out.println();
            }
        }
    }