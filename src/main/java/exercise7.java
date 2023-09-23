import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int primeiroNumero = Integer.parseInt(scanner.nextLine());

        System.out.println("Agora, digite o segundo número");
        int segundoNumero = Integer.parseInt(scanner.nextLine());

        System.out.println("Qual operação deseja realizar? Digite 1 para adição, 2 para subtração, 3 para multiplicação e 4 para divisão");
        String operacaoEscolhida = scanner.nextLine();

        switch (operacaoEscolhida) {
            case "1":
                int resultadoAdicao = primeiroNumero + segundoNumero;
                System.out.println("O resultado é " + resultadoAdicao);
                break;
            case "2":
                int resultadoSubtracao = primeiroNumero - segundoNumero;
                System.out.println("O resultado é " + resultadoSubtracao);
                break;
            case "3":
                int resultadoMultiplicacao = primeiroNumero * segundoNumero;
                System.out.println("O resultado é " + resultadoMultiplicacao);
                break;
            case "4":
                if (segundoNumero != 0) {
                    int resultadoDivisao = primeiroNumero / segundoNumero;
                    System.out.println("O resultado é " + resultadoDivisao);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}