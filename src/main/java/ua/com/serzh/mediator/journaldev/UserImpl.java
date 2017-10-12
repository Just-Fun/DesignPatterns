package ua.com.serzh.mediator.journaldev;

/**
 * @author sergii.zagryvyi on 12.10.2017
 */
public class UserImpl extends User {

    public UserImpl(ChatMediator chat, String name) {
        super(chat, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message=" + msg);
        chat.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message:" + msg);
    }
}
