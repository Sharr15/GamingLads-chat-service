package GamingLads.chatservice.Service;

import GamingLads.chatservice.Model.Chat;
import GamingLads.chatservice.Model.Message;
import GamingLads.chatservice.Model.User;
import GamingLads.chatservice.Repository.ChatRepository;
import GamingLads.chatservice.Repository.MessageRepository;
import GamingLads.chatservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    @Autowired
    ChatRepository chatRepo;

    @Autowired
    MessageRepository messageRepo;

    @Autowired
    UserRepository userRepo;

    public boolean saveChat() {
        try {
            Chat chat = new Chat();
            chat.setChatId("1");
            User user = new User("1", "Test");
            User user1 = new User("2", "test1");
            List<User> userList = new ArrayList<>();
            userList.add(user);
            userList.add(user1);
            List<Message> messageList = new ArrayList<>();
            Message message = new Message(1, user, chat, "Test" );
            Message message1 = new Message(2, user1, chat, "Test1" );
            messageList.add(message);
            messageList.add(message1);
            chat.setMessages(messageList);
            chat.setUsers(userList);
            userRepo.save(user);
            userRepo.save(user1);
            chatRepo.save(chat);
            messageRepo.save(message);
            messageRepo.save(message1);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
