public class Slogan {
    private static int count = 0;
    private String phrase;
    public Slogan(String phrase){
        this.phrase = phrase;
        count ++;

    }

    public String toString(){
        return phrase;
    }

    public static int getCount(){
        return count;
    }
}
