import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando");
        double numeroEscolhido = Double.parseDouble(scanner.nextLine());

        int numeroSorteado = (int) Math.round((Math.random() * (5-1) + 1));

        if (numeroEscolhido == numeroSorteado) {
            System.out.print("Você acertou!");
        } else {
            System.out.printf("Você errou, o número correto era %d", numeroSorteado);
        }

        scanner.close();
    }
}
