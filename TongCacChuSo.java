
package tongcacchuso;
import java.util.Scanner;



public class TongCacChuSo {

     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int n = scanner.nextInt();
        int sum = 0;

        while (n != 0) {
            sum += n % 10; 
            n /= 10;
        }
        System.out.println("Tong cac chu so: " +sum);
        
    }
    
}
