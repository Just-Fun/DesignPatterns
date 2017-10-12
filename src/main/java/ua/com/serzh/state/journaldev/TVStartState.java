package ua.com.serzh.state.journaldev;

/**
 * @author sergii.zagryvyi on 12.10.2017
 */
public class TVStartState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
