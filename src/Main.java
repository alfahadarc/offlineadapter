public class Main {
    public static void main(String[] args) {
        OldClass oldClass = new OldClass();
        oldClass.calculateSum("old.txt");

        System.out.println("Conversion");
        Adapter adapter = new Adapter();
        adapter.calculateSumAdapater("new.txt");
    }
}
