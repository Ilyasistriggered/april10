/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author 2386636
 */
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class friendsMarks{
    String name;
    String nickName;
    int marks;
    
    public friendsMarks(String name, String nickName, int marks){
        this.name = name;
        this.nickName = nickName;
        this.marks = marks;
    }
    //getter for name
    public String getName(){
        return name;
    }
    //setter for name
    public void setName(String name){
        this.name = name;
    }
    //getter for nickName
    public String getNickName(){
        return nickName;
    }
    //setter for nickName
    public void setNickName(String nickName){
        this.nickName = nickName;
    }
    //getter for marks
    public int getMarks(){
        return marks;
    }
    //setter for marks
    public void setMarks(int marks){
        this.marks = marks;
    }
    public String toString(){
        return "friendsMarks{ "+"name="+name+'\''+", nickName="+nickName+'\''+", marks="+marks+'}';
    }
}
class nameCompare implements Comparator<friendsMarks>{
    @Override
    public int compare(friendsMarks friend1, friendsMarks friend2){
        return friend1.getName().compareTo(friend2.getName());
    }
}

class marksCompare implements Comparator<friendsMarks>{
    @Override
    public int compare(friendsMarks friend1, friendsMarks friend2){
        return friend1.getMarks().compareTo(friend2.getMarks());
    }
}

public class LinkedHashSetDemo2 {
    public static void main(String[] args){
        //Creating LinkedHashSet
        LinkedHashSet<friendsMarks> linkedHashSet = new LinkedHashSet<>();
        
        //adding elements to LinkedHashSet
        linkedHashSet.add(new friendsMarks("Raushan","Chamgader",99));
        linkedHashSet.add(new friendsMarks("Yashdeep","Dopa",95));
        linkedHashSet.add(new friendsMarks("Rupesh","Gian",92));
        linkedHashSet.add(new friendsMarks("Shishya","Gorilla",47));
        linkedHashSet.add(new friendsMarks("Sarthak","Nagin",78));
        linkedHashSet.add(new friendsMarks("Sonika","Chipkali",67));
        linkedHashSet.add(new friendsMarks("Himanshu","Lalten",57));
        
        //Creating TreeSet and we have to pass Comparator object of marksCompare class in the the TreeSet 
        //constructor so that we can sort according to the marks
        TreeSet<friendsMarks> treeSet0 = new TreeSet<>(new marksCompare());
        
        //Storing elements of LinkedHashSet into TreeSet by using method addAll()
        treeSet0.addAll(linkedHashSet);
        System.out.println("Sorting on the basis of marks");
        
        //Display using loop
        for(friendsMarks tree: treeSet0){
            System.out.println(tree);
        }
        
        //Creating TreeSet
        //and we have to pass the comparator object of nameCompare class int the TreeSet constructor
        //so that we can sort according to name
        TreeSet<friendsMarks> treeSet1 = new TreeSet<>(new nameCompare());
        
        //sorting elements of LinkdHashSet into TreeSet by using method addAll()
        treeSet1.addAll(linkedHashSet);
        
        //Display using loop
        System.out.println("\n\nSorting on the basis of name");
        for(friendsMarks tree: treeSet1){
            System.out.println(tree);
        }
        
    }
}
