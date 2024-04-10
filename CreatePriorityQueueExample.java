/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author 2386636
 */
import java.util.PriorityQueue;
public class CreatePriorityQueueExample {
    public static void main(String[] args){
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        
        //Add items to a Priority Queue(ENQUEUE)
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);
        
        //Remove items from PriorityQueue
        while(!numbers.isEmpty()){
            System.out.println(numbers.remove());
        }
        
        
        
    }
}
