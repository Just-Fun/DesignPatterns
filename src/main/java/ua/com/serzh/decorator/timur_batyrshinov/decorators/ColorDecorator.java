package ua.com.serzh.decorator.timur_batyrshinov.decorators;

import ua.com.serzh.decorator.timur_batyrshinov.objects.Component;

/**
 * @author sergii.zagryvyi on 29.09.2017
 */
public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added color");
    }
}
