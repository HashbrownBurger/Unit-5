public class lockableDice implements Lockable{
       private int faceNum;
       private String value;
        private int key;
        private boolean isLocked;

    public lockableDice(int key, boolean isLocked)
    {
        this.key = key;
        this.isLocked = isLocked;
    }

        public void setKey(int key) {
            this.key = key;
        }

        public void lock(int key) {
            if(this.key == key)
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
            }
                else {
                    value = "" + (int) (Math.random() * faceNum) + 1;
                }
            }

        public String toString()
        {
            String result;
            result = " " + value;
            return result;
        }

    }

