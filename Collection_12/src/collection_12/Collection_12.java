/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection_12;

import java.util.ArrayList;

/**
 *
 * @author Christopher Clement
 * 
Collection:
1. list (add, remove, add with idx)
2. set(add, contains, isempty)
3. map(add, getkey, getvalue, find value based on key)
4. Linkedlist (Queue, Stack)
5. CompareTo

 */
public class Collection_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrListTest ArrList = new ArrListTest();
        ArrList.test();
        System.out.println("---------------------------");
        SetTest setTest = new SetTest();
        setTest.test();
        System.out.println("---------------------------");
        MapTest mapTest = new MapTest();
        mapTest.test();
        System.out.println("---------------------------");
        LinkedListTest linkedTest = new LinkedListTest();
        linkedTest.test();
        System.out.println("---------------------------");
        ArrayList<String> alpha = new ArrayList();
        alpha.add("A");
        alpha.add("B");
        alpha.add("C");
        System.out.println("B compared to A = " + alpha.get(1).compareTo(alpha.get(0)));
        System.out.println("B compared to B = " + alpha.get(1).compareTo("B"));
        System.out.println("B compared to C = " + alpha.get(1).compareTo("C"));
        System.out.println("B compared to b = " + alpha.get(1).compareTo("b"));
    }
    
}
