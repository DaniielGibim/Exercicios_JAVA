import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int TAM = 5;
        double [] notas = new double[TAM];

        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < TAM; i ++ ) {

            System.out.println("Digite a sua nota: " + (i+1) + ":");
            notas[i] = sc.nextDouble();
            soma = soma + notas[i];

        }
        double media = soma / TAM;
        System.out.println("Média:" + media);

        for (int i = 0; i < TAM; i ++){
            if (notas[i] > media)
                System.out.println("A nota " + (i+1) + " sendo " + notas[i] + " foi maior que a média.");

        }

    }
}