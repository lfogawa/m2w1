import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário");
        String salarioString = scanner.nextLine();
        salarioString = salarioString.replace(',', '.');
        double salario = Double.parseDouble(salarioString);

        if(salario <= 1200){
            double salarioComAumento = salario * 1.2;
            double aumento = salarioComAumento - salario;
            System.out.printf("O seu salário era de %.2f. O aumento aplicado é de 20%%, sendo seu valor de R$%.2f. O seu salário agora, portanto, é de R$%.2f.%n", salario, aumento, salarioComAumento);
        } else if (salario > 1200 && salario <= 1700){
            double salarioComAumento = salario * 1.15;
            double aumento = salarioComAumento - salario;
            System.out.printf("O seu salário era de %.2f. O aumento aplicado é de 15%%, sendo seu valor de R$%.2f. O seu salário agora, portanto, é de R$%.2f.%n", salario, aumento, salarioComAumento);
        } else if (salario > 1700 && salario < 2500){
            double salarioComAumento = salario * 1.10;
            double aumento = salarioComAumento - salario;
            System.out.printf("O seu salário era de %.2f. O aumento aplicado é de 10%%, sendo seu valor de R$%.2f. O seu salário agora, portanto, é de R$%.2f.%n", salario, aumento, salarioComAumento);
        } else {
            double salarioComAumento = salario * 1.05;
            double aumento = salarioComAumento - salario;
            System.out.printf("O seu salário era de %.2f. O aumento aplicado é de 5%%, sendo seu valor de R$%.2f. O seu salário agora, portanto, é de R$%.2f.%n", salario, aumento, salarioComAumento);
        }

        scanner.close();
    }
}
