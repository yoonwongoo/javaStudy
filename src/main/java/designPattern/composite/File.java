package main.java.designPattern.composite;

public class File extends Unit{


    private int size;

    public File(String name, int size) {
        super(name);
        this.size= size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println("파일이름은::"+this.getName()+"---"+"파일 사이즈는::"+this.getSize());
    }
}
