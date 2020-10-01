package GamingLads.chatservice.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor @AllArgsConstructor
@Entity(name = "Chat")
@Table(name="chat")
public class Chat {
    //@ElementCollection(targetClass=Message.class)

    @Getter @Setter @Id
    private String chatId;

    @Getter @Setter
    @ManyToMany
    @JoinTable(
            name = "users_chats",
            joinColumns = @JoinColumn(name = "chatId"),
            inverseJoinColumns = @JoinColumn(name = "userId"))
    private List<User> users;

    @Getter @Setter
    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Message> messages;

}
