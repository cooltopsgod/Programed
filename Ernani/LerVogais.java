import java.util.Scanner;
public class LerVogais{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String word = input.nextLine();
        int cont = 0;
        for (int i = 0; i < word.length(); i++){
            char c = word.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                cont++;
            }
        }
        System.out.printf("Esse programa tem %d vogais",cont);
        input.close();
    }
}