package Chapter_1;

public class OperatorTest {
    //Program that ilustrates basic operators.
    //The following output is:
    //12 8 6
    //6 8 6
    //6 8 14
    //22 8 14
    //24 10 33

    public static void main(String[] args) {
        int a = 12, b = 8, c = 6;
        System.out.println(a + " " + b + " " + c);
        a = c;
        System.out.println(a + " " + b + " " + c);
        c += b;
        System.out.println(a + " " + b + " " + c);
        a = b + c;
        System.out.println(a + " " + b + " " + c);
        a++;
        ++b;
        c = ++a + ++b;
        System.out.println(a + " " + b + " " + c);

    }

}
