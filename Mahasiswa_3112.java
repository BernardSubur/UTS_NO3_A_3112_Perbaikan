/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3112_perbaikan;

/**
 *
 * @author ASUS
 */
public class Mahasiswa_3112 {
String nim_3112;
    String nama_3112;
    String Jurusan_3112;
    int ipk_3112;
    
    public Mahasiswa_3112(){
        
    }
    
    public Mahasiswa_3112(String nim_3112, String nama_3112, String Jurusan_3112, int ipk_3112){
        this.nim_3112 = nim_3112;
        this.nama_3112 = nama_3112;
        this.Jurusan_3112 = Jurusan_3112;
        this.ipk_3112 = ipk_3112;
    }
    
    public void tampilDataMhs(){
        System.out.println("nim : " + nim_3112);
        System.out.println("nama: " + nama_3112);
        System.out.println("Jurusan : " + Jurusan_3112);
        System.out.println("ipk : " + ipk_3112);
    }
    
}
