import java.util.Enumeration;
import java.util.Scanner;
public class enBuyukVeEnKucukSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k=0,max=1,min=1,esittir=0;
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        n = input.nextInt();
        int sayac = 0;
        for (int i = 1;i<=n;i++) {
                k=i;
                System.out.print(k+".Sayıyı Giriniz: ");
                k = input.nextInt();
                sayac++;
                if(i==1) {
                    max = k;
                    min = k;
                }
                if(k>max) {
                    max = k;
                }
                if(k<min) {
                    min = k;
                }

            }

        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);



    }
}

