package infoManager.service;

import org.springframework.stereotype.Service;

import java.util.List;

import infoManager.model.User;
import infoManager.repository.ExperienceRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExperienceService {
    private final ExperienceRepository experienceRepository;

    // public List<User> searchByUserName(String userName) {
      
    // }
}
