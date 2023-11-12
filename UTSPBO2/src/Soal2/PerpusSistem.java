/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal2;

/**
 *
 * @author Administrator
 */
// Kelas utama sebagai driver program
// gdpt pencerahan kalo gapake array, jadi yasudahlah.
public class PerpusSistem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek buku
        Buku buku1 = new Buku("One Piece", "Fantasy");
        Buku buku2 = new Buku("Attack On Titan", "Fiction");

        // Membuat objek user
        Pengguna user = new User("Aizen");

        // Melihat daftar buku oleh user
        user.melihatDaftarBuku();

        // Membuat objek admin
        Pengguna admin = new Admin(""); 

        // Menambahkan buku oleh admin
        ((Admin) admin).tambahBuku();

        // Melihat daftar buku oleh admin
        admin.melihatDaftarBuku();

        // Menghapus buku oleh admin
        ((Admin) admin).hapusBuku();
    }
}
    
    

