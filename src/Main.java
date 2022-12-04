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
    }
}