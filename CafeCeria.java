package cafeceria;
import java.util.Scanner;

/**
 *
 * @author Billy Damas E41202029
 */
public class CafeCeria {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String pilihan,nama;
        
        System.out.println("        CAFE CERIA        ");
        System.out.println("      Aneka Minuman       ");
        System.out.println("__________________________");
        System.out.println("      SPECIAL MENU  :     ");
        System.out.println("     1. Soft drinks       ");
        System.out.println("     2. Mix Juice         ");
        System.out.println("     3. Nescafe           ");
        System.out.println("     4. Soda Milk         ");
        System.out.println("     5. Tea               ");
        System.out.println("__________________________");
        
        System.out.print("Masukkan Nama Pembeli : ");
        nama = sc.nextLine();
        System.out.println(" ");
        
        System.out.print("Pilih Minuman : ");
        pilihan = sc.nextLine();
        
        switch(pilihan) {
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft Drinks");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
                break;
            
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix Juice");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
                break;
                
            case "3":
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
                break;
               
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
                break;
                
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
                break;
                
            default:
                System.out.println("Yang anda masukkan tidak ada dalam pilihan!!");
        }
        
    }
    
}
