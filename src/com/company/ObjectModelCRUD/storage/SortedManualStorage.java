package com.company.ObjectModelCRUD.storage;

import com.company.ObjectModelCRUD.model.Resume;

/**
 * Created by Stas on 12.02.2017.
 */
public class SortedManualStorage extends AbstractResumeStorage {

    @Override
    public int getIndex(String uuid) {
        int insertKey = Integer.parseInt(uuid);
        if (size == 0)
            return 0;
        int lowerBound = 0;
        int upperBound = size - 1;
        int curIn;
        while (true) {
            curIn = (upperBound + lowerBound) / 2;
            if(Integer.parseInt(storage[curIn].getUuid()) == insertKey)
                return -curIn;
            if (Integer.parseInt(storage[curIn].getUuid()) < insertKey) {
                lowerBound = curIn + 1; // its in the upper
                if (lowerBound > upperBound) {
                    return curIn + 1;
                }
            } else {
                upperBound = curIn - 1; // its in the lower
                if (lowerBound > upperBound) {
                    return curIn;
                }
            }
        }
    }

    @Override
    public void save(Resume r) {
        int index = getIndex(r.getUuid());
        if (index < 0) {
            System.out.println("Sorry, i can't save! Resume " + r.getUuid() + " already exist!");
        } else if (isOverflow()) {
            System.out.println("Sorry, i can't save new resume. storage is full!");
        } else {
            System.out.println(index);
            System.arraycopy(storage, index, storage, index + 1, size - index);
            storage[index] = r;
            size++;
        }
    }

//проверка на integer
//    private boolean isInteger(String testString) {
//        return testString.matches("[1-9][0-9]{0,4}");
//    }

}
