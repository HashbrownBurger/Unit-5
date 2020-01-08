public class num {
    private int value;

    public num(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
    public String toString(){
        return "" + value;
    }

    public boolean isEqual(num otherNumber){
        return this.value == otherNumber.value;
        }
    }

