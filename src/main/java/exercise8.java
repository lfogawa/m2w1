import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inicial");
        int valorInicial = scanner.nextInt();

        System.out.println("Agora, digite o valor da raiz");
        int raiz = scanner.nextInt();

        System.out.println("Você deseja calcular os 10 primeiros valores de uma P.A. ou de uma P.G. com base nos números anteriores? Digite 1 para P.A. e 2 para P.G.");
        int decisaoUsuario = scanner.nextInt();

        switch (decisaoUsuario) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    System.out.print(valorInicial + i * raiz + ", ");
                }
                break;
            case 2:
                for (int i = 0; i < 10; i++) {
                    System.out.print(valorInicial * Math.pow(raiz, i) + ", ");
                }
                break;
            default:
                System.out.println("Escolha inválida.");
        }

        scanner.close();
    }
}