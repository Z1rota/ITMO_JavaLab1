import java.lang.Math;
import java.util.Random;

public class Main {



    private static final int rghtborder = 1_000_000;

    // первое вычисления массива
    private static double calc1(double x) {
        double temp1 = Math.tan(Math.tan(Math.asin(x * Math.E + 1)));

        return temp1;
    }

    // Второе вычисление с массивом
    private static double calc2 (double x) {
        double temp1 = ((2 / 3 - Math.asin(Math.sin(x))) / Math.pow((Math.pow((1 / 2 / (x + 2)), 2) / 2), 3));
        double temp2 = Math.pow(Math.cos(Math.pow(Math.PI * x, x)), temp1);
        return temp2;
    }

    // Третье вычисление с двумерным массивом
    private static double calc3(double x) {
        double temp = Math.pow((Math.pow(Math.pow((x+1)/x,3)/1/3,2)+1),Math.atan(Math.cos(x)));
        double arrAppend = Math.cos((Math.cbrt(Math.sin(x))))*temp;
        return arrAppend;
    }

    // реализация вывода матрицой
    private static void printMatrix(double[][] w) {
        for (int i = 0; i < w.length;i++) {
            for (int k = 0; k < w[i].length; k++) {

                System.out.printf("%10.3f ", w[i][k]);

            }
            System.out.println();
        }
    }

    // вычисления связанные с двумерным массивом
    private static double[][] tdArray( int[]z,   double[]x) {
        double[][] w = new double[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 6) {
                    w[i][j] = calc1(x[j]);
                } else if (z[i] == 14 || z[i] == 16 || z[i] == 20 || z[i] == 22) {
                    w[i][j] = calc2(x[j]);
                } else {
                    w[i][j] = calc3(x[j]);
                }

            }
        }
        return w;

    }

     // Генерация Рандомных значений для массива x
    public static double genRandom() {
        Random rnd = new Random();

        return (rnd.nextFloat(-5.0f*rghtborder, 5.0f*rghtborder+1))/rghtborder;
    }


    public static void main(String[] args) {
        // Создаем массив X
        double[] x = new double[10];

         // создаем массив z
        int[] z = new int[9];
        for(int i = 6,j = 0; i <= 22;i+=2,j++ ){
            z[j] = i;

        }
        

        for (int i = 0; i < x.length; i++) { // заполняем данные в массив x
            x[i] = genRandom();
        }

        double[][] w = tdArray(z,x); // Создаем двумерный массив

        printMatrix(w); // выводим в виде матрицы
    }
}
