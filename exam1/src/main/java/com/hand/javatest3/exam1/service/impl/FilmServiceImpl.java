package com.hand.javatest3.exam1.service.impl;

import com.hand.javatest3.exam1.mapper.FilmMapper;
import com.hand.javatest3.exam1.pojo.Film;
import com.hand.javatest3.exam1.service.FilmService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class FilmServiceImpl implements FilmService {
    @Resource
    FilmMapper filmMapper;
    @Transactional
    @Override
    public String add(Film film) {
        int res=filmMapper.insertSelective(film);
        String msg="失败";
        if(res>0){
            msg="成功";
        }
        return msg;
    }

    @Override
    public String update(Film film) {
        return null;
    }

    @Override
    public String delete(Integer id) {
        return null;
    }

    @Override
    public List<Film> select(Film film, int pageNum, int pageSize) {

        return null;
    }

    @Transactional
    @Override
    public String handExeception(Film film){
        int res=0;
        String msg="失败";

            res=filmMapper.insertSelective(film);
            if(res>0){
                msg="成功";
            }
            Boolean flag=true;
        if (flag) {
            throw new RuntimeException();
        }

        return msg;
    }

    @Override
    public List<Film> selectAll() {
        return filmMapper.select();
    }
}
