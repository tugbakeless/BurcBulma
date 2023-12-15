import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int ay;
        do {
            System.out.println("Lutfen dogdugunuz ayi sayisal olarak giriniz.");
            ay = inp.nextInt();

            if (ay < 1 || ay > 12) {
                System.out.println("Lutfen gecerli bir ay giriniz.");
            } else {
                break;
            }
        } while (true);
        int gun;
        do {
            System.out.println("Lutfen dogdunuz gunu giriniz.");
            gun = inp.nextInt();

            if (gun < 1 || gun > 31) {
                System.out.println("Lutfen gecerli bir gun giriniz.");
            } else {
                break;
            }
        } while (true);

        BurcBulma(ay, gun);


    }

    public static void BurcBulma(int a, int b) {
        switch (a) {
            case 1:
                if (1 <= b && b <= 21) {
                    System.out.println("Burcunuz Oglak");
                } else {
                    System.out.println("Burcunuz Kova");
                }
                break;
            case 2:
                if (1 <= b && b <= 19) {
                    System.out.println("Burcunuz Kova");
                } else {
                    System.out.println("Burcunuz Balik");
                }

                break;

            case 3:
                if (1 <= b && b <= 20) {
                    System.out.println("Burcunuz Balik");
                } else {
                    System.out.println("Burcunuz Koc");
                }
                break;
            case 4:
                if (1 <= b && b <= 20) {
                    System.out.println("Burcunuz Koc");
                } else {
                    System.out.println("Burcunuz Boga");
                }
                break;
            case 5:
                if (1 <= b && b <= 21) {
                    System.out.println("Burcunuz Boga");
                } else {
                    System.out.println("Burcunuz Ikizler");
                }
                break;
            case 6:
                if (1 <= b && b <= 22) {
                    System.out.println("Burcunuz Ikizler");
                } else {
                    System.out.println("Burcunuz Yengec");
                }
                break;
            case 7:
                if (1 <= b && b <= 22) {
                    System.out.println("Burcunuz Yengec");
                } else {
                    System.out.println("Burcunuz Aslan");
                }
                break;
            case 8:
                if (1 <= b && b <= 23) {
                    System.out.println("Burcunuz Aslan");
                } else {
                    System.out.println("Burcunuz Basak");
                }
                break;
            case 9:
                if (1 <= b && b <= 23) {
                    System.out.println("Burcunuz Basak");
                } else {
                    System.out.println("Burcunuz Terazi");
                }
                break;
            case 10:
                if (1 <= b && b <= 23) {
                    System.out.println("Burcunuz Terazi");
                } else {
                    System.out.println("Burcunuz Akrep");
                }
                break;
            case 11:
                if (1 <= b && b <= 23) {
                    System.out.println("Burcunuz Akrep");
                } else {
                    System.out.println("Burcunuz Yay");
                }
                break;
            case 12:
                if (1 <= b && b < 22) {
                    System.out.println("Burcunuz Yay");
                } else {
                    System.out.println("Burcunuz Oglak");
                }
                break;
            default:
                System.out.println("Lutfen gecerli bir deger giriniz.");


        }


    }

}



