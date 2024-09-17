import java.lang.Math;
import java.util.Random;

public class Main {

    static final int rghtborder = 1_000_000;

    private static double Calc1(double x) { // первое вычисления массива
        double Temp1 = Math.tan(Math.tan(Math.asin(x * Math.E + 1)));

        return Temp1;
    }

    private static double Calc2(double x) { // Второе вычисление с массивом
        double Temp1 = ((2 / 3 - Math.asin(Math.sin(x))) / Math.pow((Math.pow((1 / 2 / (x + 2)), 2) / 2), 3));
        double Temp2 = Math.pow(Math.cos(Math.pow(Math.PI * x, x)), Temp1);
        return Temp2;
    }

    private static double Calc3(double x) { // 3 вычисление с двумерным массивом
        double Temp = Math.pow((Math.pow(Math.pow((x+1)/x,3)/1/3,2)+1),Math.atan(Math.cos(x)));
        double ArrAppend = Math.cos((Math.cbrt(Math.sin(x))))*Temp;
        return ArrAppend;
    }

    private static void PrintMatrix(double[][] w) { // реализация вывода матрицой
        for (int i = 0; i < w.length;i++) {
            for (int k = 0; k < w[i].length; k++) {
                double kk = w[i][k];
                System.out.printf("%10.3f ", kk);

            }
            System.out.println();
        }
    }


    private static double[][] tdArray( int[]z,   double[]x) { // вычисления связанные с двумерным массивом
        double[][] w = new double[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 6) {
                    w[i][j] = Calc1(x[j]);
                } else if (z[i] == 14 || z[i] == 16 || z[i] == 20 || z[i] == 22) {
                    w[i][j] = Calc2(x[j]);
                } else {
                    w[i][j] = Calc3(x[j]);
                }

            }
        }
        return w;

    }

    public static double GenRandom() {
        Random rnd = new Random();

        return (rnd.nextFloat(-5.0f*rghtborder, 5.0f*rghtborder+1))/rghtborder;
    }

    public static void main(String[] args) {
        double[] x = new double[10]; // Создаем массив X


        int[] z = new int[]{6, 8, 10, 12, 14, 16, 18, 20, 22}; // создаем массив z

        for (int i = 0; i < x.length; i++) { // заполняем данные в массив x
            x[i] = GenRandom();
        }

        double[][] w = tdArray(z,x); // Создаем двумерный массив

        PrintMatrix(w); // выводим в виде матрицы
    }
}

