public class Main {

    public static void main(String[] args){
        intPrint intP  = new intPrint();
        intP.print();
        int b = intP.a;
        String printReturned = String.format("~~~<%d>>~~~", b);
        System.out.println(printReturned);
    }
}
