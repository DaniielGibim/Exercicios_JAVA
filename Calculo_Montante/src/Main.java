import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double capital, juros, montante;
        int tempo;

        System.out.println("Digite o capital aplicado:");
        capital = sc.nextDouble();
        System.out.println("Digite a % de juros:");
        juros = sc.nextDouble();
        System.out.println("Digite o tempo de aplicação:");
        tempo = sc.nextInt();
        montante = capital * Math.pow((1+juros),tempo);
        System.out.printf("O montante acumulado foi de %.2f.",montante);

    }
}