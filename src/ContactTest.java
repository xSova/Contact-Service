import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ContactTest {
    Contact testContact = null;
    @BeforeEach
    public void setUp() {
        Contact testContact = new Contact("123", "FirstName", "LastName", "111-111-1111", "123 Test St.");
    }


}
