package com.stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CreateQueue {

    //declaring linked list
    private static LinkedList list = new LinkedList();

    //creating queue method
    public void enqueue(Object data) {
        list.add(data);
    }

    //printing top element
    private Object peek() {
        return list.getFirst();

    }

    //printing th values of Queue
    private void printQueue(){
        System.out.println("Queue value are printed below:");
        if (!list.isEmpty()){
            Iterator it =list.iterator();
            while (it.hasNext()){
                System.out.println(it.next()+ "");
            }
        }else {
            System.out.println("Queue is empty");
        }
        System.out.println();
    }
    public static void  main(String [] args){
        CreateQueue queue =new CreateQueue();

        //adding values in stack
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        //printing the top element
        System.out.println("Top element of Queue : " +queue.peek());
        //total stack printing
        queue.printQueue();
    }
}
