/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pemrograman;

/**
 *
 * @author INI PC
 */
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        String nama;
        int kelas;
        float absen;
        double tugas;
        double nilaiuts;
        double nilaiuas;
        double hasil;
        Scanner test = new Scanner(System.in);
        
        System.out.print("NAMA: ");
        nama = test.nextLine();
        System.out.print("KELAS: ");
        kelas = test.nextInt();
        System.out.print("NO ABSEN: ");
        absen = test.nextFloat();
        System.out.print("TUGAS: ");
        tugas = test.nextDouble();
        System.out.print("NILAI UTS: ");
        nilaiuts = test.nextDouble();
        System.out.print("NILAI UAS: ");
        nilaiuas = test.nextDouble();
         
 
        hasil = (tugas * 10/100)+(nilaiuts * 30/100)+(nilaiuas * 60/100);
        System.out.println("NILAI AKHIR :"+hasil);
        
        if (hasil > 85){
            System.out.println("NILAI A ");
        }
        if (hasil < 85){
            System.out.println("NILAI B ");
        }
        if (hasil < 74){
            System.out.println("NILAI C ");
        }
        if (hasil < 50){
            System.out.println("NILAI D" );
        }
    }
}
