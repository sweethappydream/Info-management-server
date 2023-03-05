package infoManager.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import infoManager.dto.ExperienceResponseDataDTO;
import infoManager.model.Experience;
import infoManager.repository.ExperienceRepository;
import infoManager.service.ExperienceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/experience")
@Api(tags = "experience")
@RequiredArgsConstructor
public class ExperienceController {

    // ExperienceRepository experienceRepository;
    private final ExperienceService experienceService;

    @GetMapping
    @ApiOperation(value = "Find All by username", authorizations = { @Authorization(value="apiKey") })
    public List<ExperienceResponseDataDTO> findAllByUserName(@ApiParam("Username") @RequestParam String username) {
        List<Experience> experiencesList = new ArrayList<Experience>();
        List<ExperienceResponseDataDTO> experiencesResponseList = new ArrayList<ExperienceResponseDataDTO>();
        if(username != "") {
            experiencesList = experienceService.findAllByUserName(username);
        } else {
            experiencesList = experienceService.findAll();
        }

        System.out.println(experiencesList);
        for(Experience experience : experiencesList) {
            ExperienceResponseDataDTO experienceResponseDataDTO = new ExperienceResponseDataDTO();
            experienceResponseDataDTO.setContent(experience.getContent());
            experienceResponseDataDTO.setDate(experience.getDate());
            experienceResponseDataDTO.setId(experience.getId());
            experienceResponseDataDTO.setTopic(experience.getTopic());
            System.out.println("experiencesList");

            experienceResponseDataDTO.setUsername(experience.getUser().getUsername());
            experiencesResponseList.add(experienceResponseDataDTO);
        }

        return experiencesResponseList;
    }
    // private final 
}
