package com.hand.javatest3.exam1.service;

import com.hand.javatest3.exam1.pojo.Film;

public interface FilmService extends  AllService<Film>{
       public String handExeception(Film film) throws Exception;
}
