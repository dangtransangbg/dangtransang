package com.sang.baitap4;
import java.util.Scanner;
public class Account {
    Scanner sc = new Scanner(System.in);
    private long SoTaiKhoan;
    private String TenTaiKhoan;
    private double SoTienTK;
    private int MenhGia;
    private double LaiXuat = 0.035;
    public Account() {
        this.SoTaiKhoan=0;
        this.SoTienTK = 50 ;
        this.TenTaiKhoan = null;
        this.MenhGia=0;
    }
    public Account(String TenTaiKhoan,long SoTaiKhoan){
        this.TenTaiKhoan = TenTaiKhoan;
        this.SoTaiKhoan = SoTaiKhoan;
    }
    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }
    public long getSoTaiKhoan() {
        return SoTaiKhoan;
    }
    public double getSoTienTrongTK() {
        return SoTienTK;
    }
    public void setTenTaiKhoan(String TenTaiKhoan) {
        this.TenTaiKhoan= TenTaiKhoan;
    }
    public void setSoTaiKhoan(long SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }
    public void setSoTienTK(double SoTienTK) {
        this.SoTienTK = SoTienTK;
    }
    public double napTienVaoTK(double soTienNap){
        System.out.println("Nhap so tien can nap");
        soTienNap = sc.nextInt();
        System.out.print("So tien hien tai trong tai khoan la");
        return this.SoTienTK+soTienNap;
    }
    public  double rutTien(double soTienRut){
        System.out.println("Nhap so tien muon rut \nChu y phi giao dich la 0.005VND");
        soTienRut = sc.nextDouble();
        System.out.print("So tien hien tai trong tai khoan la");
        return this.SoTienTK-soTienRut-0.005;
    }
    public void daoHan(){
        this.SoTienTK =this.SoTienTK+ this.SoTienTK*LaiXuat;
    }
    public void taoTaiKhoan(){
        System.out.println("Nhap ten TK");
        this.TenTaiKhoan = sc.nextLine();
        System.out.println("Nhap so TK");
        this.SoTaiKhoan = sc.nextLong();
    }
    public static void main(String[] args) {
        Account account=new Account();
        account.taoTaiKhoan();
        account.napTienVaoTK(5000);


    }
}
