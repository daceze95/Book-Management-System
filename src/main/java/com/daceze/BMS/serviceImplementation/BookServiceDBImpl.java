package com.daceze.BMS.serviceImplementation;

import com.daceze.BMS.autoIDGen.IDGEN;
import com.daceze.BMS.model.Book;
import com.daceze.BMS.repository.BookServicePsqlDB;
import com.daceze.BMS.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DB")
public class BookServiceDBImpl implements BookService {

    private BookServicePsqlDB bookServicePsqlDB;

    public BookServiceDBImpl(BookServicePsqlDB bookServicePsqlDB) {
        this.bookServicePsqlDB = bookServicePsqlDB;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookServicePsqlDB.findAll();
    }

    @Override
    public String addBook(Book b) {
        if(b.getId() == null || b.getId().isEmpty()){
            b.setId(new IDGEN().idAuth());
        }
         bookServicePsqlDB.save(b);
         return "Book added successfully!";
    }

    @Override
    public Book updateBook(Book b) {
        return null;
    }

    @Override
    public String deleteBook(String id) {
         bookServicePsqlDB.deleteById(id);
         return "Deleted successfully!";
    }

    @Override
    public String giveReview() {
        return null;
    }

    @Override
    public String clearDB() {
        return null;
    }
}
