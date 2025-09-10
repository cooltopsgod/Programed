public class AsnoeriscoB {
    public static void main(String[] args) {
        String Ast = "*";
        int cont = 1;
        for(int i = 0; i<10; i++){
            for (int j = 11; j>cont; j--){
                System.out.print(Ast);
            }
            cont++;
            System.out.print("\n");
        }
    }
}
