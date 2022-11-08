/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet11;

/**
 *
 * @author Christopher Clement
 * @param <T1>
 * @param <T2>
 * @param <T3>
 */
/*
DATA TYPES can be set during instantiation
public class GenericTest<TYPE>
CAN DO multiple datatypes :
public class GenericTest<T1, T2, T3>
*/
public class GenericTest<T1, T2, T3> {

    private T1 one[];
    private T2 two;
    private T3 three;
    
    /**
     * @return the two
     */
    public T2 getTwo() {
        return two;
    }

    /**
     * @param two the two to set
     */
    public void setTwo(T2 two) {
        this.two = two;
    }

    /**
     * @return the three
     */
    public T3 getThree() {
        return three;
    }
    
    GenericTest(T1 one[] , T2 two, T3 three){
        this.one = one;
        this.two = two;
        this.three = three;
    }

    /**
     * @param three the three to set
     */
    public void setThree(T3 three) {
        this.three = three;
    }



    
    public void GMTest(){
        System.out.println("\nTesting Generic Method");
        GenericMethod(this.one);
    }
    /*
    GENERIC METHOD
    */
    public <V> void GenericMethod(V[] a){
        for(V x : a){
            System.out.println(x);
        }
    }
    
}
