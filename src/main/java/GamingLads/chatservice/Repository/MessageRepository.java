package GamingLads.chatservice.Repository;

import GamingLads.chatservice.Model.Chat;
import GamingLads.chatservice.Model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {

}
