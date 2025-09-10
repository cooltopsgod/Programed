import java.util.Scanner;
public class ContadorVOgais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");

        String frase = entrada.nextLine().toLowerCase();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra =='i' || letra =='o' || letra =='u'){
                contador++;
            }
        }
        System.out.println("Quantidade de vogais: " + contador);

        entrada.close();
    }
}