/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author Administrator
 */
// Kelas turunan Admin
class Admin extends Pengguna {
    public Admin(String nama) {
        super(nama);
    }

    public void tambahBuku() {
        System.out.println("Admin qilah " + ambilNama() + " menambahkan buku.");
    }

    public void melihatDaftarBuku() {
        System.out.println("Admin qilah" + ambilNama() + " melihat daftar buku.");
    }

    public void hapusBuku() {
        System.out.println("Admin qilah" + ambilNama() + " menghapus buku.");
    }
}
