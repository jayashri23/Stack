package com.stack;

import java.util.Iterator;
import java.util.LinkedList;

public class Dequeue {

    //declaring linked list
    private static LinkedList list = new LinkedList();

    //creating queue method
    public void enqueue (Object data){
        list.add(data);
    }
    public Object peek(){
        return list.getFirst();
    }
    //dequeue the top value
    public Object poll(){
        return list.poll();
    }
    //printing values of queue
    public void printQueue(){
        System.out.println("Queue values are : ");
        if (!list.isEmpty()){
            Iterator it = list.iterator();
            while (it.hasNext()){
                System.out.println(it.next()+ "");
            }
        }else {
            System.out.println("Queue is empty");
        }
        System.out.println();
    }
    public static void main(String [] args){
        Dequeue dequeue =new Dequeue();

        //adding values in stack
        dequeue.enqueue(56);
        dequeue.enqueue(30);
        dequeue.enqueue(70);
        //Printing total stack
        System.out.println("Printing Total Queue");
        dequeue.printQueue();
        while (!list.isEmpty()){
            System.out.println("Top element present in Queue is:" +dequeue.peek());
            System.out.println("Dequeue top element from Queue: " +dequeue.poll());
            dequeue.printQueue();
            System.out.println();
        }
    }
}
