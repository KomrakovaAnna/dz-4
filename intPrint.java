public class intPrint {
    int a = 1;
    public int print() {
        String printing = String.format("---<%d>---", a);
        System.out.println(printing);
        return a;
    }
}
