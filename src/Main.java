public class Main {
    public static void main(String[] args) {

        //Задание 1
        {
            System.out.println("Задание 1:");
            int clientOS = 0;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //Задание 2
        {
            System.out.println("\nЗадание 2:");
            int clientOS = 1;
            int clientDeviceYear = 2013;
            if (clientDeviceYear >= 2015) {
                if (clientOS == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            } else if (clientOS == 0) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            }
        }

        //Задание 3
        {
            System.out.println("\nЗадание 3:");
            int year = 400;
            boolean every4Years = year % 4 == 0;
            boolean every100Years = year % 100 == 0;
            boolean every400Years = year % 400 == 0;
            if (every4Years) {
                if (every100Years && !every400Years) {
                    System.out.println(year + " год не является високосным");
                } else System.out.println(year + " год является високосным");
            } else System.out.println(year + " год не является високосным");
        }

        //Задание 4:
        {
            System.out.println("\nЗадание 4:");
            int deliveryDistance = 415;
            int daysForDelivery = 1;
            if (deliveryDistance < 20) {
                System.out.println("Потребуется дней: "+daysForDelivery);
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                daysForDelivery = daysForDelivery + 1;
                System.out.println("Потребуется дней: "+daysForDelivery);
            } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                daysForDelivery = daysForDelivery + 2;
                System.out.println("Потребуется дней: "+daysForDelivery);
            } else System.out.println("Расстояние для доставки слишком большое :(");
        }
    }
}