package ua.com.serzh.decorator.timur_batyrshinov.decorators;

import ua.com.serzh.decorator.timur_batyrshinov.objects.Component;

/**
 * @author sergii.zagryvyi on 29.09.2017
 */
public abstract class Decorator implements Component{

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void afterDraw();

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
}
