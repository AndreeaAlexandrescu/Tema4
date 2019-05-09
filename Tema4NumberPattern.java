import java.util.Scanner;

public class Tema4NumberPattern {
    public static void NumberPatternA (int A) {
        System.out.println();
        for (int i = 1; i<= A; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void NumberPatternB (int B) {
        System.out.println();
        for (int i = B; i >= 1; i--) {
            for (int j = 1; j <= B - i ; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void NumberPatternC (int C) {
        System.out.println();
        for (int i = 1; i<= C; i++) {
            for (int j = 1; j <= C - i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void NumberPatternD (int D) {
        System.out.println();
        for (int i = 1; i<= D; i++) {
            for (int j = (D - i) + 1; j >= 1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui X: ");
        int X = s.nextInt();
        NumberPatternA(X);
        NumberPatternB(X);
        NumberPatternC(X);
        NumberPatternD(X);
    }
}
