package org.bundle.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ReportController {

    @GetMapping("/report")
    public ResponseEntity<String> getSpeakers(){
        return new ResponseEntity<>("Done", HttpStatus.OK);
    }


}
