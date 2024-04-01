package Homework3;

public class Task2 {
    private static int Integer;
    private static Object cout;
    private static int mass;

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    public static void exercise1() {
        String[][] array = new String[8][8];
        String w = "W";
        String b = "B";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i % 2d == 0) {
                    array[i][j] = w;
                    //System.out.print(B + " ");
                } else {
                    array[i][j] = b;
                    //System.out.print(W + " ");
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void exercise2() {

        int sum = 0;
        //2-мерный массив
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.print("Сумма всех элементов массива: " + sum + "\n");
    }

    public static void exercise3() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        System.out.print("\nГлавная диагональ массива: \n");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();

        System.out.print("Побочная диагональ массива: \n");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i][array.length - 1 - i] + " ");
        }
        System.out.println();
    }

    public static void exercise4() {

        int a[][] = new int[4][4];
        int min = 1;
        int max = 8;
        int b;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = min + (int) (Math.random() * (max - min + 1));
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i][j] < a[i][j - 1]) {
                    b = a[i][j];
                    a[i][j] = a[i][j + 1];
                    a[i][j + 1] = b;
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}