package example.grails

import javax.annotation.PostConstruct
import javax.inject.Singleton

@Singleton
class BooksService {

    Book book
    @PostConstruct
    void init() {
        this.book = new Book(UUID.randomUUID().toString(), "Building Microservices")
    }

    Book find() {
        return book
    }
}