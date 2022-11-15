/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection_12;

import java.util.HashSet;


/**
 *
 * @author Christopher Clement
 */
public class SetTest {
    private HashSet<Integer> setEx = new HashSet<>();
    
    public void test(){
        setEx.add(1);
        setEx.add(3);
        setEx.add(5);
        setEx.add(7);
        setEx.add(7); //Can't add duplicates
        
        System.out.println("List :");
        for(int i = 0; i <= 8; i++){
            System.out.println("Number " + i + " = " + setEx.contains(i));
            if(setEx.contains(i)){
                System.out.println("Number " + i +" is removed!");
                setEx.remove(i);
            }
        }
        if(setEx.isEmpty()) System.out.println("List is now empty");
    }
}
 