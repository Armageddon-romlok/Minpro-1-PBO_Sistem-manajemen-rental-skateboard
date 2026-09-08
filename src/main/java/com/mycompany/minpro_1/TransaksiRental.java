/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minpro_1;

/**
 *
 * @author mrris
 */
public class TransaksiRental {
    private String idTransaksi;
    private Penyewa penyewa;
    private Skateboard skateboard;
    private int lamaSewa;
    private double hargaPerHari;

    public TransaksiRental(String idTransaksi, Penyewa penyewa, Skateboard skateboard, int lamaSewa, double hargaPerHari) {
        this.idTransaksi = idTransaksi;
        this.penyewa = penyewa;
        this.skateboard = skateboard;
        this.lamaSewa = lamaSewa;
        this.hargaPerHari = hargaPerHari;
    }

    public String getIdTransaksi() { return idTransaksi; }
    public Penyewa getPenyewa() { return penyewa; }
    public Skateboard getSkateboard() { return skateboard; }
    public int getLamaSewa() { return lamaSewa; }
    
    public void setLamaSewa(int lamaSewa) { this.lamaSewa = lamaSewa; }

    public double getTotalHarga() { return lamaSewa * hargaPerHari; }
}