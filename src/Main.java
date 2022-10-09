import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value1;
        double value2;
        double value3;
        String disciplina;
        double num1;
        double num2;


        System.out.println("-----------INICIANDO PROGRAMA EM JAVA-----------");

        System.out.println("Abaixo temos uma calculadora de médias.");
        System.out.println("Siga as instruções para realizar as operações.");
        System.out.println("Primeiro vamos fazer sua média, e dizer se você será aprovado na disciplina.");

        System.out.println("Qual a disciplina que você deseja analisar sua média ?");
        disciplina = sc.nextLine();

        System.out.println("Digite abaixo sua primeira nota: ");
        value1 = sc.nextDouble();

        System.out.println("Digite abaixo sua segunda nota: ");
        value2 = sc.nextDouble();

        System.out.println("Digite abaixo sua terceira nota: ");
        value3 = sc.nextDouble();

        double soma = value1 + value2 + value3;
        double media = soma/3;

        if (media >= 70){
            System.out.println("A sua média na disciplina de " + disciplina + " é igual a: " + media + " Parabéns você foi aprovado!");
        }
        else {
            System.out.println("A sua média na disciplina de " + disciplina + " é igual a: " + media + " Você foi Reprovado!");
        }




        System.out.println("Agora faremos uma operação para testar a calculadora do sistema,");
        System.out.printf("Digite um número");
        num1 = sc.nextDouble();

        System.out.printf("Digite o segundo número");
        num2 = sc.nextDouble();

        System.out.println("A multiplicação desses números é igual : " + num1 * num2);

    }
}