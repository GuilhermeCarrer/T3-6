import java.util.Scanner;

public class Exercicio24{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, opc;
        do {
            System.out.println("Digite um numero: ");


            while (!sc.hasNextInt()) {
                System.out.println("Entrada invalida, digite um numero inteiro: ");
                sc.next();

            }
            num = sc.nextInt();

            if (num < 0) {
                System.out.println("O numero digitado é negativo");
            }

            if (num == 0) {
                System.out.println("O numero digitado é zero");
            }

            if (num > 0) {
                System.out.println("O numero digitado é positivo");
            }

                 System.out.println("Deseja fechar o programa? (0 - fechar/ 1 - digitar outro numero):");

                 opc = sc.nextInt();
             }
                while (opc != 0) ;





        }


}