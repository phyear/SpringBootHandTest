package com.hand.javatest3.exam1;

import com.hand.javatest3.exam1.pojo.Film;
import com.hand.javatest3.exam1.service.FilmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest

public class Exam1ApplicationTests {
     @Autowired
     Film film;


    @Test
    public void contextLoads() {

        System.out.println(film);
    }
//    @Test
//    public void execpetion() throws Exception {
//
//        System.out.println(filmService.handExeception(film));
//    }
}
