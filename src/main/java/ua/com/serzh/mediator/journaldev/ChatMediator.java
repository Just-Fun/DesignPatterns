package ua.com.serzh.mediator.journaldev;

/**
 * @author sergii.zagryvyi on 12.10.2017
 */
public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
