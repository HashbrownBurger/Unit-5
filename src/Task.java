public class Task implements Priority{
    private String name;
    private int priorityLevel;
    private boolean isComplete;

    public Task(String name, int priorityLevel){
        this.name = name;
        isComplete = false;
        this.priorityLevel = priorityLevel;
    }
    public void setPriority(int priorityLevel){
        this.priorityLevel = priorityLevel;
    }

    public int getPriority(){
        return priorityLevel;
    }

    public void doTask(){
        System.out.println("yay");
        isComplete = true;
        this.setPriority(-1);
    }
    public String toString(){
            return "Task " + name + "\nPriority: " + this.getPriority;
 }
}
