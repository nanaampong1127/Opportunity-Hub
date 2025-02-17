package com.opportunityhub.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @GetMapping
    public List<String> getJobs() {
        return List.of("Software Engineer", "Data Scientist", "Cybersecurity Analyst");
    }
}
