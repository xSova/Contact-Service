/*
    - The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
    - The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
    - The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
    - The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
    - The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
        */

public class Contact {

    private static final int maxLength = 10; // Maximum length of the strings
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private static final String id;

    // Constructor
    public Contact(String firstName, String lastName, String phone, String address) {

    }

    // Getters
    public String getAddress() { return address; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public String getId() { return id; }

    // Setters
    public void setFirstName(String firstName) {
        if (firstName != null && firstName.length() <= maxLength) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Error: Input invalid.");
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    // make something iterate and pass in requirements for max len and what is needed like phone numbers
    // loop for input until valid input is given

}
