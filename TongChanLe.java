
package tongchanle;


public class TongChanLe {
    

   
    public static void main(String[] args) {
        int TongChan = 0;
        int TongLe = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                TongChan = TongChan + i;
            } else {
                TongLe = TongLe + i;
            }
        }

        System.out.println("Tong cac so chan tu 1->100: " + TongChan);
        System.out.println("Tong cac so le từ 1->100: " + TongLe);
    }
    
}
