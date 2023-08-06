package com.daceze.BMS.repository;

import com.daceze.BMS.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookServicePsqlDB extends JpaRepository<Book, String> {

}
