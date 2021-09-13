package example.grails

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BooksFetcher {

    @Inject
    BooksService booksService

    Book find() {
        booksService.find()
    }
}
