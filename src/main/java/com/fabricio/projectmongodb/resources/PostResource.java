package com.fabricio.projectmongodb.resources;

import com.fabricio.projectmongodb.domain.Post;
import com.fabricio.projectmongodb.domain.User;
import com.fabricio.projectmongodb.dto.UserDTO;
import com.fabricio.projectmongodb.resources.util.URL;
import com.fabricio.projectmongodb.services.PostService;
import com.fabricio.projectmongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

   @GetMapping(value = "/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
       text = URL.decodeParam(text);
       List<Post> list = service.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }

}
