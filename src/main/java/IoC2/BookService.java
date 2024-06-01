package IoC2;

import org.springframework.beans.factory.annotation.Autowired;

public class BookService {

    @Autowired
    public BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

}
