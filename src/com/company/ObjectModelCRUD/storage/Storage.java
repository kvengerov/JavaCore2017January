package com.company.ObjectModelCRUD.storage;

import com.company.ObjectModelCRUD.model.Resume;

import java.util.List;

/**
 * Created by Stas on 10.02.2017.
 */
public interface Storage {
    //CRUD

    //create
    void save(Resume r);
    void delete(String uuid);
    //read
    Resume get(String uuid);
    void update(Resume r);

    void clear();

    int size();

    Resume[] getAll();
}
