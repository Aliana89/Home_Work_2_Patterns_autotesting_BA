import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertNotNull;

//тут название файла ParameterizedTest отличается от названия класса ParameterizedTests
class ParameterizedTests {

    @ParameterizedTest
    @ValueSource(strings = {"Doc1", "Doc2", "Doc3"})
    void testDocumentCreation(String documentName) {
        Document document = new Document(documentName);
        assertNotNull(document);
    }
}
