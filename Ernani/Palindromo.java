import java.util.Scanner;
public class Palindromo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String word = input.nextLine();

        String invword = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(invword)) {
            System.out.println("É palíndromo!!!");
        } else {
            System.out.println("Não é palíndromo!!!");
        }

        input.close();
    }
}
