package ua.com.serzh.adapter.adapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by oleksandr.baglai on 19.08.2015.
 */
public class AdapterTest {
    private ByteArrayOutputStream out;

    @Before
    public void setUpStreams() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    public String getData() {
        try {
            String result = new String(out.toByteArray(), "UTF-8").replaceAll("\r\n", "\n");
            out.reset();
            return result;
        } catch (UnsupportedEncodingException e) {
            return e.getMessage();
        }
    }

    @Test
    public void test() {
        // given
        Adaptee adaptee = mock(Adaptee.class);
        when(adaptee.specificRequest(anyObject())).thenReturn("data from adaptee");

        Target target = new Adapter(adaptee);

        // when
        Object actual = target.request("data");

        // then
        assertEquals("data from adaptee", actual);
        verify(adaptee).specificRequest("data");
    }

    @Test
    public void test2() {
        // given
        Client.main(new String[0]);
        // then
        assertEquals("Call Adaptee.specificRequest(Hello World!)\n" +
                "Hello from Adaptee!\n", getData());
    }
}
