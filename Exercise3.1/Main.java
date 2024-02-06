public class Main {
    public static void main(String[] args) {
        int x, y, z, w;
        x = 11;
        y = 4;
        z = x / ++y;
        w = ++x % y--;
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Z: " + z);
        System.out.println("W: " + w);
    }
}