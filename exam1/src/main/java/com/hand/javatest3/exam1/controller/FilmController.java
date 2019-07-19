package com.hand.javatest3.exam1.controller;

import com.hand.javatest3.exam1.pojo.Film;
import com.hand.javatest3.exam1.service.FilmService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FilmController {
    @Resource
    FilmService filmService;
     @GetMapping("/getDate")
     public List<Film> get(){
         return  filmService.selectAll();
     }
}
