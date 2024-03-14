
import java.util.Scanner;


public class HitungBangunDatar {
    public static void main(String[] args) {
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Bujur Sangkar");
        System.out.print("Isikan Pilihan: ");
        Scanner sc = new Scanner(System.in);
        
        int pilihan = sc.nextInt();
        
        if (pilihan==1){
            System.out.print("Isikan Panjang:  ");
            int p = sc.nextInt();
            System.out.print("Isikan Lebar:  ");
            int l = sc.nextInt();
            PersegiPanjang pp = new PersegiPanjang(p, l);
            int luas = pp.getLuas();
            int keliling = pp.getKeliling();
            
            System.out.println("Luas Persegi Adalah :" + luas);
            System.out.println("Keliling Persegi :" + keliling);
        }
        
        else if (pilihan==2){
            System.out.print("Isikan Sisi: ");
            int s = sc.nextInt();
            BujurSangkar bs = new BujurSangkar (s);
            int Luas = bs.getLuas();
            int Keliling = bs.getKeliling();
            
            System.out.println("Luas Persegi Panjang: " + Luas);
            System.out.println("Keliling Bujur Sangkar: " + Keliling);
        }
    }
}
