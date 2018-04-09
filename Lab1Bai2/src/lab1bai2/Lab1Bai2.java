/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai2;

import java.util.*;

/**
 *
 * @author trong
 */
public class Lab1Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        double CV = (dai + rong)*2;
        double DT = dai * rong;
        double CNN = Math.min(dai, rong);
        System.out.printf("Chu vi = %.2f\n", CV);
        System.out.printf("Diện tích = %.2f\n", DT);
        System.out.printf("Cạnh ngắn nhất = %.2f\n", CNN);
    }
    
}
