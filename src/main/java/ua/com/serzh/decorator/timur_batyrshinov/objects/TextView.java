package ua.com.serzh.decorator.timur_batyrshinov.objects;

/**
 * @author sergii.zagryvyi on 29.09.2017
 */
public class TextView implements Component {

    @Override
    public void draw() {
        System.out.println("draw textView");
    }
}
