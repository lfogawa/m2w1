import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        String nota1String = scanner.nextLine();
        nota1String = nota1String.replace(',', '.');
        double nota1 = Double.parseDouble(nota1String);

        System.out.println("Digite sua primeira nota");
        String nota2String = scanner.nextLine();
        nota2String = nota2String.replace(',', '.');
        double nota2 = Double.parseDouble(nota2String);

        System.out.println("Digite sua primeira nota");
        String nota3String = scanner.nextLine();
        nota3String = nota3String.replace(',', '.');
        double nota3 = Double.parseDouble(nota3String);

        double mediaFinal = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média final é %.2f", mediaFinal);
    }
}
