import static anotherPackage.DoNotPrint.notPrint;
import static anotherPackage.PrintTheMessage.printThis;

public class Main {

    public static void main(String[] args) {
        printThis("This is a test text");
        notPrint("This is another text");
    }
}
