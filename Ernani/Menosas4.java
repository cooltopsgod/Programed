import java.util.Scanner;

public class Menosas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frs = input.nextLine();
        String maxplvr = "";
        String minplvr = "";

        System.out.println("PALAVRAS ENCONTRADAS\n====================");

        if (frs.length() > 4) {
            if (frs.indexOf(" ") != -1) {
                while (frs.indexOf(" ") != -1) {
                    String plvr = frs.substring(0, frs.indexOf(" "));
                    frs = frs.substring(frs.indexOf(" ") + 1);

                    if (plvr.length() > 4) {
                        System.out.println(plvr);
                        if (minplvr.equals("") || plvr.length() < minplvr.length()) {
                            minplvr = plvr;
                        }
                    }

                    if (plvr.length() > maxplvr.length()) {
                        maxplvr = plvr;
                    }
                }
            }

            // Processa a última palavra
            if (frs.length() > 4) {
                System.out.println(frs);
                if (minplvr.equals("") || frs.length() < minplvr.length()) {
                    minplvr = frs;
                }
            }

            if (frs.length() > maxplvr.length()) {
                maxplvr = frs;
            }
        }

        System.out.println("MENOR PALAVRA ENCONTRADA: " + minplvr);
        System.out.println("MAIOR PALAVRA ENCONTRADA: " + maxplvr);
    }
}
