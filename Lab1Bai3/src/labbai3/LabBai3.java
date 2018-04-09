/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labbai3;

import java.util.*;

/**
 *
 * @author trong
 */
public class LabBai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập dài độ dài cạnh: ");
        double canh = scanner.nextDouble();
        double TT = Math.pow(canh, 3);
        System.out.printf("Thể tích hình lập phương = %.2f\n", TT);
    }
    
}
