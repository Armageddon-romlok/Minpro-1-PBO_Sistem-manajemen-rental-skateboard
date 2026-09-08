/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minpro_1;

/**
 *
 * @author mrris
 */
public class Skateboard {
    private String idSkateboard;
    private String merk;
    private String jenis; 

    public Skateboard(String idSkateboard, String merk, String jenis) {
        this.idSkateboard = idSkateboard;
        this.merk = merk;
        this.jenis = jenis;
    }

    public String getIdSkateboard() { return idSkateboard; }
    public String getMerk() { return merk; }
    public String getJenis() { return jenis; }
}
