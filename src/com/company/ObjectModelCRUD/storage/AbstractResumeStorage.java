package com.company.ObjectModelCRUD.storage;

import com.company.ObjectModelCRUD.model.Resume;

/**
 * Created by Stas on 10.02.2017.
 */
public abstract class AbstractResumeStorage implements Storage{
    protected static final int STORAGE_LIMIT = 10000;

    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size = 0;

    public int size() {
        return size;
    }

    @Override
    public void delete(String uuid) {
    }

    @Override
    public Resume get(String uuid) {
        return null;
    }

    @Override
    public void update(Resume r) {

    }

    protected abstract int getIndex(String uuid);

    protected  boolean isOverflow(){
        if(size >= (STORAGE_LIMIT-1))
            return true;
        else
            return false;
    }

    @Override
    public void clear(){
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
    }

    @Override
    public Resume[] getAll(){
        Resume[] resumes = new Resume[size];
        for (int i = 0; i < size; i++) {
            resumes[i] = storage[i];
        }
        return resumes;
    }



}
