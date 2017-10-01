package ua.com.serzh.decorator.timur_batyrshinov;

import ua.com.serzh.decorator.timur_batyrshinov.decorators.BorderDecorator;
import ua.com.serzh.decorator.timur_batyrshinov.decorators.ColorDecorator;
import ua.com.serzh.decorator.timur_batyrshinov.objects.Button;
import ua.com.serzh.decorator.timur_batyrshinov.objects.Component;
import ua.com.serzh.decorator.timur_batyrshinov.objects.TextView;
import ua.com.serzh.decorator.timur_batyrshinov.objects.Window;

/**
 * @author sergii.zagryvyi on 29.09.2017
 */
public class Start {

    public static void main(String[] args) {
        boolean showBorder = true;

        Component window1;
        Component textView1;
        Component button;

        if (!showBorder) {
            window1 = new Window();
            textView1 = new TextView();
            button = new Button();
        } else {
            window1 = new BorderDecorator(new Window());
            textView1 = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }

        window1.draw();
        textView1.draw();
        button.draw();

        System.out.println("-------------");

        Component window = new Window();
        window.draw();

        System.out.println("-------------");

        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();

        System.out.println("-------------");

        Component colorWithWindowWithBorder = new ColorDecorator(new BorderDecorator(new Window()));
        colorWithWindowWithBorder.draw();

        System.out.println("-------------");

        Component textView = new ColorDecorator(new TextView());
        textView.draw();

    }
}
