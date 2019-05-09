import java.util.Scanner;

public class Tema4Simple {
    public static int getNumberOfDigits(int number){
        String Sir = String.valueOf(number);
        return Sir.length();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int v = scanner.nextInt();
        System.out.println("Output:" + getNumberOfDigits(v));


        }

}
