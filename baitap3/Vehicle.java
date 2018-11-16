package com.sang.baitap3;
import java.util.Scanner;
import java.lang.String;
public class Vehicle {
    private String TenChuXe;
    private String LoaiXe;
    private int DungTich;
    private int GiaTriXe;
    private double Thue;

    public Vehicle(){
        this.TenChuXe = "";
        this.LoaiXe = "";
        this.DungTich = 1;
        this.GiaTriXe =1;
        this.Thue = 1;
    }
    Scanner sc = new Scanner(System.in);
    public void nhapThongTin(){
        System.out.println("nhập Tên Chủ Xe");
        this.TenChuXe = sc.nextLine();
        System.out.println("Nhập Loại Xe");
        this.LoaiXe = sc.nextLine();
        System.out.println("Nhập Dung Tích");
        this.DungTich = sc.nextInt();
        System.out.println("Nhập Giá trị Xe");
        this.GiaTriXe = sc.nextInt();
    }
    public double TinhThue(){
        if(this.DungTich < 100){
            this.Thue = this.GiaTriXe*(1/100);
        }
        if(this.DungTich>=100&&this.DungTich<200){
            this.Thue = this.GiaTriXe*(3/100);
        }
        if(this.DungTich>=200){
            this.Thue = this.GiaTriXe*(5/100);
        }
        return this.Thue;
    }
    public void xuatThongTin(){
        System.out.println("%s Tên Xe" + TenChuXe);
        System.out.println("%s Loai Xe" + LoaiXe);
        System.out.println("%d Dung Tích" +DungTich);
        System.out.println("%d Giá Trị Xe" + GiaTriXe);
        System.out.println("%f Thue" + Thue);
    }

    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.nhapThongTin();
        vehicle.xuatThongTin();

    }
}
