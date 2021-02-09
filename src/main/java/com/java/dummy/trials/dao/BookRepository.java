package com.java.dummy.trials.dao;

import com.java.dummy.trials.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
