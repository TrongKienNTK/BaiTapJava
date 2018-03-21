/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai1;

import java.util.*;

/**
 *
 * @author trong
 */
public class Lab1Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Hoten = null;
        double Diem;
        System.out.print("Nhập Họ Tên: ");
        Hoten = scanner.nextLine();
        System.out.print("Nhập Điểm: ");
        Diem = scanner.nextDouble();
        System.out.printf("%s %.2f điểm\n", Hoten, Diem);
    }

}
