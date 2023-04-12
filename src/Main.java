public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] firstArray = new int[3];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
        }
        double[] secondArray = {1.57, 7.654, 9.986};
        String[] thirdArray = {"Вова", "Саша", "Петя"};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] firstArray = new int[3];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
        }
        double[] secondArray = {1.57, 7.654, 9.986};
        String[] thirdArray = {"Вова", "Саша", "Петя"};
        for (int i = 0; i < firstArray.length; i++) {
            if (i == firstArray.length - 1) {
                System.out.println(firstArray[i]);
            }
            else {
                System.out.print(firstArray[i] + " ");
            }
        }
        for (int i = 0; i < secondArray.length; i++) {
            if (i == secondArray.length - 1) {
                System.out.println(secondArray[i]);
            }
            else {
                System.out.print(secondArray[i] + " ");
            }
        }
        for (int i = 0; i < thirdArray.length; i++) {
            if (i == thirdArray.length - 1) {
                System.out.println(thirdArray[i]);
            }
            else {
                System.out.print(thirdArray[i] + " ");
            }
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] firstArray = new int[3];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
        }
        double[] secondArray = {1.57, 7.654, 9.986};
        String[] thirdArray = {"Вова", "Саша", "Петя"};
        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(firstArray[i]);
            }
            else {
                System.out.print(firstArray[i] + " ");
            }
        }
        for (int i = secondArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(secondArray[i]);
            }
            else {
                System.out.print(secondArray[i] + " ");
            }
        }
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(thirdArray[i]);
            }
            else {
                System.out.print(thirdArray[i] + " ");
            }
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int[] firstArray = new int[3];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i] += 1;
            }
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (i == firstArray.length - 1) {
                System.out.println(firstArray[i]);
            }
            else {
                System.out.print(firstArray[i] + " ");
            }
        }
    }
}