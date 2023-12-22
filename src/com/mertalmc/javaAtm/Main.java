package com.mertalmc.javaAtm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        String name;
        short Password = 1234;

        // user input menu
        System.out.println("Adınız ?");
        name = scanner.nextLine();
        System.out.println("Kart şifresi: ");
        Password = scanner.nextShort();
        System.out.println("_____________________");
        System.out.println("* Merhaba " + name);
        System.out.println("* ATM'ye Hoşgeldin");
        System.out.println("_____________________");

        // ATM MENU
        System.out.println("1. Bakiye Görüntüle \n2. Para Yatırma \n3. Para Çekme \n4. EFT - Havale İşlemleri \n5. Çıkış ");
        int atm = scanner.nextInt();

        // procces
        switch (atm) {
            //wallet balance
            case 1:
                System.out.println("Bakiye: " + balance);
                return;
            // deposit money
            case 2:
                int amount;
                System.out.println("--Para Yatır--");
                System.out.println("Yatıralacak Miktar: ");
                amount = scanner.nextInt();
                balance += amount;
                System.out.println("Para Yatırıldı: " + balance);
                break;
            // withdraw money
            case 3:
                System.out.println("Çekilecek miktarı giriniz: ");
                amount = scanner.nextInt();
                if (amount > balance) {
                    System.out.println("Yetersiz Bakiye.");
                    return;
                } else if (amount < balance) {
                    System.out.println("Çekilecek miktarı giriniz: ");
                    amount = scanner.nextInt();
                    amount -= balance;
                    System.out.println("Para Çekildi: " + balance);
                }
                break;
            case 4:
                System.out.println("-----BAKIMDA-----");
                break;
            case 5:
                System.out.println("Çıkış Yapılıyor...");
                break;
            default:
                System.out.println("Geçersiz İşlem");
                break;
        }
    }
}