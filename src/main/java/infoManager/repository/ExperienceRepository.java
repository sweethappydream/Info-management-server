package infoManager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import infoManager.model.Experience;
import infoManager.model.User;

public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
  // @Query("SELECT * FROM users  WHERE name LIKE '%?1%'")
  List<Experience> findByUser(User user);
  List<Experience> findByTopic(String topic);
}
