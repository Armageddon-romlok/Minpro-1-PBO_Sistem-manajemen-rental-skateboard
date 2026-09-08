/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minpro_1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jane
 */
public class Main {
    public static void main(String[] args) {
        // Menerapkan ArrayList
        ArrayList<TransaksiRental> daftarTransaksi = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean jalan = true;

        // Menerapkan perulangan agar program tidak berhenti kecuali memilih keluar
        while (jalan) {
            System.out.println("\n=== SISTEM MANAJEMEN RENTAL SKATEBOARD ===");
            System.out.println("1. Tambah Data Rental (Create)");
            System.out.println("2. Tampilkan Data Rental (Read)");
            System.out.println("3. Update Lama Sewa (Update)");
            System.out.println("4. Hapus Data Rental (Delete)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            
            // Pemilihan menu dilakukan dengan inputan
            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan sisa newline

            // Menerapkan percabangan untuk memilih menu
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- TAMBAH DATA RENTAL ---");
                    System.out.print("ID Transaksi: ");
                    String idTrx = input.nextLine();
                    
                    System.out.print("No Identitas Penyewa (KTP/KTM): ");
                    String noKtp = input.nextLine();
                    System.out.print("Nama Penyewa: ");
                    String nama = input.nextLine();
                    System.out.print("No HP Penyewa: ");
                    String hp = input.nextLine();
                    Penyewa penyewa = new Penyewa(noKtp, nama, hp);
                    
                    System.out.print("ID Skateboard: ");
                    String idSkate = input.nextLine();
                    System.out.print("Merk Skateboard (cth: Element/Plan B): ");
                    String merk = input.nextLine();
                    System.out.print("Jenis Skateboard (cth: Street/Cruiser): ");
                    String jenis = input.nextLine();
                    Skateboard skateboard = new Skateboard(idSkate, merk, jenis);
                    
                    System.out.print("Lama Sewa (hari): ");
                    int lama = input.nextInt();
                    System.out.print("Harga Sewa per Hari (Rp): ");
                    double harga = input.nextDouble();
                    
                    TransaksiRental transaksiBaru = new TransaksiRental(idTrx, penyewa, skateboard, lama, harga);
                    daftarTransaksi.add(transaksiBaru);
                    System.out.println("Data rental berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n--- DAFTAR RENTAL SKATEBOARD ---");
                    if (daftarTransaksi.isEmpty()) {
                        System.out.println("Belum ada data rental.");
                    } else {
                        // Menerapkan perulangan untuk menampilkan data
                        for (TransaksiRental t : daftarTransaksi) {
                            System.out.println("ID Transaksi : " + t.getIdTransaksi());
                            System.out.println("Penyewa      : " + t.getPenyewa().getNamaPenyewa() + " (" + t.getPenyewa().getNoHp() + ")");
                            System.out.println("Skateboard   : " + t.getSkateboard().getMerk() + " - " + t.getSkateboard().getJenis());
                            System.out.println("Lama Sewa    : " + t.getLamaSewa() + " hari");
                            System.out.println("Total Bayar  : Rp " + t.getTotalHarga());
                            System.out.println("--------------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- UPDATE DATA RENTAL ---");
                    System.out.print("Masukkan ID Transaksi yang ingin diupdate: ");
                    String idUpdate = input.nextLine();
                    boolean ditemukanUpdate = false;
                    
                    for (TransaksiRental t : daftarTransaksi) {
                        if (t.getIdTransaksi().equalsIgnoreCase(idUpdate)) {
                            System.out.print("Masukkan Lama Sewa Baru (hari): ");
                            int lamaBaru = input.nextInt();
                            t.setLamaSewa(lamaBaru);
                            System.out.println("Data lama sewa berhasil diupdate!");
                            ditemukanUpdate = true;
                            break;
                        }
                    }
                    if (!ditemukanUpdate) {
                        System.out.println("ID Transaksi tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- HAPUS DATA RENTAL ---");
                    System.out.print("Masukkan ID Transaksi yang ingin dihapus: ");
                    String idHapus = input.nextLine();
                    boolean ditemukanHapus = false;
                    
                    for (int i = 0; i < daftarTransaksi.size(); i++) {
                        if (daftarTransaksi.get(i).getIdTransaksi().equalsIgnoreCase(idHapus)) {
                            daftarTransaksi.remove(i);
                            System.out.println("Data rental berhasil dihapus!");
                            ditemukanHapus = true;
                            break;
                        }
                    }
                    if (!ditemukanHapus) {
                        System.out.println("ID Transaksi tidak ditemukan.");
                    }
                    break;

                case 5:
                    jalan = false;
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        }
        input.close();
    }
}