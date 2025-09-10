public class Angulos {
    public static void main(String[] args) {

        System.out.printf("%10s %10s %10s %10s%n", "Ângulo", "Seno", "Cosseno", "Tangente");

        for (int i = 1; i <= 360; i++) {
            double emradian = Math.toRadians(i);
            double senozin = Math.sin(emradian);
            double cossenozin = Math.cos(emradian);
            double tangentin = Math.tan(emradian);

            System.out.printf("%10d %10.3f %10.3f %10.3f%n", i, senozin, cossenozin, tangentin);
        }
    }
}
