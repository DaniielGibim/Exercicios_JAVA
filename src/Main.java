import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de minutos utilizados: ");
        int minutos = sc.nextInt();
        double conta = 50;
        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2;
        }
        System.out.printf("O valor da conta a ser paga é = R$ %.2f%n", conta);
        sc.close();
    }
}