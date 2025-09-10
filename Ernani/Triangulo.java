import java.util.Scanner;
public class Tabuada{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o lado 1");
        int l1 = entrada.nextInt();
        System.out.print("Digite o lado 2");
        int l2 = entrada.nextInt();
        System.out.print("Digite o lado 3");
        int l3 = entrada.nextInt();

        verificador(l1,l2,l3);

        entrada.close();
    }
    public static void verificador(int l1,int l2,int l3){
        int hipo = Math.max(l1,Math.max(l2,l3));
        int cat1, cat2;

        if (hipo == l1) {
            cat1 = l2;
            cat2 = l3;
        } else if (hipo == l2) {
            cat1 = l1;
            cat2 = l3;
        } else {
            cat1 = l1;
            cat2 = l2;
        }
        
        if (hipo*hipo == cat1*cat1 + cat2*cat2){
            System.out.print("É");
        }
        else{
            System.out.print("NÃO");
        }
    }
}
