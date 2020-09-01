package com.isaccanedo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Isac Canedo
 */
@Data
@AllArgsConstructor
public class ServerMessage {

    private String content;

    public ServerMessage() {
    }

    @Override
    public String toString() {
        return content;
    }

}
