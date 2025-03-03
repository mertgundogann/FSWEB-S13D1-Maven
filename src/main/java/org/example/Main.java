package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Genişlik: ");
        double width = scanner.nextDouble();

        System.out.print("Yükseklik: ");
        double height = scanner.nextDouble();

        double rectangleResult = area(width, height);
        System.out.println(rectangleResult == -1 ? "Hatalı giriş!" : "Alan: " + rectangleResult);


        System.out.print("Dairenin yarıçapını girin: ");
        double radius = scanner.nextDouble();

        double circleResult = area(radius);
        System.out.println(circleResult == -1 ? "Hatalı giriş!" : "Dairenin alanı: " + circleResult);
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if(clock < 0 || clock>23){
            return false;
        }

        if (isBarking && (clock < 8 || clock >= 20)) {
            return true;
        }

        return false;
    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if ((firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19)) {
            return true;
        }
        return false;
    }


    public static boolean isCatPlaying(boolean isSummer, int temp) {
        return temp >= 25 && temp <= (isSummer ? 45 : 35);
    }

    public static double area(double width, double height) {
        return (width < 0 || height < 0) ? -1 : width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }


        return radius * radius * Math.PI;
    }

}
