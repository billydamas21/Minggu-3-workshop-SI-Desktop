package kharismaagungplaza;
import java.util.Scanner;
/**
 *
 * @author Billy Damas E41202029
 */
public class KharismaAgungPlaza {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String pembeli;
        int barang1,barang2,barang3,barang4,barang5;
        int total_harga;
        
        System.out.println("__________________________________________________________");
        System.out.println("                 Kharisma Agung Plaza <KAP>               ");
        System.out.println("                  Promo Belanja Berhadiah                 ");
        System.out.println("             Khusus Pembelian 5 Barang Pertama            ");
        System.out.println("             Dengan Harga Minimum Rp 10.000,00            ");
        System.out.println("__________________________________________________________");
        
        System.out.print("Masukkan Nama Pembeli : ");
        pembeli = sc.nextLine();
        
        System.out.print("Barang ke - 1 : ");
        barang1 = sc.nextInt();
        System.out.print("Barang ke - 2 : ");
        barang2 = sc.nextInt();
        System.out.print("Barang ke - 3 : ");
        barang3 = sc.nextInt();
        System.out.print("Barang ke - 4 : ");
        barang4 = sc.nextInt();
        System.out.print("Barang ke - 5 : ");
        barang5 = sc.nextInt();
        
        total_harga = barang1 + barang2 + barang3 + barang4 + barang5;
        
        System.out.println("Total Pembelian atas Nama " + pembeli +" adalah " + total_harga);
        
        if (total_harga >= 10000){
            System.out.println("Selamat...");
            System.out.println("Anda mendapat hadiah 1 buah Mug cantik");
            System.out.println("__________________________________________________________");
            System.out.println("                      Terima Kasih                        ");
            System.out.println("        Anda Sudah belanja di Kharisma Agung Plaza        ");
        }
        else {
            System.out.println("__________________________________________________________");
            System.out.println("                      Terima Kasih                        ");
            System.out.println("        Anda Sudah belanja di Kharisma Agung Plaza        ");
        }
    }
    
}
