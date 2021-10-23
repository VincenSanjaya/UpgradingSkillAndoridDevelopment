package com.example.tugaskaksarahh;

public class ModelMakanan {

    String nama,desc,rate;

    public ModelMakanan(String nama, String desc, String rate) {
        this.nama = nama;
        this.desc = desc;
        this.rate = rate;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
