/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author Administrator
 */
// Kelas turunan User
class User extends Pengguna {
    public User(String nama) {
        super(nama);
    }
    public void melihatDaftarBuku() {
        System.out.println("User " + ambilNama() + " melihat daftar buku.");
    }
}
