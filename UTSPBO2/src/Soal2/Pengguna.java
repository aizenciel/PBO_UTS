/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author Administrator
 */
// Kelas abstrak untuk pengguna
abstract class Pengguna {
    private String nama;

    public Pengguna(String nama) {
        this.nama = nama;
    }

    public String ambilNama() {
        return nama;
    }

    public abstract void melihatDaftarBuku();
}
