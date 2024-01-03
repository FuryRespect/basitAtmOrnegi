package com.mertalmc.atm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        //import name
        System.out.println("Adınız ?");
        name = scanner.nextLine();

        System.out.println("---------------------");
        System.out.println("* Merhaba " + name);
        System.out.println("---------------------");

        int Wallet = 100;
        int amount;
        int ATM;
        do {
            System.out.println("1. Bakiye Görüntüle \n2. Para Yatırma \n3. Para Çekme \n4. Cıkıs"); // ATM MENU
            ATM = scanner.nextInt();
            switch (ATM) {
                // see money
                case 1:
                    System.out.println("-----------" + "\nBakiyeniz: " + Wallet + "\n-----------");
                    break;
                // deposit money
                case 2:
                    System.out.println("--Para Yatır--");
                    System.out.println("Yatıralacak Miktar: ");
                    amount = scanner.nextInt();
                    Wallet += amount;
                    System.out.println("Para Yatırıldı: " + Wallet);
                    break;
                // withdraw money
                case 3:
                    System.out.println("Bakiye: " + Wallet);
                    System.out.println("Çekilecek miktarı giriniz: ");
                    amount = scanner.nextInt();
                    if (amount <= Wallet) {
                        Wallet -= amount;
                        System.out.println("Para Çekildi: " + Wallet);
                    } else if (amount > Wallet) {
                        System.out.println("Yetersiz Bakiye.");
                    }
                    break;
                case 4:
                    System.out.println("Çıkış Yapıldı");
                    break;
                default:
                    break;
            }
        } while (ATM != 4); // çıkış yapana kadar döndür
    }
}