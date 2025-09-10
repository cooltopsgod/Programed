public class Expressao {
    public static void main(String[] args) {
        double res = 0.0; // acumulador da soma
        int den = 1;

        for (int i = 38; i >= 2; i--) {
            double conta = ((i - 1) * i) / (double) den;
            res += conta;
            den++;
        }

        double resposta = Math.sqrt(res);
        System.out.println("Resultado da raiz quadrada de S: " + resposta);
    }
}