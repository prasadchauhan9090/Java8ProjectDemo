package lambdademo;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {


    public List<Book> getBooks() {

        List<Book> books = new ArrayList<>();

        books.add(new Book(101,"CORE JAVA",400));
        books.add(new Book(102,"SPRING BOOT",500));
        books.add(new Book(103,"MICROSERVICES",600));
        books.add(new Book(104,"WEBSERVICE",700));

        return books;



    }
}
