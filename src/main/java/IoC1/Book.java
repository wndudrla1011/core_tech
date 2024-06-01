package IoC1;

import lombok.Getter;

import java.util.Date;

@Getter
public class Book {

    private Long id;

    private String name;

    private String writer;

    private Date created;

    private BookStatus bookStatus;

    public void changeDate(Date created) {
        this.created = created;
    }

    public void changeStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

}
