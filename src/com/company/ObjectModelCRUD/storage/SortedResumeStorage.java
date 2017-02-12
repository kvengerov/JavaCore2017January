package com.company.ObjectModelCRUD.storage;

import com.company.ObjectModelCRUD.model.Resume;

import java.util.Arrays;

/**
 * Created by Stas on 10.02.2017.
 */
public class SortedResumeStorage extends AbstractResumeStorage {

    //    @Override
//    public int getIndex(String uuid) {
//        if (!isInteger(uuid)) {
//            return -1;
//        }
//        int insertKey = Integer.parseInt(uuid);
//        if (size == 0)
//            return 0;
//        int lowerBound = 0;
//        int upperBound = size - 1;
//        int curIn;
//        while (true) {
//            curIn = (upperBound + lowerBound) / 2;
//            if (Integer.parseInt(storage[curIn].getUuid()) < insertKey) {
//                lowerBound = curIn + 1; // its in the upper
//                if (lowerBound > upperBound)
//                    return curIn + 1;
//            } else {
//                upperBound = curIn - 1; // its in the lower
//                if (lowerBound > upperBound)
//                    return curIn;
//            }
//        }
//    }
    //проверка на integer
//    private boolean isInteger(String testString) {
//        return testString.matches("[1-9][0-9]{0,4}");
//    }

    @Override
    public void save(Resume r) {
        int index = getIndex(r.getUuid());
        if (index >= 0) {
            System.out.println("Sorry, i can't save! Resume " + r.getUuid() + " already exist!");
        } else if (isFull()) {
            System.out.println("Sorry, i can't save new resume. storage is full!");
        } else {
            int insertIdx = -index - 1;
            System.arraycopy(storage, insertIdx, storage, insertIdx + 1, size - insertIdx);
            storage[insertIdx] = r;
            size++;
        }

    }

    @Override
    public int getIndex(String uuid) {
        Resume searchKey = new Resume(uuid);
        System.out.println(Arrays.binarySearch(storage, 0, size, searchKey));
        return Arrays.binarySearch(storage, 0, size, searchKey);
    }

}
