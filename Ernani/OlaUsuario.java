import java.util.Scanner;
public class OlaUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Olá, " + nome.toUpperCase() + "!");
        System.out.println("Seu nome tem " + nome.length() + " caracteres.");

        entrada.close();
    }
}