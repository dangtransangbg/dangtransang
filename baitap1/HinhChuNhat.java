package com.sang.baitap;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Chiều Rộng");
        int ChieuRong = sc.nextInt();
        System.out.println("Nhập Chiều Dài");
        int ChieuDai = sc.nextInt();
        int DienTich = ChieuDai * ChieuRong;
        System.out.println("Diện Tích là:" + DienTich);
        int ChuVi = 2 * (ChieuDai + ChieuRong);
        System.out.println("Chu Vi là là:" + ChuVi);

    }
}
