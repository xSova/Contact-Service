# TaskService

## Overview
The TaskService application is a Java-based solution designed to manage contact information. This application provides functionalities to add, update, and delete contact details. The service uses in-memory data structures for storage, making it fast and efficient for managing contact data.

## Features
- **Add Contacts:** Ability to add new contacts with unique identifiers.
- **Update Contacts:** Update specific contact details such as name, phone number, and address.
- **Delete Contacts:** Remove contacts from the service using their unique ID.

## How to Run
To run this application, you will need a Java Development Kit (JDK) installed. Follow these steps:
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Compile the Java files:
`javac Contact.java TaskService.java`
4. Run the application (if applicable).

## Testing
This project includes JUnit tests to ensure the application functions correctly. To run the tests:
1. Navigate to the test directory.
2. Execute the test files:
`java TaskTest.java`
`java TaskServiceTest.java`

## Contact Class
The Contact class represents individual contact entries with the following fields:
- **Contact ID** (required): Unique ID for the contact (max 10 characters).
- **First Name** (required): Contact's first name (max 10 characters).
- **Last Name** (required): Contact's last name (max 10 characters).
- **Phone Number** (required): 10-digit phone number.
- **Address** (required): Contact's address (max 30 characters).

## TaskService Class
The TaskService class manages the storage and manipulation of Contact objects. It allows:
- Adding new contacts.
- Deleting contacts by their ID.
- Updating contact fields using a map for flexible updates.

## Contribution
Contributions to this project are welcome. Please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes.
4. Push to the branch.
5. Create a Pull Request.