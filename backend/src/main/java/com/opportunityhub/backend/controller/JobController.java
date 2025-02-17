package com.opportunityhub.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class JobController {

    @GetMapping("/api/jobs")
    public String[] getJobs() {
        // Replace this with actual job data or database query logic
        return new String[] {"Software Developer", "Data Scientist", "Web Developer"};
    }
}
