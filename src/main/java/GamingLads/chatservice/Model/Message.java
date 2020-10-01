package GamingLads.chatservice.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor @NoArgsConstructor
@Entity(name = "Message")
@Table(name = "message")
public class Message {

    @Getter @Setter @Id
    private int messageId;

    @Getter @Setter
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User userId;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "chatId", referencedColumnName = "chatId")
    private Chat chat;

    @Getter @Setter @Column
    private String message;
}
