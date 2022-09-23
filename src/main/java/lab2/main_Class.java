package lab2;

import java.util.*;

public class main_Class {
    static int mr = 20;// max rows
    static int mc = 20;// max column

    static int high_border = 20; //верхня границя діапазону випадкових чисел
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("1. Ввести розмір матриці з клавіатури.");
        System.out.println("2. Випадково обрати розмір (макс. розм. 20х20).");

        int input = scan.nextInt();

        while (input <= 0 || input >= 3) {
            System.out.println("Помилка. Оберіть коректний варіант:");
            input = scan.nextInt();
        }

        int[] arr_size;
        if (input == 1) {
            arr_size = set_size_from_keyboard();
        } else arr_size = set_size_random();

        ////
        int[][] array;
        System.out.println("Заповніть матрицю.");
        System.out.println("1. Заповнити матрицю вручну.");
        System.out.println("2. Випадково заповнити матрицю.");

        input = scan.nextInt();
        while (input <= 0 || input >= 3) {
            System.out.println("Помилка. Оберіть коректний варіант:");
            input = scan.nextInt();
        }
        if (input == 1) {
            array = create_array_wkb(arr_size[0], arr_size[1]);
        } else array = create_rand_array(arr_size[0], arr_size[1]);

        print_array(array);//виведення матриці на екран

        Map<String,Double> parametrs=eval_param(array); // розрахунок параметрів
        System.out.println("Параметри матриці розміром " + array.length+ "x"+array[0].length+":");
        System.out.println("min:"+parametrs.get("min"));
        System.out.println("max:"+parametrs.get("max"));
        System.out.println("Середнє:"+parametrs.get("avg"));
        System.out.println("Середнє геометричне:"+parametrs.get("g.avg"));


    }

    public static int[] set_size_from_keyboard() {

        System.out.println("Введіть кількість рядків:");
        int rows = scan.nextInt();
        while (rows <= 0 || rows > mr) {
            System.out.println("Помилка. Введіть кількість рядків (додатнє число (не нуль) та не більше 20):");
            rows = scan.nextInt();
        }

        System.out.println("Введіть кількість стовпчиків:");
        int cols = scan.nextInt();
        while (cols <= 0 || cols > mc) {
            System.out.println("Помилка. Введіть кількість стовпчиків (додатнє число (не нуль) та не більше 20):");
            cols = scan.nextInt();
        }
        int[] array_info = {rows, cols};
        return array_info;
    }

    public static int[] set_size_random() {
        int rows, cols;
        rows = (int) (mr * Math.random());
        while (rows <= 0 || rows > mr) {
            rows = (int) (mr * Math.random());
        }
        cols = (int) (mc * Math.random());
        while (cols <= 0 || cols > mc) {
            cols = (int) (mc * Math.random());
        }

        int[] array_info = {rows, cols};
        return array_info;


    }

    public static int[][] create_rand_array(int row, int col) {
        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = (int) ((high_border * Math.random())); //
                while(array[i][j]==0)
                    array[i][j] = (int) ((high_border * Math.random())); // якщо число є 0, тоді під час розрахунку середнього геометричного, програма буде повертати 0
            }
        }

        return array;
    }

    public static int[][] create_array_wkb(int row, int col) {//  ввести масив за допомогою клавіатури
        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Введіть елемент ["+i+"] ["+j+"]:");
                array[i][j] = scan.nextInt();
                while(array[i][j]<=0){
                    System.out.println("Помилка: введено 0 або менше 0, це призведе до помилок під час розрахунку сер. геометричного.\nВведіть елемент ["+i+"] ["+j+"]:");
                    array[i][j] = scan.nextInt(); // якщо число є 0, тоді під час розрахунку середнього геометричного, програма буде повертати 0
                }
            }
        }
        return array;
    }

    public static void print_array(int [][] array) {
        System.out.println("Матриця має наступний вигляд:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("\t"+array[i][j]);
            }
            System.out.println("");
        }
    }
    public static Map<String, Double> eval_param(int[][] array) {
        Map<String,Double> parameters= new HashMap<String,Double>();
        int min=array[0][0],    max=array[0][0]; // позначаємо мінімальний, максимальний початкові елементи
        int sum=0;//сума
        double multpl=1; // добуток елементів
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j]>max) {
                    max = array[i][j];
                }
                sum+=array[i][j];
                multpl*=array[i][j];
            }
        }
        parameters.put("min",Double.valueOf(min));
        parameters.put("max",Double.valueOf(max));
        parameters.put("avg",Double.valueOf(sum)/(array.length*array[0].length));
        parameters.put("g.avg",Math.pow(multpl,1/Double.valueOf(array.length*array[0].length))); // возведення добутку елементів у N корінь, де N кількість елементів  //Math.pow(multpl,Math.pow(array.length*array[0].length,-1))

        return parameters;

    }
}
