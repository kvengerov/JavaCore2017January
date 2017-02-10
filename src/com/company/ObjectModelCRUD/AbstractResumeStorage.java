package com.company.ObjectModelCRUD;

/**
 * Created by Stas on 10.02.2017.
 */
public abstract class AbstractResumeStorage  implements Storage{
    protected static final int STORAGE_LIMIT = 10000;

    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size = 0;

    public int size() {
        return size;
    }


    @Override
    public void save(Resume r) {
        int index = getIndex(r.getUuid());
        if (index >= 0) {
            System.out.println("Sorry, i can't save! Resume " + r.getUuid() + " already exist!");
        } else if (isFull()) {
            System.out.println("Sorry, i can't save new resume. storage is full!");
        } else {
           storage[size++] = r;
        }

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


    protected  boolean isFull(){
        if(size >= (STORAGE_LIMIT-1))
            return true;
        else
            return false;

    }


}
