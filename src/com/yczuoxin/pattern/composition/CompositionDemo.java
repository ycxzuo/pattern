package com.yczuoxin.pattern.composition;

public class CompositionDemo {

    public static void main(String[] args) {
        Directory directory1 = new Directory("chapter1");
        Document document11 = new Document("session11");
        Document document12 = new Document("session12");

        Directory directory2 = new Directory("chapter2");
        Directory directory21 = new Directory("branch21");
        Directory directory22 = new Directory("branch22");
        Document document211 = new Document("session211");
        Document document212 = new Document("session212");
        Document document221 = new Document("session221");

        Directory root = new Directory("root");
        root.add(directory1);
        directory1.add(document11);
        directory1.add(document12);
        root.add(directory2);
        directory2.add(directory21);
        directory2.add(directory22);

        directory21.add(document211);
        directory21.add(document212);

        directory22.add(document221);

        getTree(root);
    }

    private static void getTree(File file) {
        file.printName();
        if (file instanceof Directory) {
            Directory directory = (Directory) file;
            for (File file1 : directory.getFileList()) {
                getTree(file1);
            }
        }
    }

}
