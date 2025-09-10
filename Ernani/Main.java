public class Main{
    public static void main(String[] args){
        saudacao();
        int numero = gerarNumeroAleatorio();

        exibirMensagem("Lucas");
        int resultado = multiplicar(10,2);
        System.out.println("Resultado da multiplicação: "+resultado);

    }
    public static void saudacao() {
        System.out.println("Bem vindo ao tutorial!");
    }
    public static int gerarNumeroAleatorio(){
        return 7;
    }
    public static void exibirMensagem(String nome) {
        System.out.println("Olá, "+ nome + "!");
    }
    public static int multiplicar(int a,int b){
        return a*b;
    }
}