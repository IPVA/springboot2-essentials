package learning.springboot.controller;


import learning.springboot.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {


    @GetMapping(path = "list")
    public List<Anime> list() {
        return List.of(new Anime("Naruto"), new Anime("DBZ"), new Anime("Death Note"));

    }


}