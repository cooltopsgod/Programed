import java.util.Scanner;
import java.lang.Math;
public class CalcMath {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();

        System.out.println("Raiz quadrada: " + Math.sqrt(numero));
        System.out.println("Elevado ao quadrado: " + Math.pow(numero, 2));
        System.out.println("Elevado ao cubo: " + Math.pow(numero, 3));

        entrada.close();
    }
}