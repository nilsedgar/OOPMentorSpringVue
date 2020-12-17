package testpackage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testpackage.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
