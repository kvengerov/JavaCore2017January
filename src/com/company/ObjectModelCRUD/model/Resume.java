package com.company.ObjectModelCRUD.model;

/**
 * Created by Stas on 10.02.2017.
 */
public class Resume  implements Comparable<Resume> {
    // Unique identifier
    private String uuid;
//    private String name;
//    private String age;
//    private String sex;


    public Resume(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }


    @Override
    public int compareTo(Resume o) {
        return uuid.compareTo(o.uuid);
    }

}
