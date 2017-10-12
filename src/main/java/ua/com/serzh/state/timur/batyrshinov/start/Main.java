package ua.com.serzh.state.timur.batyrshinov.start;

import ua.com.serzh.state.timur.batyrshinov.context.TransformerContext;
import ua.com.serzh.state.timur.batyrshinov.state.FireState;
import ua.com.serzh.state.timur.batyrshinov.state.MoveState;
import ua.com.serzh.state.timur.batyrshinov.state.TransformerState;

//https://www.youtube.com/watch?v=vIvb3lIkCZI&index=9&list=PLwwk4BHih4fh_aJET4PF-5Ok5iK_xgiRE
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
