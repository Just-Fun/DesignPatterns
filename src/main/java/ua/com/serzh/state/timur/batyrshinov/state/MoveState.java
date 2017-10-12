package ua.com.serzh.state.timur.batyrshinov.state;

public class MoveState implements TransformerState {

    @Override
    public void action() {
        System.out.println("move!!!");
    }
}
