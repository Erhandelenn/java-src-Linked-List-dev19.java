
public class State {
    private String status;
    private State nextState;

    public State(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public State getNextState() {
        return nextState;
    }

    public void setNextState(State nextState) {
        this.nextState = nextState;
    }

    public void yazdir() {
        System.out.println("Status: " + status);
    }
}