
package Lec6;
import java.util.Scanner;
public class Exe5 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        
        System.out.print("Nhap: ");
        int N = v.nextInt();
        
        if (N < 0) {
            System.out.println("Khong phai la so khong am.");
        } else {
            int f = 1;
            for (int i = N; i >= 1; i--) {
                f *= i;
            }
            
            System.out.println("Giai thua cua " + N + " la: " + f);
        }
    }
}
