 public class ParameterPassing {
        public static void main(String[] args) {
            ParameterTester tester = new ParameterTester();

            int a1 = 111;
            num a2 = new num(222);
            num a3 = new num(333);

            System.out.println("Before calling changeValues:");
            System.out.println("a1\ta2\ta3");
            System.out.println(a1 + "\t" + a2 + "\t" + a3 + "\n");

            tester.changeValues(a1,a2,a3);

            System.out.println("After calling changeValues:");
            System.out.println("a1\ta2\ta3");
            System.out.println(a1 + "\t" + a2 + "\t" + a3 + "\n");
        }
    }

