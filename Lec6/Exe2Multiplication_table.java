
package Lec6;

import java.util.Scanner;
public class Exe2Multiplication_table {
    public static void main(String[] args) {
        
    
        Scanner v = new Scanner(System.in);
        
        System.out.print("Nhap mot so tu 2 den 9: ");
        int num = v.nextInt();
        
        System.out.println("Bang cuu chuong cua " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}