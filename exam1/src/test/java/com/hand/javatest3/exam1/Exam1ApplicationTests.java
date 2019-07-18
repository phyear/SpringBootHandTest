package com.hand.javatest3.exam1;

import com.hand.javatest3.exam1.pojo.Film;
import com.hand.javatest3.exam1.pojo.Film2;
import com.hand.javatest3.exam1.service.FilmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import java.sql.SQLOutput;

@RunWith(SpringRunner.class)
@SpringBootTest

public class Exam1ApplicationTests {
     @Autowired
     Film film;
     @Resource
     FilmService filmService;
     @Autowired
     Film2 film2;
    @Test
    public void contextLoads() {

        System.out.println(filmService.add(film));
    }
    @Test
    public void execpetion() throws Exception {

        System.out.println(filmService.handExeception(film));
    }
}
