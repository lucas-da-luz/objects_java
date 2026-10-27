package object.Q3;

import java.util.Scanner;

public class book {
    public String title, author;
    public int pages;

    public String readTitle(Scanner scan) {
        System.out.println("Insert book name:");
        title = scan.nextLine();
        return title;
    }

    public String readAuthor(Scanner scan) {
        System.out.println("Insert author name:");
        author = scan.nextLine();
        return author;
    }

    public int readPages(Scanner scan) {
        System.out.println("Insert number of pages:");
        pages = scan.nextInt();
        scan.nextLine();
        return pages;
    }
}