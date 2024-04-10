/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

import java.util.PriorityQueue;

/**
 *
 * @author 2386636
 */
public class CreatePriorityQueueExample2 {
    public static void main(String[] args){
        PriorityQueue<String> words = new PriorityQueue<>();
        
        //Add items to a Priority Queue(ENQUEUE)
        words.add("Hi");
        words.add("World");
        words.add("Elephant");
        words.add("apple");
        
        //Remove items from PriorityQueue
        while(!words.isEmpty()){
            System.out.println(words.remove());
        }
  
    }
}
