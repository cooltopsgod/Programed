public class Prisma{
    public static void main(String[] args) {
        String linha = "ABCDEFGHIJK";
        int cont = 5;
        int att = 1;
        for (int i = 0; i<6; i++){
            for (int j = 0; j<cont; j++){
                System.out.print(" ");
            }
            String printada = linha.substring(0, att);
            System.out.println(printada);
            cont--;
            att = att + 2;
        }
        cont = 4;
        att = 9;
        for (int k = 0; k<5; k++){
            for (int l = 5; l>cont; l--){
                System.out.print(" ");
            }
            String printada = linha.substring(0, att);
            System.out.println(printada);
            cont--;
            att = att - 2;
        }
    }
}
