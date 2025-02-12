# Number Analyzer Servlet

## Overview
This Java Servlet-based web application allows users to check whether a given number is:
- Prime
- Palindrome
- Armstrong
- Perfect

Users enter a number in an HTML form, select an operation, and receive the result dynamically.

---

## Technologies Used
- Java (Servlets)
- HTML, CSS (Frontend)
- Jakarta Servlet API
- Bootstrap (for UI enhancement)
- Apache Tomcat (Server)

---

## Project Structure
```
Number-Analyzer-Servlet/
│── src/
│   ├── operations/
│   │   ├── Choice.java
│   │   ├── PrimeNumber.java
│   │   ├── Palindrome.java
│   │   ├── Armstrong.java
│   │   ├── PerfectNumber.java
│── WebContent/
│   ├── input.html
│   ├── web.xml
│── README.md
│── pom.xml (if using Maven)
```

---

## Setup Instructions
### Prerequisites
- Install JDK (Java Development Kit)
- Install Apache Tomcat (Servlet Container)
- Install an IDE (Eclipse/IntelliJ) with Servlet support

### Steps to Run the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/milind1314/Servlet-Number-Checker.git
   ```
2. Open the project in your IDE.
3. Configure the project with Apache Tomcat.
4. Deploy the project and start the server.
5. Open `http://localhost:8080/Number-Analyzer-Servlet/input.html` in a browser.
6. Enter a number, choose an operation, and check the result.

---

## Usage
1. Enter a number in the text input field.
2. Click on one of the buttons (Prime, Palindrome, Armstrong, Perfect).
3. The servlet processes the input and returns the result on a new page.

---

## Example Outputs
### Prime Number Check
```
7 is a Prime number.
```

### Armstrong Number Check
```
153 is an Armstrong number.
```

### Palindrome Number Check
```
121 is a Palindrome number.
```

### Perfect Number Check
```
28 is a Perfect number.
```

---

## Future Enhancements
- Add more number properties (e.g., Fibonacci, Even/Odd check)
- Improve UI with better styling and animations
- Convert the application to a REST API for integration with other platforms

---

## License
This project is open-source and available under the [MIT License](LICENSE).

