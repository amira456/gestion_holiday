package defau;

import Controller.MainController;
import java.sql.Connection;
import java.sql.DriverManager;

public class main {

    public static void main(String[] args) {
        try {
            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/amira"; // Update with your database URL
            String username = "root"; // Update with your DB username
            String password = ""; // Update with your DB password

            Connection connection = DriverManager.getConnection(url, username, password);

            // Initialize the main controller with the database connection
            MainController mainController = new MainController(connection);

            // Start the application by displaying the login view
            mainController.startApplication();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to connect to the database.");
        }
    }
}
