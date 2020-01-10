public class sloganClient {
    public static void main(String[] args) {
        Slogan phrase;
        phrase = new Slogan( "The Snack that Smiles Back, Gold Fish");
        System.out.println(phrase);
         phrase = new Slogan( "Happy Trees");
        System.out.println(phrase);
         phrase = new Slogan( "I am Iron Man");
        System.out.println(phrase);
        phrase = new Slogan( "Now I Know My ABCs");
        System.out.println(phrase);


        System.out.println(Slogan.getCount());
    }
}