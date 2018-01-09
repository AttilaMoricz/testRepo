import static anotherPackage.DoNotPrint.notPrint;
import static anotherPackage.PrintTheMessage.printThis;

public class Main {

    public static void main(String[] args) {
        morePint();
    }

    public static final String EMA = "ez meg az";

    private static final void morePint() {
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                printThis("valami");
            }
        }
        printThis("This is a test text");
        notPrint("This is another text");
        Branch2.printBranchName();
    }

    private static void doSomething() {
        System.out.println(EMA);
    }

    private static void doSomething() {
        System.out.println(EMA);
    }

}
