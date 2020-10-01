package GamingLads.chatservice.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor @NoArgsConstructor
@Entity(name = "User")
@Table(name = "user")
public class User {

    @Getter @Setter @Id
    private String userId;

    @Getter @Setter
    private String username;

}
