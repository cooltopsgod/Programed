import java.util.Scanner;
import java.lang.Math;

public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 10) + 1;
        int tentativa = 0;

        System.out.println("Tente adivinar o número (entre 1 e 10)!");

        while (tentativa != numeroSecreto) {
            System.out.print("Digite sua tentativa: ");
            tentativa = entrada.nextInt();

            if (tentativa < numeroSecreto) {
                System.out.println("Muito Baixo!");
            }
            else if (tentativa > numeroSecreto) {
                System.out.println("Muito Alto!");
            }
            else {
                System.out.println("Parabéns! Você acertou!");
            }
        }
        entrada.close();
    }
}