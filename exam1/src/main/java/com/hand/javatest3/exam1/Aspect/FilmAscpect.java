package com.hand.javatest3.exam1.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class FilmAscpect {
    private  static  final Logger log=LoggerFactory.getLogger(FilmAscpect.class);

    @Pointcut("execution(public * com.hand.javatest3.exam1.*.*(..))")
    public void print() {

    }
    @Before("print()")
    public void BeforeInsertFilmEven(JoinPoint joinPoint){
        log.info("BeforeInsertFilmData");

    }
    @After("print()")
    public void AfterInsertFilmEven(JoinPoint joinPoint){
        log.info("AfterInsertFilmData");
    }


}
