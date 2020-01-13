public class lockableDice implements Lockable{
        int faceNum;
        String value;
        int key;
        boolean isLocked;

    public lockableDice(int faceNum, boolean isLocked)
    {
        this.faceNum = faceNum;
        this.isLocked = isLocked;
    }

        public void setKey(int key) {
            this.key = key;
        }

        public void lock(int key) {
            if(key == this.key)
                isLocked = true;
        }

        public void unlock(int key) {
            if (key == this.key)
                isLocked = false;
        }

        public boolean isLocked() {
            return isLocked;
        }


        public void roll()
        {
            if(isLocked) {
                value = "Dice is Locked";
                else if (isLocked == false){
                    value = "" + (int) (Math.random() * faceNum) + 1;
                }
            }
        }
        public String toString()
        {
            String result = "";
            result += value;
            return result;
        }

    }
}
