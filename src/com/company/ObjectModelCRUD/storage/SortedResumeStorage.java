package com.company.ObjectModelCRUD.storage;

import com.company.ObjectModelCRUD.model.Resume;

import java.util.Arrays;

/**
 * Created by Stas on 10.02.2017.
 */
public class SortedResumeStorage extends AbstractResumeStorage {

    @Override
    public int getIndex(String uuid) {
        Resume searchKey = new Resume(uuid);
        return Arrays.binarySearch(storage, 0, size, searchKey);
    }


    @Override
    public void save(Resume r) {
        int index = getIndex(r.getUuid());
        if (index >= 0) {
            System.out.println("Sorry, i can't save! Resume " + r.getUuid() + " already exist!");
        } else if (isOverflow()) {
            System.out.println("Sorry, i can't save new resume. storage is full!");
        } else {
            int insertIdx = -index - 1;
            System.arraycopy(storage, insertIdx, storage, insertIdx + 1, size - insertIdx);
            storage[insertIdx] = r;
            size++;
        }

    }





}
