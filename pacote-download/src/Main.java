import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        System.out.println("Nosso programa irá dizer se você deve, ou não, pagar o ImpostoAnual (IA), e caso sim iremos calcular o quanto de imposto você irá pagar!");
        System.out.print("Para dizermos o seu Salário Anual (SA), digite o valor do seu salário: R$");
        double s = entradas.nextDouble();
        double sAnual = s*12;
        System.out.println();
        System.out.println("Agora selecione uma opção correspondente ao seu SA!");
        System.out.println();
        System.out.println("1-5% a serem cobrados para salários anuais entre R$25000 e R$ 50000");
        System.out.println("2-10% a serem cobrados para salários anuais entre R$50000 e R$100000");
        System.out.println("3-15% a serem cobrados para salários anuais entre R$100000 e R$500000");
        System.out.println("4-20% para valores acima de R$500000");
        System.out.println("5-Meu SA não se encaixa em nenhuma das opções acima");
        System.out.println();
        System.out.print("Digite a opção correspondente ao seu SA de R$"+sAnual+": ");
        byte op = entradas.nextByte();

        double sAnual1 = sAnual * 0.05;
        double sAnual2 = sAnual * 0.1;
        double sAnual3 = sAnual * 0.15;
        double sAnual4 = sAnual * 0.2;


        switch (op) {
            case 1:
                System.out.print("O valor a ser pago é de: R$"+sAnual1);
                break;
            case 2:
                System.out.print("O valor a ser pago é de: R$"+sAnual2);
                break;
            case 3:
                System.out.print("O valor a ser pago é de: R$"+sAnual3);
                break;
            case 4:
                System.out.print("O valor a ser pago é de: R$"+sAnual4);
                break;
            case 5 :
                System.out.println("Você está insento(a) do Imposto Anual (IA)");
                break;
            default:
                System.out.println("Opção inválida!");


        }

    }

}
