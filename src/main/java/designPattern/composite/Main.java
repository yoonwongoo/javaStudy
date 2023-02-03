package main.java.designPattern.composite;

public class Main {

    public static void main(String[] args) {
        Folder rootFolder = new Folder("root_folder");
        rootFolder.add(new File("a_txt",1000));
        rootFolder.add(new File("b_txt",2000));

        Folder sub1Folder = new Folder("sub1_folder");
        sub1Folder.add(new File("c_txt",4000));
        sub1Folder.add(new File("d_txt",3000));
        rootFolder.add(sub1Folder);

        rootFolder.print();
    }
}
