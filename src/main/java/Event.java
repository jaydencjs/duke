public class Event extends Task  {

    protected String period;

    public Event(String description, String period) {
        super(description);
        this.period = period;
    }

    @Override
    public void printTask(){
        String status = " ";
        if(done){
            status = "X";
        }
        System.out.println("[E][" + status + "] " + description + " (at: " + period + ")");
    }
}
