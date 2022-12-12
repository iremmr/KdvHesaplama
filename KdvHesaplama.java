import java.util.Scanner;

public class KdvHesaplama {
   public static void main (String[] args){

       double tutar,kdvOran1 = 0.18,kdvOran2 = 0.08,kdvTutar,kdvliTutar;

       Scanner input = new Scanner(System.in);

       System.out.print("Lütfen ücret tutarını giriniz: ");
       tutar = input.nextDouble();

       kdvTutar = tutar<1000 ? kdvOran1 * tutar : kdvOran2 * tutar;
       kdvliTutar = tutar + kdvTutar;
       System.out.println("KDV'siz tutar: " + tutar);
       System.out.println(tutar<1000 ? "KDV oranı: 0.18" : "KDV oranı: 0.08");
       System.out.println("KDV tutarı: " + kdvTutar);
       System.out.println("KDV'li tutar: " + kdvliTutar);

   }
}
