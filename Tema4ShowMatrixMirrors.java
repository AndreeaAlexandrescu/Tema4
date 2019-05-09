import java.util.Scanner;

public class Tema4ShowMatrixMirrors {
    static int [][] matrix;
    static int d;

    public static void readMatrixValues() {
        Scanner s = new Scanner(System.in);
        System.out.print("introduceti valorile din matrice: ");
        matrix = new int [d][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.println("Linia " + i + " Coloana " + j + " :");
                matrix[i][j] = s.nextInt();
            }
        }

    }
    public static void showMatrix(int[][] m) {
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.printf("%3d", m[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] mirrorVertically(int[][] m) {
        int[][] mirrorImage = new int[d][d];
        int imageRows = 0;
        for (int i = d - 1; i >= 0; i--) {
            for (int j = 0; j < d; j++) {
                mirrorImage[imageRows][j] = m[i][j];
            }
            imageRows++;
        }
        return mirrorImage;
    }

    public static int[][] mirrorHorrizontally(int[][] m) {
        int[][] mirrorImage = new int[d][d];
        for (int i = 0; i < d; i++) {
            int imageColumn = 0;
            for (int j = d - 1; j >= 0; j--) {
                mirrorImage[i][imageColumn] = m[i][j];
                imageColumn++;

            }
        }
        return mirrorImage;
    }

    public static int[][] mirrorBothWays(int[][] m) {
        int[][] mirrorImage = new int[d][d];
        int imageRows = 0;
        for (int i = d - 1; i >= 0; i--) {
            int imageColumn = 0;
            for (int j = d - 1; j >= 0; j--) {
                mirrorImage[imageRows][imageColumn] = m[i][j];
                imageColumn++;
            }
            imageRows++;
        }
        return mirrorImage;
    }
        public static void main(String[] args) {

            System.out.println("Introduceti dimensiunea matricii: ");
            Scanner s = new Scanner(System.in);
            d = s.nextInt();
            readMatrixValues();

            System.out.println("Initial mirror: ");
            showMatrix(matrix);

            System.out.println("Mirror vertically: ");
            showMatrix(mirrorVertically(matrix));

            System.out.println("Mirror horrizontally: ");
            showMatrix(mirrorHorrizontally(matrix));

            System.out.println("Mirror both way: ");
            showMatrix(mirrorBothWays(matrix));

        }


    }

