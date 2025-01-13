package com.cdpchatbot.controller;

import com.cdpchatbot.service.CdpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private CdpService cdpService;

    @PostMapping("/ask")
    public String askQuestion(@RequestBody String userQuestion) {
        return cdpService.getAnswer(userQuestion);
    }
}
