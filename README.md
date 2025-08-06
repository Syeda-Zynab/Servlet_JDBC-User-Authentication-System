# Servlet & JDBC User Authentication System

This project is a **User Authentication System** built using **Java Servlets** and **JDBC**. It provides a simple way to register, login, and manage users in a web application, demonstrating core concepts of Java web development and database connectivity.

## Features

- **User Registration:** Create new accounts via a web form.
- **User Login:** Authenticate users with username and password.
- **Session Management:** Maintain user sessions securely.
- **Logout Functionality:** End user sessions safely.
- **Database Integration:** Store and retrieve user data using JDBC with a relational database (e.g., MySQL).
- **Form Validation:** Basic client-side and server-side validation.
- **Simple UI:** Built with HTML for ease of use and customization.

## Technologies Used

- **Java Servlets**
- **JDBC (Java Database Connectivity)**
- **HTML**
- **MySQL** (or another relational database; can be configured)
- **Tomcat** (or any Servlet container)

## How It Works

1. **User Registration:**
   - Users fill out a registration form.
   - The servlet receives the form data, validates it, and inserts a new user record into the database using JDBC.
   - If registration is successful, users can proceed to login.

2. **User Login:**
   - Users enter their credentials in the login form.
   - The servlet verifies the username and password by querying the database via JDBC.
   - On successful authentication, a session is created for the user.

3. **Session Management:**
   - Sessions are used to track logged-in users.
   - Protected areas of the application check for a valid session before granting access.

4. **Logout:**
   - Users can log out, which invalidates their session and redirects them to the login page.

5. **Database Operations:**
   - All user data and authentication checks are handled through secure JDBC queries.
   - The database typically includes a "users" table with fields for username, password, and other optional details.

6. **Front-End Interaction:**
   - HTML forms are used for registration, login, and navigation.
   - Error messages and success notifications are displayed based on servlet responses.

## Getting Started

### Prerequisites

- Java JDK 8 or higher
- Apache Tomcat server
- MySQL database (or compatible relational DB)
- Maven (optional, for dependency management)

### Setup Instructions

1. **Clone the repository:**
    ```bash
    git clone https://github.com/Syeda-Zynab/Servlet_JDBC-User-Authentication-System.git
    ```

2. **Configure the Database:**
    - Import the provided SQL script (if available) to create the users table.
    - Update your JDBC connection parameters in the source code (`DBConnection.java` or similar).

3. **Deploy to Tomcat:**
    - Build the project (use Maven or IDE).
    - Deploy the WAR file or project folder to Tomcat’s `webapps` directory.
    - Start Tomcat and access the app at `http://localhost:8080/Servlet_JDBC-User-Authentication-System`.

## Project Structure

```
src/
 ├── main/
 │    ├── java/
 │    │    └── ... (Servlets, JDBC code)
 │    └── webapp/
 │         ├── WEB-INF/
 │         │    └── web.xml
 │         └── ... (HTML pages)
```

## Customization

- Update UI in HTML files (`webapp/` directory).
- Change JDBC settings for different databases.
- Add additional fields for user registration as needed.

## Author

Developed by [Syeda-Zynab](https://github.com/Syeda-Zynab).
