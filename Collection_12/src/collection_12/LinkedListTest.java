/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection_12;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Christopher Clement
 */
public class LinkedListTest {
    LinkedList<String> Colours = new LinkedList<>();
    LinkedList<Integer> Num = new LinkedList<>();
    public void test(){
        addElement("Blue", Colours);
        addElement("Blue", Colours);
        addElement("Green", Colours);
        addElement("Red", Colours);


        
        Num.add(1);
        Num.add(2);
        Num.add(3);
        Num.add(3);
        Num.add(8);
        Num.add(1);
        
        System.out.println("Stack example (FILO)");
        System.out.println("Stack: " + Colours);
        Collections.sort(Colours);
        System.out.println("Stack sorted: " + Colours);
        System.out.println("Stack size: " + Colours.size());
        
        while(!Colours.isEmpty()) {
            System.out.println(Colours.pop());
        }
        
        System.out.println("Queue example (FIFO)");
        System.out.println("Queue: " + Num);
        System.out.println("Replaced " + Num.set(4, 4) + " with 4");
        System.out.println("Stack size: " + Num.size());
        while(!Num.isEmpty()) {
            System.out.println(Num.removeFirst());
        }
    }
    
    static void addElement(String color, LinkedList<String> Colours){
        System.out.println("Inserted " + color);
        Colours.push(color);
    }
}
