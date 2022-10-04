/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugassatu;

import java.util.Scanner;

/*


 */
public class TugasSatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenreBuku sejarah = new GenreBuku("Sejarah");
        GenreBuku fiksi = new GenreBuku("Fiksi");
        GenreBuku sains = new GenreBuku("Sains");
        GenreBuku kamus = new GenreBuku("Kamus");
        
        ObjekBuku testBook1 = new ObjekBuku("Sejarah Majapahit", "10", "Coklat", "Sejarah");
        ObjekBuku testBook2 = new ObjekBuku("Bulan", "6", "Biru", "Fiksi");
        ObjekBuku testBook3 = new ObjekBuku("IPA", "7", "Coklat", "Sains");
        ObjekBuku testBook4 = new ObjekBuku("English Dictionary", "12", "Coklat", "Kamus");
        
        
    }
    
}
