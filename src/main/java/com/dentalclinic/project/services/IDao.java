package com.dentalclinic.project.services;

import java.util.List;

public interface IDao<T>{//Will centralize the CRUD methods

    T save(T t);
    List<T> searchAll();
    String exclude(Integer id);

}
