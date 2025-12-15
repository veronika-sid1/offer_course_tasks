package static_final_modif_3;

public class MathConstants {
    public static final double pi = 3.14159;
    public static final double eyl = 2.71828;

    public static void main(String[] args) {
        printConstants();
    }

    public static void printConstants() {
        System.out.println(MathConstants.eyl);
        System.out.println(MathConstants.pi);
    }
}
