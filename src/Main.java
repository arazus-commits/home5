
public class Main {
    public static void main(String[] args) {
        //задача 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //задача 2
        int clientOS2 = 1;
        int clientDeviceYear = 2015;
        if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS2 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS2 == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        //задача 3
        int year2 = 2024;
        System.out.print("Если год " + year2);
        if (year2 < 1584) {
            System.out.println(", високосный год еще не был принят.");
        } else if ((year2 % 4 == 0 && year2 % 100 != 0) || year2 % 400 == 0 ) {
                System.out.println(", то это високоный год.");
            } else {
                System.out.println(", то это не високосный год.");
            }


        //задача 4
        int deliveryDistance = 15;
        int day;
        if (deliveryDistance <= 20) {
        day =+1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <= 60) {
            day = +2;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <=100) {
            day = +3;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставка не осуществляется");

        }
        //задача 5
        char monthNumber = 11;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}
