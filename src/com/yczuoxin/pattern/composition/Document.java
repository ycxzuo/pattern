package com.yczuoxin.pattern.composition;

public class Document extends File {

    private final String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void printName() {
        System.out.println(content);
    }
}
