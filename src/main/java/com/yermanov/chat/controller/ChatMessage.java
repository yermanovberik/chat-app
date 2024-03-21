package com.yermanov.chat.controller;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;

    private String sender;

    private MessageType type;

}
