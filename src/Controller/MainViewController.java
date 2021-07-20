package Controller;

import Model.Student;
import View.MainView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainViewController implements InterFace {

    private MainView mainView;

    public MainViewController(){
        mainView = new MainView();
        mainView.getAddBtn().setOnAction(e->{
            AddStudentController addStudentController = new AddStudentController(this);
            Stage stage = new Stage();
            stage.setScene(new Scene(addStudentController.getAddStudentView()));
            stage.show();
        });
        mainView.getDeleteBtn().setOnAction(event -> {
            Student student = getMainView().getTableView().getSelectionModel().getSelectedItem();
            getMainView().getTableView().getItems().remove(student);
        });
        mainView.getExitBtn().setOnAction(event -> {
            getMainView().getScene().getWindow().hide();
            Stage stage = new Stage();
            stage.setScene(new Scene(new LoginViewController().getLoginView()));
            stage.show();
        });
    }

    public MainView getMainView() {
        return mainView;
    }

    @Override
    public void addStudent(Student student) {
        mainView.getTableView().getItems().add(student);
    }

}
