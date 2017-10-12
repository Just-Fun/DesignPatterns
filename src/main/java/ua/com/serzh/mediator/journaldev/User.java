package ua.com.serzh.mediator.journaldev;

/**
 * @author sergii.zagryvyi on 12.10.2017
 */
public abstract class User {

    protected ChatMediator chat;
    protected String name;

    public User(ChatMediator chat, String name){
        this.chat =chat;
        this.name=name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
