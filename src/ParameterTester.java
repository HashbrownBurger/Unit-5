public class ParameterTester {

        public void changeValues (int f1, num f2, num f3){
            System.out.println("Before changing the values:");
            System.out.println("f1\tf2\tf3");
            System.out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");

            f1 = 999;
            f2.setValue(888);
            f3 = new num(777);

            System.out.println("After changing the values:");
            System.out.println("f1\tf2\tf3");
            System.out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");
        }
    }
