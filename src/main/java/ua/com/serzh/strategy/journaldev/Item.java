package ua.com.serzh.strategy.journaldev;

/**
 * @author sergii.zagryvyi on 12.10.2017
 */
public class Item {

    private String upcCode;
    private int price;

    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}
