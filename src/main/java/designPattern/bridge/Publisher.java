package main.java.designPattern.bridge;

public class Publisher extends Draft {

    private String publisher;

    public Publisher(String title, String author, String[] content,String publisher) {
        super(title, author, content);
        this.publisher =publisher;
    }

    public void publisherInfoPrint(){

        System.out.println(this.publisher);
    }

    public void print(Display display){
        super.print(display);
        publisherInfoPrint();
    }
}
