/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkel7;

import java.util.ArrayList;

public class Data {
    private String nik;
    private String nama;
    private String Ttl;
    private String jeniskelamin;
    private String goldarah;
    private String alamat;
    private String kelurahan;
    private String rt;
    private String agama;
    private String statusperkawinan;
    private String pekerjaan;
    private String kewarganegaraan;
    private String berlakuhingga;


    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }



    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTtl(String Ttl) {
        this.Ttl = Ttl;
    }

    public String getTtl() {
        return Ttl;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public String getGoldarah() {
        return goldarah;
    }

    public void setGoldarah(String goldarah) {
        this.goldarah = goldarah;
    }

    public void setStatusperkawinan(String statusperkawinan) {
        this.statusperkawinan = statusperkawinan;
    }

    public String getStatusperkawinan() {
        return statusperkawinan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setBerlakuhingga(String berlakuhingga) {
        this.berlakuhingga = berlakuhingga;
    }

    public String getBerlakuhingga() {
        return berlakuhingga;
    }



    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }



    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }


    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    void remove(ArrayList<Data> KelART1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
