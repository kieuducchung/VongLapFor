
package songuyento;


public class SoNguyenTo {

    
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to tu 1->100: ");

        for (int i = 2; i <= 100; i++) {
            boolean NguyenTo = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    NguyenTo = false; 
                    break;
                }
            }

            if (NguyenTo) {
                System.out.print(i + " "); 
            }
        }
        
    }
    
}
