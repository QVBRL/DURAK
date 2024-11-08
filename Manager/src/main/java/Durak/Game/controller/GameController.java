package Durak.Game.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GameController {
    
    @MessageMapping("/test")
    @SendTo("/test/gameSocket")
    public String testSocket()
    {
        return "Hello";
    }

}
