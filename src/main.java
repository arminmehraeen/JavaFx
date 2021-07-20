import Controller.LoginViewController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        LoginViewController loginViewController = new LoginViewController();
        Scene scene = new Scene(loginViewController.getLoginView());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
