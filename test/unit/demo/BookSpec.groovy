package demo

import grails.test.mixin.TestFor
import grails.test.mixin.web.ControllerUnitTestMixin
import spock.lang.Specification

@TestFor(Book)
@TestMixin(ControllerUnitTestMixin)
class BookSpec extends Specification {

    void "test blank title binding"() {
        when: 'an empty string is assigned to the title during data binding'
        def book = new Book(title: '  ')

        then: 'the empty string survives binding'
        book.title == '  '

        and: 'validation passes'
        book.validate()
    }
}
