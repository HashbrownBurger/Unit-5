public class lockableClient {
    public static void main(String[] args) {
        lockableDice d1 = new lockableDice(12345, true);

        d1.roll();
        System.out.println(d1.toString());
        d1.unlock(12345);
        d1.roll();
        System.out.println(d1.toString());



    }
}
