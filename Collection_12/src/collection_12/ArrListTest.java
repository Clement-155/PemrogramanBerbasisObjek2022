/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection_12;

import java.util.ArrayList;

/**
 *
 * @author Christopher Clement
 */
public class ArrListTest {
    private ArrayList<String> arrList = new ArrayList();
    //ArrayList<*nama object*> *namaArrList* = new ArrayList();
    
    public void test(){
        arrList.add("This");
        arrList.add("is");
        arrList.add("an");
        arrList.add("Array List");
        for (String i : arrList) {
            System.out.println(i);
        }
        System.out.println("\nMengganti salah satu substring\n");
        arrList.remove(1);
        arrList.add(1, "I'm new!");
        for (String i : arrList) {
            System.out.println(i);
        }
        
    }
    
    
}
