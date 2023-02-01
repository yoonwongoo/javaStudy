package main.java.designPattern.bridge;

public class Main {

    public static void main(String[] args) {
        String[] content ={"asdasd","123123","@#$!#$"};
        String title="제목";
        String author="작성자";
        String publish="출판사";
        Draft draft = new Draft(title,author,content);

        Display display = new SimpleDisplay();
        draft.print(display);

        Publisher publisher = new Publisher(title,author,content,publish);
        publisher.print(display);
    }
}
