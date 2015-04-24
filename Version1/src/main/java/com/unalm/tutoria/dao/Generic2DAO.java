package com.unalm.tutoria.dao;

import java.util.List;

public interface Generic2DAO<T> {

    public List<T> list();

    public T get(Long t);

    public void save(T t);

    public void update(T t);

    public void delete(Integer t); 

}
