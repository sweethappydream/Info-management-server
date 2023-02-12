package infoManager.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import infoManager.model.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
  Experience searchByUserName(String username);
  Experience searchByTopic(String topic);
}
