package Controller;

import View.LoginView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginViewController {

    private LoginView loginView;
    public LoginViewController() {
        loginView = new LoginView();
        loginView.getButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String userName = loginView.getUserNameField().getText().toString().trim();
                String password = loginView.getPasswordField().getText().toString().trim();
                if (userName.isEmpty() || password.isEmpty()) {
                    loginView.getResult().setText("Please fill all inputs.");
                    loginView.getResult().setTextFill(Color.ORANGE);
                } else if (userName.equals("armin") && password.equals("1234")) {
                    MainViewController mainViewController = new MainViewController();
                    loginView.getScene().getWindow().hide();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(mainViewController.getMainView()));
                    stage.show();

                } else {
                    loginView.getResult().setText("Login unsuccessfully.");
                    loginView.getResult().setTextFill(Color.RED);
                }
            }
        });
    }

    public LoginView getLoginView() {
        return loginView;
    }
}
