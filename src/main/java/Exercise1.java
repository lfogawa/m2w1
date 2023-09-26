import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Agora, digite seu sobrenome");
        String sobrenome = scanner.nextLine();

        System.out.printf("Seja bem-vindo(a), %s %s", nome, sobrenome);
    }
}