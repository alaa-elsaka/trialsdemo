package com.java.dummy.trials.dao;

import com.java.dummy.trials.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
