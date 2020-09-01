package com.isaccanedo.controller;

import com.isaccanedo.consts.GlobalConsts;
import com.isaccanedo.model.ClientMessage;
import com.isaccanedo.model.ServerMessage;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

/** 
 * @author Isac Canedo
 * 
 */
@Controller
public class GreetingController {

    @MessageMapping(GlobalConsts.HELLO_MAPPING)
    @SendTo(GlobalConsts.TOPIC)
    public ServerMessage greeting(ClientMessage message) throws Exception {
    	// Simula o atraso para testar se o cliente está trabalhando de forma assíncrona
        Thread.sleep(1000);
        return new ServerMessage("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}
