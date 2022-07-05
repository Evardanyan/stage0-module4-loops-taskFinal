package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            for (int r = 2; r <= i; r++) {
                System.out.print(r);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printHalfPyramid(7);
    }
}
