package infoManager.service;

import org.springframework.stereotype.Service;

import java.util.List;

import infoManager.model.Experience;
import infoManager.model.User;
import infoManager.repository.ExperienceRepository;
import infoManager.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExperienceService {
    private final ExperienceRepository experienceRepository;
    private final UserRepository userRepository;

    public List<Experience> findAllByUserName(String userName) {
        return experienceRepository.findByUser(userRepository.findByUsername(userName));
    }

    public List<Experience> findAllByTopic(String topic) {
        return experienceRepository.findByTopic(topic);
    }

    public List<Experience> findAll() {
        return experienceRepository.findAll();
    }
}
