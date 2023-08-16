import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b,c;
        System.out.println("Digite os 3 lados de um triângulo: ");

        System.out.println("Lado A:");
        a = sc.nextInt();
        System.out.println("Lado B:");
        b = sc.nextInt();
        System.out.println("Lado C:");
        c = sc.nextInt();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            if ((a == b) && (b == c))
                System.out.println("É um triângulo EQUILATERO.");
            else if (a == b || a == c || b == c)
                System.out.println("É um triângulo ISÓSCELES.");
            else
                System.out.println("É um Triângulo ESCALENO.");
        }
        else
            System.out.println("Não é possível formar um Triângulo.");
    }
}