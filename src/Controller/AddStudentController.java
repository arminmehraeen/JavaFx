package Controller;

import Model.Student;
import View.AddStudentView;
import javafx.stage.Stage;

public class AddStudentController {

    private AddStudentView addStudentView;

    public AddStudentController(InterFace interFace){
        addStudentView = new AddStudentView();
        addStudentView.getCancelBtn().setOnAction(event -> {
            addStudentView.getScene().getWindow().hide();
        });
        addStudentView.getSaveBtn().setOnAction(event -> {
            String id = addStudentView.getIdField().getText().toString().trim();
            String name = addStudentView.getNameField().getText().toString().trim();
            String lastName = addStudentView.getLastNameField().getText().toString().trim();
            interFace.addStudent(new Student(id,name,lastName));
            clean();
        });
    }

    private void clean() {
        addStudentView.getIdField().setText("");
        addStudentView.getNameField().setText("");
        addStudentView.getLastNameField().setText("");
    }

    public AddStudentView getAddStudentView() {
        return addStudentView;
    }
}
