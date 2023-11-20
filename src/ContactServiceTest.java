import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
     ContactService contactService = new ContactService();

     @Test
     public void testAddInvalidContactId() {
          contactService.addContact("123", "FirstName", "LastName", "1111111111", "123 Test St.");
          Assertions.assertThrows(IllegalArgumentException.class, () -> {
               contactService.addContact("123", "FirstName", "LastName", "1111111111", "123 Test St.");
          });
     }
}
