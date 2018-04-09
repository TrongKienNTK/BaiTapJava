/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai4;

import java.util.*;

/**
 *
 * @author trong
 */
public class Lab1Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        if(a == 0){
            double nghiem1 = -c/b;
            System.out.printf("Nghiệm của phương trình là x = %.2f\n", nghiem1);
        }
        else{
            double delta = Math.pow(b, 2) - 4*a*c;
            double sqrtDelta = Math.sqrt(delta);
            if(delta < 0){
                System.out.print("Phương trình vô nghiệm!\n");
            }
            if(delta == 0){
                double x = -b/(2*a);
                System.out.printf("Nghiệm của phương trình x = %.2f\n", x);
            }
            if(delta > 0){
                double x1 = (-b + sqrtDelta)/2*a;
                double x2 = (b + sqrtDelta)/2*a;
                System.out.printf("Nghiệm của phương trình là x1 = %.2f và x2 = %.2f\n", x1, x2);
            }
        }

        
    }
    
}
