/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author Administrator
 */
// Kelas buku
class Buku {
    private String judul;
    private String genre;

    public Buku(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }
}