package com.yczuoxin.pattern.composition;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {

    private final List<File> fileList = new ArrayList<>();

    private final String name;

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    public void add(File file) {
        fileList.add(file);
    }

    public List<File> getFileList() {
        return fileList;
    }
}
