/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugassatu;


/**
 *
 * @author Christopher Clement
 */
public class GenreBuku {
    
    private String namaGenre;
    public int jumlah = 0;
    
    public GenreBuku(String namaGenre){
        this.namaGenre = namaGenre;
        this.jumlah++;
    }
    
    public void bukuPinjam(){
        jumlah--;
    }
    
    public String getNamaGenre(){
        return namaGenre;
    }
    
    @Override
    public String toString(){
        return("Nama Genre : " + getNamaGenre() + '\n' + "Jumlah Buku Siap Pinjam : " + jumlah + '\n' + '\n');
    }
}
