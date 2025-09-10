public class Distancia {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double x1 = Math.random() * 100;
            double y1 = Math.random() * 100;
            double x2 = Math.random() * 100;
            double y2 = Math.random() * 100;

            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            System.out.printf("x1: %.2f, y1: %.2f, x2: %.2f, y2: %.2f, distância: %.2f%n",x1, y1, x2, y2, distancia);
        }
    }
}