package com.vyberide.controllers;

import com.vyberide.database.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private Button loginButton;

    @FXML
    private void handleLogin(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();

        // 🧠 Step 1: Validate input fields
        if (email.isEmpty() || password.isEmpty()) {
            errorLabel.setText("⚠ Please fill in all fields.");
            return;
        }

        // 🧠 Step 2: Attempt DB connection
        try (Connection connection = DatabaseConnection.getConnection()) {
            if (connection == null) {
                errorLabel.setText("❌ Database connection failed!");
                return;
            }

            // 🧠 Step 3: Query the database for user
            String query = "SELECT * FROM users WHERE email = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // ✅ Step 4: Successful login → Navigate to Dashboard
                navigateToDashboard(event);
            } else {
                // ❌ Invalid credentials
                errorLabel.setText("Invalid email or password!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            errorLabel.setText("Database error occurred.");
        } catch (IOException e) {
            e.printStackTrace();
            errorLabel.setText("Error loading dashboard.");
        }
    }

    // ✅ Navigation method
    private void navigateToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Vybe Ride - Dashboard");
        stage.show();
    }

    // ✅ Signup navigation (if user clicks “Sign up” link)
    @FXML
    private void goToSignup(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/signup.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Vybe Ride - Signup");
        stage.show();
    }
}
