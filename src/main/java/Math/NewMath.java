package Math;

public class NewMath {
    public static void main(String[] args) {
        int old_multiply= 100000 * 100000;
        System.out.println(old_multiply);

        int new_multiply = Math.multiplyExact(100000, 100000);
        System.out.println(new_multiply);
    }
}
