/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal1;

import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class MamaliaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String pilihan = scan.nextLine().toLowerCase();

        Hewan hewan;

        if (pilihan.equals("kucing")) {
            hewan = new Kucing();
        } else if (pilihan.equals("anjing")) {
            hewan = new Anjing();
        } else {
            System.out.println("Hewan yang Anda pilih bukan mamalia.");
            return;
        }

        System.out.println("Hewan yang Anda pilih adalah " + pilihan + ".");
        System.out.print("Suara " + pilihan + ": ");
        hewan.bersuara();

        if (hewan.apakahMamalia()) {
            System.out.println(pilihan + " adalah mamalia.");
        } 
    }
}
    
    

