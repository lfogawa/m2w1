import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numeroInteiro = scanner.nextInt();

        if (numeroInteiro % 2 == 0) {
            System.out.print("O número é par");
        } else {
            System.out.print("O número é ímpar");
        }

        scanner.close();
    }
}
