/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author 2386636
 */
import java.util.*;

class Book{
    int id;
    String name, author, publisher;
    int quantity;
    
    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class LinkedHashSetDemo1 {
    public static void main(String[] args){
        LinkedHashSet<Book> hs = new LinkedHashSet<>();
        
        //Creating books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        //adding books
        hs.add(b1);
        //Traversing hash table
        for(Book b:hs){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
