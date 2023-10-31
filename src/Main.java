import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        String name;
        String key;

        System.out.println("Adınız ?");
        name = scanner.nextLine();
        // MENU
        System.out.println("_____________________");
        System.out.println("* Merhaba " + name);
        System.out.println("* ATM'ye Hoşgeldin");
        System.out.println("_____________________");

        // NEXT MENU
        //System.out.println("İşleme devam etmek için bir tuşa tıklayın");
        // key = scanner.nextLine();

        // ATM MENU
        System.out.println("1. Bakiye Görüntüle \n2. Para Yatırma \n3. Para Çekme \n4. EFT - Havale İşlemleri \n5. Çıkış ");
        //System.out.println("2. Para Yatırma");
        //System.out.println("3. Para Çekme");
        //System.out.println("4. Çıkış");

        int atm = scanner.nextInt();
        // procces
        switch (atm) {
            //wallet balance
            case 1:
                System.out.println("Bakiye: " + balance);
                break;
            // deposit money
            case 2:
                int amount;
                System.out.println("--Para Yatır--");
                System.out.println("Yatıralacak Miktar: ");
                amount = scanner.nextInt();
                balance += amount;
                System.out.println("Para Yatırıldı: "+ balance);
                break;
            // withdraw money
            case 3:
                System.out.println("Çekilecek miktarı giriniz: ");
                amount = scanner.nextInt();

                if (amount > balance){
                    System.out.println("Yetersiz Bakiye.");
                    return;

                }else if (amount < balance){
                    System.out.println("Çekilecek miktarı giriniz: ");
                    amount = scanner.nextInt();
                    amount -= balance;
                    System.out.println("Para Çekildi: "+ balance);
                }

                break;
            // remittance transfer
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