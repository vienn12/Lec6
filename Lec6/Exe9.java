
package Lec6;
import java.util.Scanner;
public class Exe9 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int number;
        
        System.out.println("Nhap:");
        
        while (true) {
            number = v.nextInt();
            
            if (number == 0) {
                break;
            }
            
            sum += number;
            count++;
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Trung binh cong la: " + average);
        } else {
            System.out.println("Khong co so nao de tinh trung binh.");
        }
    }
}
