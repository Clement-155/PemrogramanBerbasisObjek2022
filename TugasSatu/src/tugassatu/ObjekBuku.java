/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugassatu;
import java.lang.String;
/**
 *
 * @author Christopher Clement
 */
public class ObjekBuku extends GenreBuku{
    
    private String judul;
    private float tebalCm;
    private String warna;
    private boolean available;

    public String getJudul() {
        return judul;
    }

    public float getTebalCm() {
        return tebalCm;
    }

    public String getWarna() {
        return warna;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public ObjekBuku(String judul, String tebalCm, String warna, String genre){
        super(genre);
        this.judul = judul;
        this.tebalCm = Float.parseFloat(tebalCm);
        this.warna = warna;
        this.available = true;
    }
    
    public void BukuPinjam(String judul){
        super.bukuPinjam();
        System.out.println("Buku " + judul + " berhasil dipinjam.\nSilahkan foto struk ini dan bawa ke meja depan untuk mengambil buku.\n");
    }
    
    @Override
    public String toString(){
        return(super.toString() + '\n' + "Judul Buku : " + getJudul() + '\n' + "Ketebalan Buku (cm) : " + getTebalCm() + '\n' + "Warna Buku : " + getWarna());
    }
}
 