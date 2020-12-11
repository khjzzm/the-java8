package Inter;

public class SupplierClass {
    public static void main(String[] args) {
        Supplier<String> getString = () -> "Happy new year!";
        String str = getString.get();
        System.out.println(str);
    }
}
