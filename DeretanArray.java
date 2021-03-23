package deretanarray;
import java.util.Scanner;

/**
 *
 * @author Billy Damas E41202029
 */
public class DeretanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deret;
        
        System.out.print("Masukkan Jumlah Deret : ");
        deret = sc.nextInt();
        
        int[] angka = new int[deret];
        
        for (int i = 0; i < angka.length; i++){
            angka[i] = (int)(Math.random() * 100);
            System.out.print(angka[i] + " ");
        }
        System.out.println();
    }
    
}
