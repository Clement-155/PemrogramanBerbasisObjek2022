/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet11;

/**
 *
 * @author Christopher Clement
 */

/*
Group of Constants
*/
public enum EnumTest {
    US("DOLLAR", 1),
    ID("RUPIAH", 14000);

    private final String code;
    private final int value;
    EnumTest(String code, int value){
        this.code = code;
        this.value = value;
    }
    
    @Override
    public String toString(){
        return("Currency : " + this.code + '\n' + "Value to dollar : " + this.value);
    }
}
