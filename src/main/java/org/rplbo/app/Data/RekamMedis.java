package org.rplbo.app.Data;

public class RekamMedis {
    // Attribute
    private int id;
    private String namaPasien;
    private String diagnosis;
    private String tanggal;
    private String namaDokter;


    // Constructor
    public RekamMedis(int id, String namaPasien, String diagnosis, String tanggal, String namaDokter) {
        this.id = id;
        this.namaPasien = namaPasien;
        this.diagnosis = diagnosis;
        this.tanggal = tanggal;
        this.namaDokter = namaDokter;
    }


    // Getter

    public int getId() {
        return id;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

}