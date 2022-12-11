/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_a_3112_perbaikan;

/**
 *
 * @author ASUS
 */
public class UTS_NO3_A_3112_Perbaikan {
    public static void main(String[] args) {
     AsPrak_3112 A = new AsPrak_3112("21121", "Bernard", "Sistem Informasi", 3, "PBO", 12);
        A.tampilDataMhs();
        System.out.println("Total : " + A.totalPendapatan_3112());
        System.out.println("");

        StudentStaff_3112 B = new StudentStaff_3112("121212", "Andi", "Sistem Informasi", 4, 2, 8);
        B.tampilDataMhs();
        System.out.println("Total : " + B.totalPendapatan_3112());
        System.out.println("");
    }
}
