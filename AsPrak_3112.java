/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3112_perbaikan;

/**
 *
 * @author ASUS
 */
public class AsPrak_3112 extends Mahasiswa_3112 implements iPendapatan_3112 {
  String MKasistensi_3112;
    int jmlhPertemuan_3112;
    double totalPendapatan_3112;

    public AsPrak_3112(){
        
    }
    
    public AsPrak_3112(String nim, String nama, String Jurusan, int ipk, 
            String MKasistensi, int jmlhPertemuan){
        super(nim,nama,Jurusan,ipk);
        this.MKasistensi_3112 = MKasistensi_3112;
        this.jmlhPertemuan_3112 = jmlhPertemuan_3112;
        
    }
    
    public void infoAsprak(){
        System.out.println("MKasistensi : " + MKasistensi_3112);
        System.out.println("jmlhPertemuan : " + jmlhPertemuan_3112);
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infoAsprak();
    }
    
    public double totalPendapatan_3112(){
        return totalPendapatan_3112 = (double) (jmlhPertemuan_3112 * 50000);
    }    
}
