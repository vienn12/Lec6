
package Lec6;

import java.util.Scanner;
public class Exe1Calculate_the_Sum_of_Numbers_from_1_to_N {
    public static void main(String[] args) {
        {
        Scanner v = new Scanner(System.in);
        
        System.out.print("Nhap N: ");
        int N = v.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        
        System.out.println("Tong cac so tu 1 den " + N + " la: " + sum);
    }

    }
    
}
