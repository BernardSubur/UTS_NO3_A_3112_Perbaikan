/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3112_perbaikan;

/**
 *
 * @author ASUS
 */
public class StudentStaff_3112 extends Mahasiswa_3112 implements iPendapatan_3112 {
int unitKerja_3112;
    int jamKerja_3112;
    double totalPendapatan_3112;

    public StudentStaff_3112() {

    }

    public StudentStaff_3112(String nim, String nama, String Jurusan, int ipk,
            int unitKerja, int jamKerja) {
        super(nim, nama, Jurusan, ipk);
        this.unitKerja_3112 = unitKerja_3112;
        this.jamKerja_3112 = jamKerja_3112;
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infostuden();
    }
    
    public void infostuden(){
        System.out.println("unitKerja : " + unitKerja_3112);
        System.out.println("jamKerja : " + jamKerja_3112);
    }

    @Override
    public double totalPendapatan_3112() {
        return totalPendapatan_3112 = (int) (jamKerja_3112 * 30000);
    }    
}
