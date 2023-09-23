import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura");
        String alturaString = scanner.nextLine();
        alturaString = alturaString.replace(',', '.');
        double altura = Double.parseDouble(alturaString);

        System.out.println("Agora, digite seu peso");
        double peso = Double.parseDouble(scanner.nextLine());

        double imc = peso/(altura*altura);

        System.out.printf("Seu IMC é de %.2f", imc);
    }
}