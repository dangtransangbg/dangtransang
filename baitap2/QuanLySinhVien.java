package com.sang.baitap2;
public class QuanLySinhVien {
    private int MaSinhVien;
    private char HoTen;
    private double DiemLT;
    private double DiemTH;
    public QuanLySinhVien(){
        this.MaSinhVien = 1;
        this.HoTen = 1;
        this.DiemLT = 1;
        this.DiemTH = 1;
    }
    public int getMaSinhVien(){
        return MaSinhVien;
    }
    public void setMaSinhVien(int MaSinhVien){
        this.MaSinhVien = MaSinhVien;
    }
    public char getHoTen(){
        return HoTen;
    }
    public void setHoTen(char HoTen){
        this.HoTen = HoTen;
    }
    public double getDiemLT(){
        return DiemLT;
    }
    public void setDiemLT(double DiemLT){
        this.DiemLT = DiemLT;
    }
    public double getDiemTH(){
        return DiemTH;
    }
    public void setDiemTH(double DiemTH){
        this.DiemTH = DiemTH;
    }
    public double DiemTB(){
        double tb = (DiemLT+DiemTH)/2;
        return tb;
    }
    public static void main(String[] args){
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
        System.out.println(quanLySinhVien.getMaSinhVien());
        System.out.println(quanLySinhVien.getHoTen());
        System.out.println(quanLySinhVien.getDiemLT());
        System.out.println(quanLySinhVien.getDiemLT());
    }
}
