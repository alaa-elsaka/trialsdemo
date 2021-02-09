package com.java.dummy.trials.bootstrap;

import com.java.dummy.trials.dao.AuthorReopository;
import com.java.dummy.trials.dao.BookRepository;
import com.java.dummy.trials.dao.PublisherRepository;
import com.java.dummy.trials.model.Author;
import com.java.dummy.trials.model.Book;
import com.java.dummy.trials.model.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorReopository authorReopository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;


    public BootstrapData(AuthorReopository authorReopository, BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorReopository = authorReopository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Publisher dar =  new Publisher("stree","Cairo","Cairo",12345);

        publisherRepository.save(dar);
        Author alaa = new Author("Alaa", "Elsaka");
        Book thesis = new Book("Computer Vision","123456");
        alaa.getBooks().add(thesis);
        thesis.getAuthors().add(alaa);
        thesis.setPublisher(dar);
        dar.getBooks().add(thesis);

        authorReopository.save(alaa);
        bookRepository.save(thesis);
        publisherRepository.save(dar);

        Author Ahmed = new Author("Ahmed", "Elsaka");
        Book kitab = new Book("Kitab","761236");
        Ahmed.getBooks().add(kitab);
        kitab.getAuthors().add(Ahmed);
        kitab.setPublisher(dar);
        dar.getBooks().add(kitab);

        authorReopository.save(Ahmed);
        bookRepository.save(kitab);


        publisherRepository.save(dar);
        System.out.println("Started adding data ---> Bootstrap");
        System.out.println("Number of Books # " + bookRepository.count());
        System.out.println("Number of Publishers # " + dar.getBooks().size());

    }
}
