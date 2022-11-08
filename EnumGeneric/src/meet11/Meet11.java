/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meet11;

/**
 *
 * @author Christopher Clement
 */
public class Meet11 {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnumTest x = EnumTest.ID;
        EnumTest y = EnumTest.US;
        
        System.out.println(x.toString() + "\n\n" + y.toString());
        
        Integer[] intArr = {4, 5, 6};
        GenericTest gen1 = new GenericTest(intArr, "Test1", 3.456);
        System.out.println("\nGeneric Class");
        System.out.println(gen1.getTwo());
        System.out.println(gen1.getThree());
        gen1.GMTest();
        
    }
    
}
