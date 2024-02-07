package edu.iu.lvanjelg.ducksservice.controllers;

import edu.iu.lvanjelg.ducksservice.repository.DucksRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/ducks")
public class DucksController {
    private DucksRepository ducksRepository;
    public DucksController(DucksRepository ducksRepository){
        this.ducksRepository = ducksRepository;
    }
    @PostMapping("/ducks/{id}/image")
    public boolean uploadImage(@PathVariable int id, @RequestParam MultipartFile file){
        try {
            return ducksRepository.uploadImage(id,file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/ducks/{id}/image")
    public ResponseEntity<?> getImage(@PathVariable int id){
        byte[] image = new byte[0];
        try {
            image = ducksRepository.downloadImage(id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.status(HttpStatus.FOUND).contentType(MediaType.IMAGE_PNG).body(image);
    }

}
