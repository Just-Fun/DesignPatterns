package ua.com.serzh.state.timur.batyrshinov.start;

import ua.com.serzh.state.timur.batyrshinov.context.TransformerContext;
import ua.com.serzh.state.timur.batyrshinov.state.FireState;
import ua.com.serzh.state.timur.batyrshinov.state.MoveState;
import ua.com.serzh.state.timur.batyrshinov.state.TransformerState;

public class Main {

    public static void main(String[] args) {

        TransformerContext context = new TransformerContext();
        
        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
        
    }
}
