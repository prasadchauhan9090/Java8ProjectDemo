package lambdademo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {


    public List<Book> getBooksinSort() {
        List<Book> book = new BookDAO().getBooks();
        Collections.sort(book, (o1, o2) -> o2.getName().compareTo(o1.getName()));

        return book;

}
//        @Override
//        public int compare(Book o1, Book o2) {
//            return o1.getName().compareTo(o2.getName());

    public static void main(String args[])
    {
       System.out.println(new BookService().getBooksinSort());

       List<Book> book = new BookService().getBooksinSort();
       for (Book book1 : book) {

           System.out.println(book1.getName());
       }
    }
}


//class MyComparator implements Comparator<Book> {
//
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
