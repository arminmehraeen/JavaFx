package View;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class LoginView extends VBox {

    private TextField userNameField;
    private PasswordField passwordField;
    private Label result;
    private Button button;

    public LoginView() {

        Label title = new Label("Login Form");
        title.setStyle("-fx-font: 20 arial;");
        title.setPadding(new Insets(10,10,10,10));

        userNameField = new TextField();
        userNameField.setPromptText("UserName");
        userNameField.setFocusTraversable(false);
        userNameField.setMaxWidth(150);

        passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setFocusTraversable(false);
        passwordField.setMaxWidth(150);

        result = new Label("");

        button = new Button("Login");

        this.getChildren().addAll(title,userNameField,passwordField,result,button);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
        this.setPadding(new Insets(30, 30, 30, 30));
    }

    public TextField getUserNameField() {
        return userNameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public Label getResult() {
        return result;
    }

    public Button getButton() {
        return button;
    }
}
