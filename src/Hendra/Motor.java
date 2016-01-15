/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hendra;

/**
 *
 * @author User
 */
public class Motor {
    String nama;
    String warna;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
     public void tampilkanData(){
        System.out.println("nama :"+getNama());
        System.out.println("warna:"+getWarna());
        
    }
    public void inputData(String nama,String warna){
        setNama(nama);
        
        setWarna(warna);
    }
}
