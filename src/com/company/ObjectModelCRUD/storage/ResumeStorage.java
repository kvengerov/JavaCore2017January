package com.company.ObjectModelCRUD.storage;

import com.company.ObjectModelCRUD.model.Resume;

/**
 * Created by Stas on 10.02.2017.
 */
public class ResumeStorage extends AbstractResumeStorage {

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

    public int getIndex(String uuid){
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if(storage[i].getUuid().equals(uuid))
                return i;
        }
        return index;
    }

//    @Override
//    public int getIndex(String uuid) {
//        Resume searchKey = new Resume(uuid);
//        return Arrays.binarySearch(storage, 0, size, searchKey);
//    }

}
