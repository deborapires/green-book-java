package com.olxbr.greenbook;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/green-book")
public class Controller {
    @GetMapping("/book")
    public  ResponseEntity<List<String>> getBook() {
        return ResponseEntity.ok(List.of("book1", "book2"));
    }
}
