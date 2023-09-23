import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento (no formato dd/MM/yyyy): ");
        String dataNascimentoString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, formatter);

        LocalDate dataAtual = LocalDate.now();

        int idade = dataAtual.getYear() - dataNascimento.getYear();

        if (idade == 16 || idade == 17 || idade > 59) {
            System.out.println("O voto é opcional");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("O voto é obrigatório");
        } else {
            System.out.println("O voto é proibido");
        }

        scanner.close();
    }
}