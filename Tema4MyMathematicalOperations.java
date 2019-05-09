import java.util.Scanner;

public class Tema4MyMathematicalOperations {
    public static int Adunare(int a, int b) {
        return a + b;
    }

    public static int Scadere(int a, int b) {
        return a - b;
    }

    public static int Inmultire(int a, int b) {
        return a * b;
    }

    public static int Impartire(int a, int b) {
        return a / b;
    }

    public static int Modul(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input: ");
        String Str = s.next();
        String[] Retval;
        int a, b;
        if (Str.contains("+")) {
            Retval = Str.split("\\+");
            a = Integer.valueOf(Retval[0]);
            b = Integer.valueOf(Retval[1]);
            System.out.println("out: "+Adunare(a,b));
        }
        if (Str.contains("-")) {
            Retval = Str.split("-");
            a = Integer.valueOf(Retval[0]);
            b = Integer.valueOf(Retval[1]);
            System.out.println("out: "+Scadere(a,b));
        }
        if (Str.contains("*")) {
            Retval = Str.split("\\*");
            a = Integer.valueOf(Retval[0]);
            b = Integer.valueOf(Retval[1]);
            System.out.println("out: "+Inmultire(a,b));
        }
        if (Str.contains("/")) {
            Retval = Str.split("/");
            a = Integer.valueOf(Retval[0]);
            b = Integer.valueOf(Retval[1]);
            System.out.println("out: "+Impartire(a,b));
        }
        if (Str.contains("%")) {
            Retval = Str.split("%");
            a = Integer.valueOf(Retval[0]);
            b = Integer.valueOf(Retval[1]);
            System.out.println("out: "+Modul(a,b));
        }
    }
}
