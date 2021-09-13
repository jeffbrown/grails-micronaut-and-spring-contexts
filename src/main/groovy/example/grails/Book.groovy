package example.grails

import groovy.transform.Canonical
import groovy.transform.CompileStatic

@Canonical
@CompileStatic
class Book {
    String isbn
    String name
}
