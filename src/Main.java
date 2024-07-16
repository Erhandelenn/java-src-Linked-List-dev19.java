
public class Main {
    public static void main(String[] args) {
        State open = new State("open");
        State start = new State("start");
        State stop = new State("stop");
        State close = new State("close");

        open.setNextState(start);
        start.setNextState(stop);
        stop.setNextState(close);

        State currentState = open;
        while (currentState != null) {
            currentState.yazdir();
            currentState = currentState.getNextState();
        }
    }
}