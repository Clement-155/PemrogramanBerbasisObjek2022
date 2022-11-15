/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection_12;

import java.util.HashMap;


/**
 *
 * @author Christopher Clement
 */
public class MapTest {
    HashMap<Integer, String> mapID = new HashMap<>();
    
    public void test(){
        addElement(1, "London", mapID);
        addElement(2, "Paris", mapID);
        addElement(3, "New York", mapID);
        addElement(4, "Moscow", mapID);
        
        for (HashMap.Entry<Integer, String> pair : mapID.entrySet()) {
            System.out.println(String.format("City id is: %s, City name is : %s", pair.getKey(), pair.getValue()));   
        }
        
        System.out.println("Key number 2 contains the city " + "\"" + mapID.get(2) +"\"");

    }
    
    static void addElement(Integer id, String name, HashMap<Integer, String> mapID){
        mapID.put(id, name);
    }
}
