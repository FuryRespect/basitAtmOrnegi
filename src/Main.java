import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Giriş seviye BASİT ATM ALGORİTMASI
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String isim;
        String tus;
        // System.out.println("deneme \ndeneme");

        System.out.println("Adınız ?");
        isim = scanner.nextLine();
        // MENU
        System.out.println("_____________________");
        System.out.println("* Merhaba " + isim);
        System.out.println("* ATM'ye Hoşgeldin");
        System.out.println("_____________________");

        // NEXT MENU
        System.out.println("İşleme devam etmek için bir tuşa tıklayın");
        tus = scanner.nextLine();
        // ATM MENUSU
        System.out.println("1. Bakiye Görüntüle \n2. Para Yatırma \n3. Para Çekme \n4. EFT - Havale İşlemleri \n5. Çıkış ");
        //System.out.println("2. Para Yatırma");
        //System.out.println("3. Para Çekme");
        //System.out.println("4. Çıkış");
        int atm = scanner.nextInt();
        // ISLEMLER
        switch (atm) {
            // bakiye gor
            case 1:
                System.out.println("Bakiye: " + bakiye);
                break;
            // PARA YATIR
            case 2:
                int miktar;
                System.out.println("--Para Yatır--");
                System.out.println("Yatıralacak Miktar: ");
                miktar = scanner.nextInt();
                bakiye += miktar;
                System.out.println("Para Yatırıldı: "+ bakiye);
                break;
            // PARA CEK
            case 3:
                System.out.println("Çekilecek miktarı giriniz: ");
                miktar = scanner.nextInt();

                if (miktar > bakiye){
                    System.out.println("Yetersiz Bakiye.");
                    return;

                }else if (miktar < bakiye){
                    System.out.println("Çekilecek miktarı giriniz: ");
                    miktar = scanner.nextInt();
                    miktar -= bakiye;
                    System.out.println("Para Çekildi: "+ bakiye);
                }

                break;
            // EFT - HAVALE
            case 4:
                System.out.println("-----BAKIMDA-----");
                break;
            // EXIT
            case 5:
                System.out.println("Çıkış Yapılıyor...");
                break;
            default:
                System.out.println("Geçersiz İşlem");
                break;
        }
    }
}