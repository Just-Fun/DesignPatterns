package ua.com.serzh.state.journaldev;

/**
 * @author sergii.zagryvyi on 12.10.2017
 */
public class TVRemote {

    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();


        context.setState(tvStopState);
        context.doAction();

    }
}
