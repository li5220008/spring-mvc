package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by free on 14-3-22.
 */
@Component
public class MessagePrinter {
    @Autowired
    private MessageService service;
    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
