import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayı1,sayı2;

        System.out.print("İslem yapmak icin 1.sayıyı  girin: ");
        if(scanner.hasNextInt()){ // kullanıcın tam sayı girip girmedigini kontrol ediyoruz...
            sayı1 = scanner.nextInt();
        }else {
            System.out.println("Lutfen bir tam sayı giriniz...");
            return;
        }
        System.out.print("İslem yapmak icin 2.sayıyı  girin: ");
        if(scanner.hasNextInt()){
            sayı2 = scanner.nextInt();
            System.out.println("Dogru bir deger girdiniz.");
        }else {
            System.out.println("Lutfen bir tam sayı giriniz...");
            return;
        }
        Toplama(sayı1,sayı2); 
        Cıkarma(sayı1,sayı2);
        Carpma(sayı1,sayı2);
        Bolme(sayı1,sayı2);
    }
    public static int Toplama(int a, int b){
        System.out.println("Toplama isleminin sonucu = " + (a + b));
        return a + b;
    }
    public static void Cıkarma(int c, int d){
        System.out.println("Cıkarma isleminin sonucu = " + (c - d));
    }
    public static void Carpma(int e,int f){
        System.out.println("Carpma isleminin sonucu = " + (e * f));
    }
    public static int Bolme(int g, int h) {
        if (h == 0) {
            System.out.println("Hatalı bolme islemi.Lutfen sıfırdan farklı bir sayı girin...");
        } else {
            System.out.println("Bolme isleminin sonucu = " + (g / h));
        }
        return g / h;
    }
}
