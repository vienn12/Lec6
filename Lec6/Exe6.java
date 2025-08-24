
package Lec6;

import java.util.Scanner;
public class Exe6 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen: ");
        int number = v.nextInt();
        
        int sum = 0;
        while (number > 0) {
            sum += number % 10; 
            number /= 10;      
        }
        
        System.out.println("Tong cac chu so la: " + sum);
    }
}