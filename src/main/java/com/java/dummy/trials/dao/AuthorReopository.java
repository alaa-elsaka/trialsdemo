package com.java.dummy.trials.dao;

import com.java.dummy.trials.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorReopository extends CrudRepository<Author, Long> {
}
