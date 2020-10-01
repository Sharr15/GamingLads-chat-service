package GamingLads.chatservice.Controller;

import GamingLads.chatservice.Model.Chat;
import GamingLads.chatservice.Service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    ChatService chatService;

    @GetMapping("/1")
    public ResponseEntity<Void> saveChat(){
        boolean saved = chatService.saveChat();
        if(saved){
            return new ResponseEntity<>(null, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(null, HttpStatus.CONFLICT);
        }
    }
}
