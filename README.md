# NumbrVault

NumbrVault is a secure and efficient contact management system that ensures your contacts are always accessible, even if your phone is lost or not working. With NumbrVault, you can easily retrieve your contacts by logging into your account on our website.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them:

- JDK 1.8 or later
- Maven 3.2+
- Your preferred IDE (Eclipse, IntelliJ, etc.)

### Installing

To work with the NumbrVault project hosted on GitHub, follow these steps:

Certainly! To run a Spring Boot project from the given GitHub repository using IntelliJ IDEA or Spring Tool Suite (STS) with JDK 21, follow these steps:

1. **Clone the Repository**:
   - Open your terminal or Git Bash.
   - Navigate to the directory where you want to clone the project.
   - Run the following command to clone the repository:
     ```bash
     git clone https://github.com/Jeet-Codes/NumbrVault.git
     ```
   - This will create a local copy of the project on your machine.

2. **Open the Project in IntelliJ IDEA or STS**:
   - Open IntelliJ IDEA or Spring Tool Suite.
   - Click on **File** > **Open** and select the cloned project directory (`NumbrVault`).

3. **Configure JDK 21**:
   - Make sure you have JDK 21 installed on your system.
   - In IntelliJ IDEA:
     - Go to **File** > **Project Structure**.
     - Under **Project**, set the **Project SDK** to JDK 21.
   - In STS:
     - Go to **Window** > **Preferences** > **Java** > **Installed JREs**.
     - Add JDK 21 if it's not already listed.

4. **Build and Run the Application**:
   - In IntelliJ IDEA:
     - Open the `NumbrVaultApplication.java` file (usually located under `src/main/java/com/scm/NumbrVault`).
     - Right-click on the class and select **Run 'NumbrVaultApplication'**.
     - The Spring Boot application will start, and you can access it in your browser at [http://localhost:8080](http://localhost:8080).
   - In STS:
     - Similar to IntelliJ IDEA, locate the `NumbrVaultApplication.java` file and run it.
     - Access the application at [http://localhost:8080](http://localhost:8080).

5. **Explore and Modify**:
   - You're all set! Now you can explore the code, make changes, and see live updates in your browser.
   - The project structure includes components, controllers, services, and other Spring-related files.

6. **Build for Production**:
   - When you're ready to deploy your app, create a production build:
     - In IntelliJ IDEA, build an executable JAR by running the following command in the terminal:
       ```bash
       mvn clean package
       ```
     - In STS, you can also use Maven to build the project.

## Running the tests

Explain how to run the automated tests for this system:

```bash
mvn test
```

## Deployment

Add additional notes about how to deploy this on a live system.

## Contributing

Please read [CONTRIBUTING.md](https://github.com/Jeet-Codes/NumbrVault/CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/Jeet-Codes/NumbrVault/tags).

## Authors

* **Sandeep Kumar** - *Initial work* - [Jeet-Codes](https://github.com/Jeet-Codes)

See also the list of [contributors](https://github.com/yourusername/NumbrVault/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
