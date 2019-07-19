package com.hand.javatest3.exam1.mapper;

import com.hand.javatest3.exam1.pojo.Film;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FilmMapper {
    int deleteByPrimaryKey(Short filmId);

    int insert(Film record);

    int insertSelective(Film record);

    Film selectByPrimaryKey(Short filmId);

    int updateByPrimaryKeySelective(Film record);

    int updateByPrimaryKeyWithBLOBs(Film record);

    int updateByPrimaryKey(Film record);

    List<Film> select();
}