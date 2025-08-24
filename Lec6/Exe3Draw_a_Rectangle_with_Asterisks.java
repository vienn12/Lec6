
package Lec6;
import java.util.Scanner;
public class Exe3Draw_a_Rectangle_with_Asterisks {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        
        System.out.print("Nhap chieu cao: ");
        int h = v.nextInt();
        
        System.out.print("Nhap chieu rong: ");
        int w = v.nextInt();
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}