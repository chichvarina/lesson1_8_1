import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int year = 2021;
        calculateLeapYear(year);

        //Задание 2
        int clientOS = 1;
        int clientDeviceYear = 2050;
        checkOS(clientOS, clientDeviceYear);

        //Задание 3
        int deliveryDistance = 95;
        int days = getDays(deliveryDistance);
        System.out.println("Потребуется дней: " + days);

    }

    public static int getDays(int distance) {
        if(distance < 20){
            return 1;
        }else {
            int days = (distance - 20) / 40 + 2;
            return days;
        }
    }

    public static void calculateLeapYear(int year) {
        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (leapYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void checkOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear > currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

}








