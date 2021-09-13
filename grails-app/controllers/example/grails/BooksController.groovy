package example.grails

import org.springframework.beans.factory.annotation.Autowired

class BooksController {

    BooksService booksService

    @Autowired
    BooksFetcher booksFetcher

    def grails() {
        [book: booksService.find()]
    }

    def micronaut() {
        [book: booksFetcher.find()]
    }
}