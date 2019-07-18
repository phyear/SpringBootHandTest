package com.hand.javatest3.exam1.service;

import java.util.List;

public interface AllService<T> {

    public String add(T t);

    public String  update(T t);

    public String  delete(Integer id);

    public List<T> select(T t, int pageNum, int pageSize);
}
