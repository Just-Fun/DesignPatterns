package ua.com.serzh.state.journaldev;

/**
 * @author sergii.zagryvyi on 12.10.2017
 */
public class TVContext implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState=state;
    }

    public State getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
