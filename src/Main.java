import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // kullanıcıdan sayılara alacagımız bir metod.
        // yapılacak islemi sececegimiz bir metod.
        // islemler icin bir metod.
        int sayı1 = Sayı_al();
        int sayı2 = Sayı_al();
        String ıslem = Islem_sec();
        double sonuc = Islemler(sayı1,sayı2,ıslem);
        System.out.println("Sonuc = " +sonuc);
    }
    public static int Sayı_al() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        return scanner.nextInt();
    }
    public static String Islem_sec(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Islemlerden birini seciniz: +,-,*,/");
        return scanner.nextLine();
    }
    public static double Islemler(int sayı1, int sayı2, String islem){
            switch (islem) {
                case "+":
                    return sayı1 + sayı2;
                case "-":
                    return sayı1 - sayı2;
                case "*":
                    return sayı1 * sayı2;
                case "/":
                    return (double) sayı1 / sayı2;
                default:
                    System.out.println("Yanlıs bir islem sectiniz...");
                    return 8;
            }
       }
}