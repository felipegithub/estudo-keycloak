package com.example.cinema;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FilmesController {

    @GetMapping("/filme/{id}")
    public String filme(@PathVariable("id") String id) {
        return id;
    }

    @PostMapping("/filme")
    public ResponseEntity incluirFilme(@RequestBody Filme qualquer) {
        return ResponseEntity.ok(qualquer);
    }


}
